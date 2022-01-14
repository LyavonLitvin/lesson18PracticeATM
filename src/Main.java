public class Main {
    public static void main(String[] args) throws InterruptedException{
        ATM atm1 = new ATM(9000,true);
        ATM atm2 = new ATM(6500,true);
        ATM atm3 = new ATM(5600,true);
        Card card1 = new Card("Visa","1234-5678-9876-5432",8000);
        Card card2 = new Card("Visa","0987-6543-2112-3456",4500);
        Person person1 = new Person("Leonid","Litvin");
        Person person2 = new Person("Nikolay","Litvin");
        Person person3 = new Person("Valentina","Litvin");
        person1.setCard(card2);
        card2.setPerson(person1);
        person2.setCard(card2);
        person3.setCard(card1);
        card1.setPerson(person3);
        ATMThread atmThread1 = new ATMThread(atm1, card1);
        Thread thread1 = new Thread(atmThread1);
        thread1.start();
        ATMThread atmThread2 = new ATMThread(atm2, card2);
        Thread thread2 = new Thread(atmThread2);
        thread2.start();
        ATMThread atmThread3 = new ATMThread(atm3, card2);
        Thread thread3 = new Thread(atmThread3);
        thread3.start();
    }
}
