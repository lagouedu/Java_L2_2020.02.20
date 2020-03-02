package xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author 应癫
 */
public class XpathTest {


    /**
     * XPath 使用路径表达式来选取 XML 文档中的节点或节点集
     *
     *      经常使用到的路径表达式,如下
     *
     *          nodename	选取此节点的所有子节点。
     *          /	        从根节点选取。
     *          //	        从匹配选择的当前节点选择文档中的节点，而不考虑它们的位置。
     *          .	        选取当前节点。
     *          ..	        选取当前节点的父节点。
     *          @	        选取属性。
     *
     */

    @Test
    public void testXpath() throws DocumentException {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("books.xml");
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(resourceAsStream);
        Element rootElement = document.getRootElement();
        // 找 xml 根元素的下一级元素
        List<Element> selectNodes = rootElement.selectNodes("book");
        for (int i = 0; i < selectNodes.size(); i++) {
            Element element =  selectNodes.get(i);
            System.out.println(element);
        }

    }


}
