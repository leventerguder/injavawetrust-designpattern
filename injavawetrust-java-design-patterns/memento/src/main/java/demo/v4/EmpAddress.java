package demo.v4;

public class EmpAddress implements Cloneable {

    private String address;

    public EmpAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmpAddress{" +
                "address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //Shallow Copy
        return super.clone();
    }
}
