package pl.sda.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel(){
                this.rooms.add(new Room(1, 2, true, true));
                this.rooms.add(new Room(2, 2, false, false));
                this.rooms.add(new Room(3, 3, true, true));
                this.rooms.add(new Room(4, 4, false, false));
                this.rooms.add(new Room(5, 1, false, true));
                this.rooms.add(new Room(6, 5, true, false));
                this.rooms.add(new Room(7, 1, true, true));
                this.rooms.add(new Room(8, 2, false, true));
                this.rooms.add(new Room(9, 3, true, true));
                this.rooms.add(new Room(10, 2, true, false));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
