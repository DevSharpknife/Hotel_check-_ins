import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private int roomNumber;
    private String type;
    private ArrayList<Guest>guests;

    public Bedroom(int capacity, int roomNumber, String type){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.type = type;
        this.guests = new ArrayList<>();
        }

    public int getCapacity(){ return capacity; }

    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    public boolean hasCapacity(){ return capacity > guests.size();}

    public int getRoomNumber(){ return roomNumber; }

    public void addGuest(Guest guest){ this.guests.add(guest); }

    public int guestCount(){ return this.guests.size(); }






}
