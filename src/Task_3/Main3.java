package Task_3;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        Room num1 = new Room(2,4,4);
        Room num2 = new Room(1,8,2);
        Room num3 = new Room(7,12,0);

        List<Room> roomList = new ArrayList<>();

        roomList.add(num1);
        roomList.add(num2);
        roomList.add(num3);

        Building building = new Building(roomList, 3, 2, true);

        System.out.println("Total number of lamps in the building: " + countLampsInBuilding(building));
    }
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

}
