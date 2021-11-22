package by.bsuir.kostukevich.service;

import by.bsuir.kostukevich.entity.Appliance;
import by.bsuir.kostukevich.entity.Oven;
import by.bsuir.kostukevich.entity.criteria.Criteria;
import by.bsuir.kostukevich.xmlService.ApplianceStream;

import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.util.List;

public interface ApplianceService {

    List<Oven> findAllOvens(File file) throws XPathExpressionException;

    Appliance getCheapestProduct(File file) throws XPathExpressionException;

    List<Appliance> find(Criteria criteria, File file) throws XPathExpressionException;
}
