import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Room room=new Room("Ruby","64398384",73278,3,123,999,"A",2);
        System.out.println(room);
        room.setDays(6);
        System.out.println(room);
        Room room1=new Room("John","83868836",92939,2,234,99,"B",1);
        System.out.println(room1);
        room1.setPrice(50);
        room1.setRoomID("C");
        System.out.println(room1);
        ArrayList<Room> ArrayRooms= new ArrayList<>();
        ArrayRooms.add(room);
        ArrayRooms.add(room1);
        System.out.println(ArrayRooms);
    }
}
