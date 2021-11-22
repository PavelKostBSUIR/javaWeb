package by.bsuir.kostukevich.xmlService;

import by.bsuir.kostukevich.entity.Appliance;
import by.bsuir.kostukevich.entity.Laptop;
import by.bsuir.kostukevich.entity.Oven;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.xpath.XPathExpressionException;
import java.io.FileWriter;
import java.io.IOException;

public class JAXBSerializer {
    private XMLParser parser;
    private String filePath;

    public JAXBSerializer(String filepath) {
        this.filePath = filepath;
        parser = new XMLParser(filepath);
    }

    public <T, K extends T> void serialize(Class<T> clazz, K object) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        FileWriter fileWriter = new FileWriter(filePath, false);
        marshaller.marshal(object, fileWriter);
    }

    public <T> T deserialize(String exp, Class<T> clazz) throws XPathExpressionException {
        Node node = parser.getNode(exp);
        T t = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            t = (T) un.unmarshal(node);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return t;
    }

    public double getCountProduct(String exp) throws XPathExpressionException {
        return parser.getCount(exp);
    }
}
