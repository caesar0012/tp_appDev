//14. Use class TestStrategy to execute
public class TestStrategy {
    public static void main(String[] args){
        
        try{
            
            Cart cart = new Cart(1512.75);
            cart.pay(new Online("mark.reyes@gmail.com", "Wasd8456!"));
            
            //15. Add code for mobile payment
            cart = new Cart(375.25);
            cart.pay(new Mobile("09123456789", 1212));

        }catch(Exception ex){

            System.out.println(ex.getMessage());

        }
    }
}
