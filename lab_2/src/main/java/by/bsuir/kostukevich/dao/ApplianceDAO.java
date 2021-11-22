package by.bsuir.kostukevich.dao;

import by.bsuir.kostukevich.entity.criteria.Criteria;
import by.bsuir.kostukevich.xmlService.ApplianceStream;

import javax.xml.xpath.XPathExpressionException;

public interface ApplianceDAO {
    ApplianceStream find(Criteria criteria) throws XPathExpressionException;
}
