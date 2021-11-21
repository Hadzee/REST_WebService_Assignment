
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory docbuildfa = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = docbuildfa.newDocumentBuilder();
        Document doc = db.parse("cars.xml");

        doc.getDocumentElement().normalize();
        XPath xp = XPathFactory.newInstance().newXPath();
        getNode(doc, xp);

    }
    public static void getNode (Document doc, XPath xp){
        XPathExpression expr;
        Object res = null;

        try {
            Scanner scanner = new Scanner(System.in);
            int firstNum;
            int secondNum;
            System.out.println("Enter first number: ");
            firstNum = scanner.nextInt();
            System.out.println("Enter second number: ");
            secondNum = scanner.nextInt();

            expr = (XPathExpression) xp.compile("/cars/car[production-year[. >= "+firstNum + " and . <= "+ secondNum +"]]");
            res = expr.evaluate(doc, XPathConstants.NODESET);

        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        NodeList nodes = (NodeList) res;

        for (int i = 0; i < nodes.getLength(); i++) {
            Node carNode = nodes.item(i);
            NodeList chilNod = carNode.getChildNodes();

        for (int j = 0; j < chilNod.getLength(); j++) {
            Node carChildNode = chilNod.item(j);
            if (carChildNode.getNodeType() != Node.ELEMENT_NODE)
                continue;
            System.out.println(carChildNode.getNodeName() + ":" + carChildNode.getTextContent());
            }
            System.out.println();
        }

        }
    }
