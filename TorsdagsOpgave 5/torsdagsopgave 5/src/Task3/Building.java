package Task3;

import java.util.ArrayList;

public class Building {
    // task 3.d
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;

    // task 3.e
    public Building(int numberOfFloors) {
//        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public int countWindowsInBuilding(){
        int amountOfWindows=0;
        for(Room windows: getRooms()){
            amountOfWindows+=windows.getNumberOfWindows();
        }
        return amountOfWindows;
    }

    // task 3.j
    public int countLampsInBuilding(){
        int amountOfLamps=0;
        for(Room lamps: getRooms()){
            amountOfLamps+=lamps.getNumberOfLamps();
        }
        return amountOfLamps;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    // task 3.f
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public int countRoomsInBuilding() {
        return getRooms().size();
    }
}
