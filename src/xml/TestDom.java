package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/3/14/014.
 */
public class TestDom {
    public static void main(String[] args) {

    }

    public static void read(){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            InputStream inputStream = TestDom.class.getClassLoader().getResourceAsStream("src/xml/test.xml");
            Document document = builder.parse(inputStream);
            //root
            Element root = document.getDocumentElement();
            if (root == null){
                return;
            }
            System.out.println(root.getAttribute("name"));
            //All college node
            NodeList collegeNodes = root.getChildNodes();
            if (collegeNodes == null)return;
            for (int i = 0; i <  collegeNodes.getLength(); i ++){
                Node college = collegeNodes.item(i);
                if (college != null && college.getNodeType() == Node.ELEMENT_NODE){
                    System.out.println("\t"+college.getAttributes().getNamedItem("name").getNodeValue());
                    //all class node
                    NodeList classNodes = college.getChildNodes();
                    if (classNodes == null){
                        continue;
                    }
                    for (int j = 0; j < classNodes.getLength(); j++ ){
                        Node clazz = classNodes.item(j);
                        if (clazz != null && clazz.getNodeType() == Node.ELEMENT_NODE){
                            System.out.println("\t\t" + clazz.getAttributes().getNamedItem("name").getNodeValue());
                            //all student node
                            NodeList studentNodes = clazz.getChildNodes();
                            if (studentNodes == null)return;
                            for (int k  = 0; k < studentNodes.getLength(); k++){
                                Node student = studentNodes.item(k);
                                if (student != null && student.getNodeType() == Node.ELEMENT_NODE){
                                    System.out.print("\t\t\t" + student.getAttributes().getNamedItem("name").getNodeValue());
                                    System.out.print(" " + student.getAttributes().getNamedItem("age").getNodeValue());
                                    System.out.println(" " + student.getAttributes().getNamedItem("sex").getNodeValue());

                                }
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void write(){
//        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        try {
//            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
//            InputStream in = TestDom.class.getClass().getResourceAsStream("test.xml");
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }
//    }



}
