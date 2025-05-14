package Ex1_2;

public class ShippingInfo {

    private String city;
    private int zip;
    private String country;


    //Konstruktor
    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException{
        if (city == null ){
            throw new InvalidShippingInfoException("City is empty.");
        }
        this.city = city;
        if (zip < 1) {
            throw new InvalidShippingInfoException("zip is not valid");
        }
        this.zip = zip;
        this.country = country;
    }


    //Getter
    public String getCity() {
        return city;
    }

    public int getZip(){
        return zip;
    }

    public String getCountry(){
        return country;
    }

    //setter
    public void setCity(String city){
        this.city = city;
    }

    public void setZip(int zip){
        this.zip = zip;
    }

    public void setCountry(String country){
        this.country = country;
    }

}
