package Task3;

public class Main {
    // task 3.g
    public static void main(String[] args) {

        // task 3.h
     //   ArrayList<Room> rooms = new ArrayList<>();

        // task 3.g
        Room r1 = new Room(3, 2);
        Room r2 = new Room(2, 1);
        Room r3 = new Room(5, 4);
        Room r4 = new Room(10, 6);
        Room r5 = new Room(30,20);
//        rooms.add(r1);
//        rooms.add(r2);
//        rooms.add(r3);
//        rooms.add(r4);
//
        Building building1 = new Building(2);
        building1.addRoom(r1);
        building1.addRoom(r2);
        building1.addRoom(r3);
        building1.addRoom(r4);

        // task 3.i
        Building building2 = new Building(5);
        building2.addRoom(r5);


        System.out.println("Amount of lamps in building 1: " + building1.countLampsInBuilding());
        System.out.println("Amount of windows in building 1: " + building1.countWindowsInBuilding());
        System.out.println("Amount of rooms in building 1: " + building1.countRoomsInBuilding());
        System.out.println("Amount of rooms in building 2: " + building2.countRoomsInBuilding());
        System.out.println(isNormal(building1));
        System.out.println(isNormal(building2));
    }

    /* public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }*/
    // task 3.k
    public static boolean isNormal(Building building){
        if (building.getRooms().size() >= building.getNumberOfFloors()){
            return true;
        } else {
            return false;
        }
    }
}
