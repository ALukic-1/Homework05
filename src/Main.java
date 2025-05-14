public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ShippingInfo info =
                new ShippingInfo (" Munich ", 80331 , " Germany ");
        Profile profile = new Profile ( info );
        Customer customer = new Customer ( profile , 123);

        System .out. println (" Shipping to: " + customer . getProfile ().getShippingInfo (). getCity ());
    }

}