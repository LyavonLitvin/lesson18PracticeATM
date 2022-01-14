public class Card {
    private String cardType;
    private String cardNumber;
    private Person person;
    private int moneyCount;

    public Card(String cardType, String cardNumber, Person person, int moneyCount) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.person = person;
        this.moneyCount = moneyCount;
    }

    public Card(String cardType, String cardNumber, int moneyCount) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.moneyCount = moneyCount;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(int moneyCount) {
        this.moneyCount = moneyCount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType= '" + cardType + '\'' +
                ", cardNumber= '" + cardNumber + '\'' +
                ", person= " + person.getFirstName() + " " + person.getLastName() +
                ", moneyCount= " + moneyCount +
                '}';
    }
}

