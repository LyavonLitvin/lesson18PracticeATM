import configuration.AppContextConfiguration;
import entity.ATM;
import entity.Card;
import entity.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContextConfiguration.class);


        Thread thread1 = new Thread((Runnable) applicationContext.getBean("atmService1"));
        thread1.start();

        Thread thread2 = new Thread((Runnable) applicationContext.getBean("atmService2"));
        thread2.start();

        Thread thread3 = new Thread((Runnable) applicationContext.getBean("atmService3"));
        thread3.start();
    }
}
