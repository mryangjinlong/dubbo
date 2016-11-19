/**
 * Created by jimmy on 2016/11/19.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

}