package algorithm.pachong.book.asics;

import algorithm.pachong.book.asics.HTTPUtils;
import algorithm.pachong.book.asics.JdParse;
import algorithm.pachong.book.asics.Shoe;
import algorithm.pachong.book.asics.URLFecter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23/023.
 */
public class Test {
    static final Log logger = LogFactory.getLog(Test.class);

    public static void main(String[] args)throws Exception {
        //初始化一个httpclient
        HttpClient client = new DefaultHttpClient();
        ////我们要爬取的一个地址，这里可以从数据库中抽取数据，然后利用循环，可以爬取一个URL队列
        String url = "http://search.jd.com/Search?keyword=asics&enc=utf-8&suggest=1.def.0.T00&wq=as&pvid=f66649f31b97429ca7f6f54a0ece1952";
        //抓取的数据
        HttpResponse response = HTTPUtils.getRawHtml(client, url);
        //获取响应状态码
        int StatusCode = response.getStatusLine().getStatusCode();
        if(StatusCode == 200){
            String entity = EntityUtils.toString (response.getEntity(),"utf-8");
            System.out.println(entity);
        }

//        List<Shoe> shoes= URLFecter.URLParser(client, url);
//        //循环输出抓取的数据
//        for (Shoe shoe:shoes) {
//            logger.info("shoeID:"+shoe.getShoeId()+"\t"+"shoePrice:"+shoe.getShoePrice()+"\t"+"shoeName:"+shoe.getShoeName());
//        }
        //将抓取的数据插入数据库
//        MYSQLControl.executeInsert(shoedatas);

    }

}
