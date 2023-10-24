//3. Create named Online with 2 priavate variables

public class Online implements Payment{

    private String email, password;
    
    //4. Insert 2 string parameters inside the constructor Online
    public Online(String email, String password){
        //5. Statement inside the constructor
        this.email = email;
        this.password = password;

    }

    //6. Pay method from the payment interface
    @Override
    public void pay(double amount) {

        System.out.println("Paid using online account: " + amount);

    }

    

    
}
