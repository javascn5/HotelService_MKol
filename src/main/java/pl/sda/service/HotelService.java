package pl.sda.service;

import pl.sda.model.Hotel;
import pl.sda.model.Room;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelService {

    private final Hotel hotel;

    public HotelService(Hotel hotel){
        this.hotel = hotel;
    }

    public List<Room> getRooms(){
        return hotel.getRooms();
    }

    public List<Room> getAvailableRooms(){
        return getRooms().stream()
                .filter(room -> room.isAvailable())     //lub .filter(Room::isAvailable)
                .collect(Collectors.toList());
    }

    public void checkIn(int roomNumber){
        Optional<Room> room = getAvailableRooms().stream()
                .filter(roomTmp -> roomTmp.getNumber() == roomNumber)
                .findFirst();

        room.ifPresent(roomTmp -> roomTmp.setAvailable(false));
    }

    public void checkOut(int roomNumber){
        Optional<Room> room = getUnavailableRooms().stream()
                .filter(roomTmp -> roomTmp.getNumber() == roomNumber)
                .findFirst();

        room.ifPresent(roomTmp -> roomTmp.setAvailable(true));
    }

    private List<Room> getUnavailableRooms(){
        return getRooms().stream()
                .filter(room -> !room.isAvailable())
                .collect(Collectors.toList());
    }
}
