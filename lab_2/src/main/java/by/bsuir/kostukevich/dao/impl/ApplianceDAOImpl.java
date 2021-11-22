package by.bsuir.kostukevich.dao.impl;

import by.bsuir.kostukevich.dao.ApplianceDAO;
import by.bsuir.kostukevich.entity.criteria.Criteria;
import by.bsuir.kostukevich.xmlService.JAXBSerializer;
import by.bsuir.kostukevich.xmlService.ApplianceStream;

import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String START = "/shop/appliance";
    private static final String CLASS_START = "[@xsi:type='CLASS'";
    private static final String CLASS_OR_CONDITION = " or @xsi:type='CLASS'";
    private static final String CLASS_END = "]";
    private static final String START_BY_PARAM = "[properties/entry[key='KEY' and value='VALUE']";
    private static final String PARAM_ADD_CONDITION = " and properties/entry[key='KEY' and value='VALUE']";
    private static final String END_BY_PARAM = "]";
    private JAXBSerializer serializer;

    public ApplianceDAOImpl(JAXBSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public ApplianceStream find(Criteria criteria) throws XPathExpressionException {
        String request = "";
        request = formParserRequestByPram(criteria, criteria.getGroupSearchName());
        return new ApplianceStream(request, serializer);
    }

    private String formParserRequestByPram(Criteria criteria, String[] groupSearchName) {
        List<Map.Entry<String, Object>> collect = new ArrayList<>(criteria.getCriteria().entrySet());
        StringBuilder request = new StringBuilder();
        request.append(START);
        for (int i = 0; i < groupSearchName.length; i++) {
            if (i == 0 && i == groupSearchName.length - 1) {
                request.append(CLASS_START.replaceAll("CLASS", groupSearchName[i]));
                request.append(CLASS_END);
            } else if (i == 0) {
                request.append(CLASS_START.replaceAll("CLASS", groupSearchName[i]));
            } else if (i == groupSearchName.length - 1) {
                request.append(CLASS_OR_CONDITION.replaceAll("CLASS", groupSearchName[i]));
                request.append(CLASS_END);
            } else {
                request.append(CLASS_OR_CONDITION.replaceAll("CLASS", groupSearchName[i]));
            }
        }
        for (int i = 0; i < collect.size(); i++) {
            if (i == 0 && i == groupSearchName.length - 1) {
                String startByParam = START_BY_PARAM.replaceAll("KEY", collect.get(i).getKey());
                startByParam = startByParam.replaceAll("VALUE", collect.get(i).getValue().toString());
                request.append(startByParam);
                request.append(END_BY_PARAM);

            } else if (i == 0) {
                String startByParam = START_BY_PARAM.replaceAll("KEY", collect.get(i).getKey());
                startByParam = startByParam.replaceAll("VALUE", collect.get(i).getValue().toString());
                request.append(startByParam);
            } else if (i == collect.size() - 1) {
                String addByParam = PARAM_ADD_CONDITION.replaceAll("KEY", collect.get(i).getKey());
                addByParam = addByParam.replaceAll("VALUE", collect.get(i).getValue().toString());
                request.append(addByParam);
                request.append(END_BY_PARAM);
            } else {
                String addByParam = PARAM_ADD_CONDITION.replaceAll("KEY", collect.get(i).getKey());
                addByParam = addByParam.replaceAll("VALUE", collect.get(i).getValue().toString());
                request.append(addByParam);
            }
        }
        return request.toString();
    }
}