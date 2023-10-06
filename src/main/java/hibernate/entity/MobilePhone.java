package hibernate.entity;

public class MobilePhone {
    int id;
    String mfName;
   Float  price;

   String colour;

    public MobilePhone() {
    }
    public MobilePhone(int id ) {
        this.id = id;

    }
    public MobilePhone(int id, String mfName, Float price, String colour ) {
        this.id = id;
        this.mfName = mfName;
        this.price = price;
        this.colour = colour;
    }

    public String getMfName() {
        return mfName;
    }

    public void setMfName(String mfName) {
        this.mfName = mfName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Student [%-15s | %-5f | %-25s]", mfName, price, colour);
    }
}
