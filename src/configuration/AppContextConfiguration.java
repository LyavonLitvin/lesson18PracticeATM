package configuration;


import entity.ATM;
import entity.Card;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import service.ATMService;

@Configuration
public class AppContextConfiguration {

    @Bean
    public ATM atm1() {
        return new ATM(1, 9000, true);
    }

    @Bean
    public ATM atm2() {
        return new ATM(2, 6500, true);
    }

    @Bean
    public ATM atm3() {
        return new ATM(3, 5600, true);
    }

    @Bean
    public Person person1() {
        return new Person(1, "Leonid", "Litvin");
    }

    @Bean
    public Person person2() {
        return new Person(2, "Nikolay", "Litvin");
    }

    @Bean
    public Person person3() {
        return new Person(3, "Valentina", "Litvin");
    }

    @Bean
    public Card card1(Person person3) {
        return new Card("Visa", "1234-5678-9876-5432", person3, 8000);
    }

    @Bean
    public Card card2(Person person1) {
        return new Card("Visa", "0987-6543-2112-3456", person1, 4500);
    }

    @Bean
    public ATMService atmService1(ATM atm1, Card card1) {
        return new ATMService(atm1, card1);
    }

    @Bean
    public ATMService atmService2(ATM atm2, Card card2) {
        return new ATMService(atm2, card2);
    }

    @Bean public ATMService atmService3(ATM atm3, Card card2) {
        return new ATMService(atm3, card2);
    }
}
