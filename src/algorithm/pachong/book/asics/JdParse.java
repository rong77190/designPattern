package algorithm.pachong.book.asics;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class JdParse {
    public static List<Shoe> getData (String html) throws Exception{
        //获取的数据，存放在集合中
        List<Shoe> data = new ArrayList<Shoe>();
        //采用Jsoup解析
        Document doc = Jsoup.parse(html);
        //获取html标签中的内容
        Elements elements=doc.select("ul[class=gl-warp clearfix]").select("li[class=gl-item]");
        for (Element ele:elements) {
            String showID=ele.attr("data-sku");
            String showPrice=ele.select("div[class=p-price]").select("strong").select("i").text();
            String showName=ele.select("div[class=p-name]").select("em").text();
            //创建一个对象，这里可以看出，使用Model的优势，直接进行封装
            Shoe shoe=new Shoe();
            //对象的值
            shoe.setShoeId(showID);
            shoe.setShoeName(showName);
            shoe.setShoePrice(showPrice);
            //将每一个对象的值，保存到List集合中
            data.add(shoe);
        }
        //返回数据
        return data;
    }
}