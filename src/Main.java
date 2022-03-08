import entity.ATM;
import entity.Card;
import entity.Person;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ATMService;

public class Main {
    public static void main(String[] args) throws InterruptedException{
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContextConfiguration.class);

        ATM atm1 = new ATM(1,9000,true);
        ATM atm2 = new ATM(2,6500,true);
        ATM atm3 = new ATM(3,5600,true);

        Person person1 = new Person(1,"Leonid", "Litvin");
        Person person2 = new Person(2,"Nikolay", "Litvin");
        Person person3 = new Person(3,"Valentina", "Litvin");

        Card card1 = new Card("Visa", "1234-5678-9876-5432", 8000);
        Card card2 = new Card("Visa", "0987-6543-2112-3456", 4500);

        person1.setCard(card2);
        person2.setCard(card2);
        person3.setCard(card1);
        card2.setPerson(person1);
        card1.setPerson(person3);
        ATMService atmService1 = new ATMService(atm1, card1);
        Thread thread1 = new Thread(atmService1);
        thread1.start();
        ATMService atmService2 = new ATMService(atm2, card2);
        Thread thread2 = new Thread(atmService2);
        thread2.start();
        ATMService atmService3 = new ATMService(atm3, card2);
        Thread thread3 = new Thread(atmService3);
        thread3.start();
//        applicationContext.close();
    }
}
