package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        while (true) {
            Thread.sleep(3000);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
