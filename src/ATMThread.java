import java.util.Random;

public class ATMThread implements Runnable {
    private ATM atm;
    private Card card;

    public ATMThread(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    @Override
    public void run() {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 3; i++) {

            count = random.nextInt(5990);
            atm.withdrawСash(card, count);

            count = random.nextInt(3750);
            atm.addCash(card, count);

        }
    }
}
