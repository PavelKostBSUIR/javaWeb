package by.bsuir.kostukevich.service.impl;

import by.bsuir.kostukevich.dao.ApplianceDAO;
import by.bsuir.kostukevich.dao.impl.ApplianceDAOImpl;
import by.bsuir.kostukevich.entity.Appliance;
import by.bsuir.kostukevich.entity.Oven;
import by.bsuir.kostukevich.entity.criteria.Criteria;
import by.bsuir.kostukevich.service.ApplianceService;
import by.bsuir.kostukevich.service.validation.Validator;
import by.bsuir.kostukevich.xmlService.ApplianceStream;
import by.bsuir.kostukevich.xmlService.JAXBSerializer;

import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Oven> findAllOvens(File file) throws XPathExpressionException {
        Criteria criteria = new Criteria(new String[]{"oven"});
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }
        ApplianceDAO applianceDAO = new ApplianceDAOImpl(new JAXBSerializer(file.getPath()));
        ApplianceStream applianceStream = applianceDAO.find(criteria);
        List<Oven> ovens = new ArrayList<>();
        while (applianceStream.hasNext()) {
            ovens.add((Oven) applianceStream.next());
        }
        return ovens;
    }

    @Override
    public Appliance getCheapestProduct(File file) throws XPathExpressionException {
        Criteria criteria = new Criteria(new String[]{"oven", "laptop", "refrigerator", "speakers", "vacuumCleaner", "tabletPC"});
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }
        ApplianceDAO applianceDAO = new ApplianceDAOImpl(new JAXBSerializer(file.getPath()));
        ApplianceStream applianceStream = applianceDAO.find(criteria);

        if (applianceStream.hasNext()) {
            Appliance appliance = applianceStream.next();
            int min_price = (int) appliance.getProperties().get("PRICE");
            while (applianceStream.hasNext()) {
                Appliance temp_appliance = applianceStream.next();
                if (min_price > (int) temp_appliance.getProperties().get("PRICE")) {
                    min_price = (int) temp_appliance.getProperties().get("PRICE");
                    appliance = temp_appliance;
                }
            }
            return appliance;
        } else {
            return null;
        }
    }

    @Override
    public List<Appliance> find(Criteria criteria, File file) throws XPathExpressionException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }
        List<Appliance> appliances = new ArrayList<>();
        ApplianceDAO applianceDAO = new ApplianceDAOImpl(new JAXBSerializer(file.getPath()));
        ApplianceStream applianceStream = applianceDAO.find(criteria);
        if (applianceStream.hasNext()) {
            appliances.add(applianceStream.next());
        }
        return appliances;
    }
}
