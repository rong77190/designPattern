//import java.io.File;
//import java.io.FileWriter;
//import java.util.Iterator;
//import java.util.List;
//
//import org.dom4j.Attribute;
//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
//import org.dom4j.Node;
//import org.dom4j.io.OutputFormat;
//import org.dom4j.io.SAXReader;
//import org.dom4j.io.XMLWriter;
//
//public class DOM4JTest {
//	public static void main(String[] args) throws Exception {
//		SAXReader reader = new SAXReader();
//	    Document document = reader.read(new File("User.hbm.xml"));
//	    Element rootElement = document.getRootElement();
//	    p(rootElement.getName());
//
//	    for ( Iterator i = rootElement.elementIterator(); i.hasNext(); ) {
//	        Element element = (Element) i.next();
//	        p(element.getName());
//
//	        for ( Iterator j = element.attributeIterator(); j.hasNext(); ) {
//	            Attribute attribute = (Attribute) j.next();
//	            p(attribute.getName() + "-" + attribute.getValue());
//	         }
//	     }
//
//	    //xpath
//	    List<Node> list = document.selectNodes( "//hibernate-mapping/class/property" );
//	    for(Node n : list) {
//	    	System.out.println(n.getName());
//	    	p(n.valueOf("@name"));
//	    }
//
//	    createDocument();
//	}
//
//	public static void p(Object o) {
//		System.out.println(o);
//	}
//
//	public static Document createDocument() throws Exception {
//	       Document document = DocumentHelper.createDocument();
//	       Element root = document.addElement("hibernate-mapping");
//	       Element classElement = root.addElement("class")
//	       	   .addAttribute("name", "com.bjsxt.User")
//	       	   .addAttribute("table", "t_user");
//	       classElement.addElement("property").addAttribute("name", "username");
//
//	       OutputFormat format = OutputFormat.createPrettyPrint();
//	       XMLWriter writer = new XMLWriter(
//	               new FileWriter( "User1.hbm.xml" ), format
//	           );
//	           writer.write( document );
//	           writer.close();
//
//	       return document;
//	    }
//}
