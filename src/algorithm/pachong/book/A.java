package algorithm.pachong.book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23/023.
 */
public class A {
    static final  Log logger = LogFactory.getLog(A.class);

    public static void main(String[] args)throws Exception {
        //初始化一个httpclient
        HttpClient client = new DefaultHttpClient();
        ////我们要爬取的一个地址，这里可以从数据库中抽取数据，然后利用循环，可以爬取一个URL队列
        String url = "http://search.jd.com/Search?keyword=Python&enc=utf-8&book=y&wq=Python&pvid=33xo9lni.p4a1qb";
        //抓取的数据
        List<Book> bookdatas=URLFecter.URLParser(client, url);
        //循环输出抓取的数据
        for (Book book:bookdatas) {
            logger.info("bookID:"+book.getBookId()+"\t"+"bookPrice:"+book.getBookPrice()+"\t"+"bookName:"+book.getBookName());
        }
        //将抓取的数据插入数据库
//        MYSQLControl.executeInsert(bookdatas);

    }
}

