public class ATM {
    private int countOfMoney;
    private boolean isAtmWork;

    public ATM(int countOfMoney, boolean isAtmWorking) {
        this.countOfMoney = countOfMoney;
        this.isAtmWork = isAtmWorking;
    }

    public int getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(int countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public boolean isAtmWork() {
        return isAtmWork;
    }

    public void setAtmWork(boolean atmWork) {
        isAtmWork = atmWork;
    }

    public void getCardAccountBalance(Card card) {
        System.out.println(card.getMoneyCount());
    }

    @Override
    public String toString() {
        return "ATM{" +
                "countOfMoney= " + countOfMoney +
                ", isAtmWork= " + isAtmWork +
                '}';
    }

    public void withdrawСash(Card card, int countOfMoneyForWithdrawing) {
        synchronized (card) {
            if (!isAtmWork) {
                System.out.println("\nБанкомат не работает по техническим причинам.\n");
            } else if (card.getMoneyCount() < countOfMoneyForWithdrawing) {
                System.out.println("\nУ вас на счету недостаточно средств");
                System.out.println(card + " " + this);
                System.out.println("Вы хотели снять :" + countOfMoneyForWithdrawing + "\n");
            } else if (getCountOfMoney() < countOfMoneyForWithdrawing) {
                System.out.println("\nНедостаточно средства в банкомате");
                System.out.println(card + " " + this);
                System.out.println("Вы хотели снять :" + countOfMoneyForWithdrawing + "\n");
            } else {
                System.out.println("\n" + card + " " + this);
                card.setMoneyCount(card.getMoneyCount() - countOfMoneyForWithdrawing);
                setCountOfMoney(getCountOfMoney() - countOfMoneyForWithdrawing);
                System.out.println("Вы сняли - " + countOfMoneyForWithdrawing + "");
                System.out.println(card + " " + this + "\n");
            }
        }
    }

    public void addCash(Card card, int countAddMoney) {
        synchronized (card) {
            if (!isAtmWork) {
                System.out.println("\nБанкомат не работает по техническим причинам.\n");
            } else {
                System.out.println("\n" + card.toString() + " " + this);
                System.out.println("Пополнение на - " + countAddMoney + " произошло успешно!");
                card.setMoneyCount(card.getMoneyCount() + countAddMoney);
                setCountOfMoney(getCountOfMoney() + countAddMoney);
                System.out.println(card + " " + this + "\n");
            }
        }
    }
}

