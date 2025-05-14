package Ex1_2;

public class Profile{

    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null){
            throw new  MissingShippingInfoException("Shipping Info is missing");
        }

        this.shippingInfo =  shippingInfo;

    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
