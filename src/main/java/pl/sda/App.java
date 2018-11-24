package pl.sda;

import pl.sda.model.Hotel;
import pl.sda.service.HotelService;

public class App
{
    public static void main( String[] args )
    {
        HotelService hotelService = new HotelService(new Hotel());
        System.out.println(hotelService.getRooms());

        System.out.println("Available rooms:");
        System.out.println(hotelService.getAvailableRooms());
    }
}
