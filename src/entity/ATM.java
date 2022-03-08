package entity;


public class ATM {
    private int id;
    private int countOfMoney;
    private boolean isAtmWork;

    public ATM(int id, int countOfMoney, boolean isAtmWorking) {
        this.id = id;
        this.countOfMoney = countOfMoney;
        this.isAtmWork = isAtmWorking;
    }

    public ATM() {
    }

    public ATM(Card card) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ATM{" +
                "id=" + id +
                ", countOfMoney=" + countOfMoney +
                ", isAtmWork=" + isAtmWork +
                '}';
    }
}

