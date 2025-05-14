package ex1;

public class Customer {

    private Profile profile;
    private int id;


    public Customer(Profile profile, int id) throws InvalidCustomerException {
       if (profile == null){
           throw new InvalidCustomerException ("Profil is missing");
       }
       if (id < 0){
           throw new InvalidCustomerException("ID can not be negativ");
       }
        this.profile = profile;
        this.id = id;
    }

    //Getter Setter
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
