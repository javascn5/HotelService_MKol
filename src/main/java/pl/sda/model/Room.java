package pl.sda.model;

public class Room {
    private int number;
    private int numberOfPlace;
    private boolean bathroom;
    private boolean available;

    public Room(int number,
                int numberOfPlace,
                boolean bathroom,
                boolean available) {
        this.number = number;
        this.numberOfPlace = numberOfPlace;
        this.bathroom = bathroom;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Nr: " + number + "\tIlosc miejsc: " + numberOfPlace +
                "\tŁazienka w pokoju: " + bathroom + "\tDostępność: " + available;
    }
}
