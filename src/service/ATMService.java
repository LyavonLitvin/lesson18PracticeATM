package service;

import entity.ATM;
import entity.Card;

import java.util.Random;

public class ATMService implements Runnable {
    private ATM atm;
    private Card card;

    public ATMService(ATM atm, Card card) {
        this.atm = atm;
        this.card = card;
    }

    public void withdrawCash(ATM atm,Card card, int countOfMoneyForWithdrawing) {
        synchronized (card) {
            if (atm.isAtmWork() == false) {
                System.out.println(Constants.MESSAGE_ATM_NOT_WORKING);
            } else if (card.getMoneyCount() < countOfMoneyForWithdrawing) {
                System.out.println(Constants.MESSAGE_YOU_HAVE_NOT_ENOUGH_MONEY);
                System.out.println(card + " " + this);
                System.out.println(Constants.MESSAGE_YOU_WANT_TO_TAKE + countOfMoneyForWithdrawing + "\n");
            } else if (atm.getCountOfMoney() < countOfMoneyForWithdrawing) {
                System.out.println(Constants.MESSAGE_ATM_HAVE_NOT_ENOUGH_MONEY);
                System.out.println(card + " " + this);
                System.out.println(Constants.MESSAGE_YOU_WANT_TO_TAKE + countOfMoneyForWithdrawing + "\n");
            } else {
                System.out.println("\n" + card + " " + this);
                card.setMoneyCount(card.getMoneyCount() - countOfMoneyForWithdrawing);
                atm.setCountOfMoney(atm.getCountOfMoney() - countOfMoneyForWithdrawing);
                System.out.println(Constants.MESSAGE_YOU_HAVE_TOKEN + countOfMoneyForWithdrawing + "");
                System.out.println(card + " " + this + "\n");
            }
        }
    }

    public void addCash(ATM atm, Card card, int countAddMoney) {
        synchronized (card) {
            if (atm.isAtmWork() == false) {
                System.out.println(Constants.MESSAGE_ATM_NOT_WORKING);
            } else {
                System.out.println("\n" + card.toString() + " " + this);
                System.out.println(Constants.MESSAGE_YOU_WITHDRAW_SUCCESSFULLY_PHRASE_1 + countAddMoney + Constants.MESSAGE_YOU_WITHDRAW_SUCCESSFULLY_PHRASE_2);
                card.setMoneyCount(card.getMoneyCount() + countAddMoney);
                atm.setCountOfMoney(atm.getCountOfMoney() + countAddMoney);
                System.out.println(card + " " + this + "\n");
            }
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 2; i++) {

            count = random.nextInt(5990);
            withdrawCash(atm, card, count);

            count = random.nextInt(3750);
            addCash(atm, card, count);

        }
    }
}
