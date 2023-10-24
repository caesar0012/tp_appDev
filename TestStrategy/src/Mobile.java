//7. Add another class named mobile that implements

public class Mobile implements Payment{
    
    private String number;
    private int pin;

    //8. Add parameter inside the constructor mobile
    public Mobile(String number, int pin){
        //9. Insert the statment inside the constructor    
        this.number = number;
        this.pin = pin;
    }

    //10. Use payment method again
    public void pay(double amount){

        System.out.println("Paid using mobile account: " + amount);

    }
}
