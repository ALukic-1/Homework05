package ex1;

public class Main {

    //Klasse muss eig. EComController heissen

    public static void main(String[] args) throws InvalidShippingInfoException, MissingShippingInfoException, InvalidCustomerException {



        try {
            ShippingInfo info =
                    new ShippingInfo(" Munich ", 80331, " Germany ");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);
        } catch (InvalidShippingInfoException e){
            System.out.println("I.Error: "+ e.getMessage());
        } catch (InvalidCustomerException e){
            System.out.println("II. Error: " + e.getMessage());
        }catch (MissingShippingInfoException e){
            System.out.println("III. Error: "+ e.getMessage());
        }



        ShippingInfo info =
                new ShippingInfo(" Munich ", 80331, " Germany ");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

        System .out. println (" Shipping to: " +
                customer . getProfile (). getShippingInfo (). getCity ());

    }

}