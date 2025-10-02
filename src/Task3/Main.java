package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g Instantiate 3 rooms
        Room room1 = new Room(2, 1);
        Room room2 = new Room(4, 2);
        Room room3 = new Room(1, 3);

        // 3.h Add rooms to a collection
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i Create a building with those rooms and 2 floors
        Building normalBuilding = new Building(rooms, 2);

        // 3.j Test count methods
        System.out.println("Total lamps: " + countLampsInBuilding(normalBuilding));
        System.out.println("Total windows: " + countWindowsInBuilding(normalBuilding));
        System.out.println("Total rooms: " + countRoomsInBuilding(normalBuilding));

        // 3.k Test isNormal()
        System.out.println("Is building normal? " + isNormal(normalBuilding)); // Should be true

        // Test with an abnormal building (1 room, 3 floors)
        ArrayList<Room> tinyRoom = new ArrayList<>();
        tinyRoom.add(new Room(1, 1));
        Building abnormalBuilding = new Building(tinyRoom, 3);

        System.out.println("Is abnormal building normal? " + isNormal(abnormalBuilding)); // Should be false
    }

    // 3.j Count total lamps
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // Bonus: Count windows
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // Bonus: Count rooms
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // 3.k Check if the building is normal
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}

