package by.bsuir.kostukevich.xmlService;

import by.bsuir.kostukevich.entity.Appliance;

import javax.xml.xpath.XPathExpressionException;

public class ApplianceStream {
    private int number = 1;
    private int count;
    private JAXBSerializer jaxbSerializer;
    private String exp;


    public ApplianceStream(String exp, JAXBSerializer jaxbSerializer) throws XPathExpressionException {
        this.jaxbSerializer = jaxbSerializer;
        this.exp = exp;
        count = (int) jaxbSerializer.getCountProduct(exp);
    }

    public boolean hasNext() {
        return number <= count;
    }

    public Appliance next() throws XPathExpressionException {
        if (number <= count) {
            number++;
            int tempNumber = number - 1;
            Appliance appliance = jaxbSerializer.deserialize(exp + "[" + tempNumber + "]", Appliance.class);
            return appliance;//can be error

        } else {
            return null;
        }
    }

    public int getCount() {
        return count;
    }
}

