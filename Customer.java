public class Customer {
    private String name;
    private String sdt;
    private int CMND;
    public Customer(String name,String sdt, int CMND){
        this.name=name;
        this.sdt=sdt;
        this.CMND=CMND;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return sdt;
    }

    public void setId(String id) {
        this.sdt = id;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + sdt +
                ", CMND=" + CMND +
                '}';
    }
}
