package Task3;

import java.util.ArrayList;

public class Main {
    // task 3.g
    public static void main(String[] args) {

        // task 3.h
        ArrayList<Room> rooms = new ArrayList<>();

        // task 3.g
        Room r1 = new Room(3,2);
        Room r2 = new Room(2,1);
        Room r3 = new Room(5,4);
        Room r4 = new Room(10,6);
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);

        // task 3.i
        Building building1 = new Building(rooms, 2);
        Building building2 = new Building(rooms, 5);


        System.out.println("Amount of lamps in building: "+ countLampsInBuilding(building1));
        System.out.println("Amount of windows in building: "+countWindowsInBuilding(building1));
        System.out.println("Amount of rooms in building: "+countRoomsInBuilding(building1));
        System.out.println(isNormal(building1));
        System.out.println(isNormal(building2));
    }
    // task 3.j
    public static int countLampsInBuilding(Building building){
        int amountOfLamps=0;
        for(Room lamps: building.getRooms()){
            amountOfLamps+=lamps.getNumberOfLamps();
        }
        return amountOfLamps;
    }
    public static int countWindowsInBuilding(Building building){
        int amountOfWindows=0;
        for(Room windows: building.getRooms()){
            amountOfWindows+=windows.getNumberOfWindows();
        }
        return amountOfWindows;
    }
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }
    // task 3.k
    public static boolean isNormal(Building building){
        if (building.getRooms().size() >= building.getNumberOfFloors()){
            return true;
        } else {
            return false;
        }
    }
}
