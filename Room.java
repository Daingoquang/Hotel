public class Room extends Customer {
    private int Days;
    private int RoomNumber;
    private float Price;
    private String RoomID;
    private int People;
    public Room(String name,String sdt,int CMND,int Days, int RoomNumber, float Price, String RoomID, int People){
        super(name,sdt,CMND);
        this.Days=Days;
        this.RoomNumber=RoomNumber;
        this.RoomID=RoomID;
        this.Price=Price;
        this.People=People;
    }
    public int getDays() {
        return Days;
    }

    public void setDays(int days) {
        Days = days;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getRoomID() {
        return RoomID;
    }

    public void setRoomID(String roomID) {
        RoomID = roomID;
    }

    public int getPeople() {
        return People;
    }

    public void setPeople(int people) {
        People = people;
    }

    public float getMoney(){
        return Price*Days;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "Days=" + Days +
                ", RoomNumber=" + RoomNumber +
                ", Price=" + Price +
                ", RoomID='" + RoomID + '\'' +
                ", People=" + People +
                ", Money= " + getMoney() +
                '}';
    }
}
