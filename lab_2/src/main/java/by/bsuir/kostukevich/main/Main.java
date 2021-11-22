package by.bsuir.kostukevich.main;

import static by.bsuir.kostukevich.entity.criteria.SearchCriteria.*;

import by.bsuir.kostukevich.entity.Appliance;
import by.bsuir.kostukevich.entity.criteria.Criteria;
import by.bsuir.kostukevich.service.ApplianceService;
import by.bsuir.kostukevich.service.ServiceFactory;

import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Criteria criteriaOven = new Criteria(new String[]{Oven.class.getSimpleName().toLowerCase()});//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 3);

        System.out.println("All ovens with CAPACITY == 3:");
        try {
            PrintApplianceInfo.print(service.find(criteriaOven, new File("file.xml")));
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Cheapest appliance:");
        try {
            PrintApplianceInfo.print(service.getCheapestProduct(new File("file.xml")));
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("All the ovens:");
        try {
            PrintApplianceInfo.print(service.findAllOvens(new File("file.xml")));
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }

}
