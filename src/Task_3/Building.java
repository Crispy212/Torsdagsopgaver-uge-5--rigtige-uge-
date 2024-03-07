package Task_3;

import java.util.List;

public class Building {

    List<Room> rooms;

    int numberOfBathrooms;
    int numberOfFloors;
    Boolean isOfficeBuilding;

    public Building(List<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

}
