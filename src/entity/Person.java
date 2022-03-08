package entity;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Card card;

    public Person(int id, String firstName, String lastName, Card card) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
    }

    public Person(String firstName, String lastName, Card card) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.card = card;
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(Card card) {
        this.card = card;
    }

    public Person(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", card=" + card.getCardNumber() + ", money=" + card.getMoneyCount() +
                '}';
    }
}
