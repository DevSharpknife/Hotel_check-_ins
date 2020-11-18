import java.util.ArrayList;

public class ConferenceRoom {
    
    private int capacity;
    private String name;
    private ArrayList<Guest> guests;
    
    public ConferenceRoom(int capacity, String name){
       this.capacity = capacity;
       this.name = name;
       this.guests = new ArrayList<>();
       }

    public int getCapacity(){ return capacity; };

    public void setCapacity(Integer capacity) { this.capacity = capacity; }
    
    public String getName(){ return name; };
    
    public void setName(String name) { this.name = name; }
        
    public boolean hasCapacity(){ return capacity > guests.size();}
    
    public void addGuest(Guest guest){ this.guests.add(guest); }
    
    public int guestCount(){ return this.guests.size(); };
}
