//11. Add a class named cart

public class Cart {

    private double amount;

    //12. Add double parameter inside the constructor
    public Cart(double amount){

        this.amount = amount;

    }
    
    //13. Add Payment method
    void pay(Payment mode){

        mode.pay(amount);
    }
   
}
