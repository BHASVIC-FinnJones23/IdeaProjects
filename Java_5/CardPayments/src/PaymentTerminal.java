public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals=0;
        this.heartyMeals=0;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money+=sum;
    }
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()<2.50){
            return false;
        }else{
            card.takeMoney(2.50);
            this.affordableMeals+=1;
            return true;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()<4.30){
            return false;
        }else{
            card.takeMoney(4.30);
            this.heartyMeals+=1;
            return true;
        }
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment<2.50){
            return payment;
        }else{
            this.money+=2.50;
            this.affordableMeals+=1;

            return payment-2.50;

        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment<4.30){
            return payment;
        }else{
            this.money+=4.30;
            this.heartyMeals+=1;

            return payment-4.30;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}