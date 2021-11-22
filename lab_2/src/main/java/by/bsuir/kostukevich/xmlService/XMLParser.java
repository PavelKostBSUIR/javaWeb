package by.bsuir.kostukevich.xmlService;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.util.Iterator;

public class XMLParser {
    private String filePath;
    private Document doc;
    private XPath xpath;

    public XMLParser(String filePath) {
        this.filePath = filePath;
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            doc = builder.parse(filePath);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        XPathFactory xpathFactory = XPathFactory.newInstance();
        xpath = xpathFactory.newXPath();
        xpath.setNamespaceContext(new NamespaceContext() {
            @Override
            public String getNamespaceURI(String prefix) {
                if ("v20".equals(prefix)) {
                    return "testNS1";
                } else if ("xsi".equals(prefix)) {
                    return "http://www.w3.org/2001/XMLSchema-instance";
                }
                return null;
            }

            @Override
            public String getPrefix(String namespaceURI) {
                throw new UnsupportedOperationException();
            }

            @Override
            public Iterator<String> getPrefixes(String namespaceURI) {
                throw new UnsupportedOperationException();
            }
        });
    }

    public Node getNode(String exp) throws XPathExpressionException {
        XPathExpression expression = getExpression(exp);
        Node node = (Node) expression.evaluate(doc, XPathConstants.NODE);
        return node;
    }

    public double getCount(String exp) throws XPathExpressionException {
        XPathExpression expression = getExpression("count(" + exp + ")");
        return (double) expression.evaluate(doc, XPathConstants.NUMBER);
    }

    private XPathExpression getExpression(String exp) throws XPathExpressionException {
        return xpath.compile(exp);
    }
}
