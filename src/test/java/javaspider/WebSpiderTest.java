package javaspider;

import com.spider.web.utilities.WebSpider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 测试类
 * 3个测试链接：
 * 1）百科网页
 * 2）浏览器模拟获取接口数据
 * 3）获取普通接口数据
 * @author Administrator -> junhong
 *
 * 2016年12月27日
 */
public class WebSpiderTest {
    String seeds[] = {"http://baike.baidu.com/view/1.htm"};
    final static String DEFAULT_CHARSET = "UTF-8";
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("--- down ---");
    }

    @Test
    public void testGetResponseCode() throws Exception{
        for(String seed:seeds){
            int responseCode = WebSpider.getResponseCode(seed);
            System.out.println("ret="+responseCode);
        }
    }

    @Test
    public void testJDKFetch() throws Exception{
        for(String seed:seeds){
            String ret = WebSpider.jdkFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testURLFetch() throws Exception{
        for(String seed:seeds){
            String ret = WebSpider.urlFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testHttpClientFetch()throws Exception {
        for(String seed:seeds){
            String ret = WebSpider.httpClientFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testCommonsIOFetch()throws Exception {
        for(String seed:seeds){
            String ret = WebSpider.commonIoFetch(seed, DEFAULT_CHARSET);
            System.out.println("ret="+ret);
        }
    }

    @Test
    public void testJsoupFetch() throws Exception{
        for(String seed:seeds){
            String ret = WebSpider.jsoupFetch(seed);
            System.out.println("ret="+ret);
        }
    }

}