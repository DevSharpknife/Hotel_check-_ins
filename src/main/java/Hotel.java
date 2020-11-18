import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;

   public Hotel(){
       this.bedrooms = bedrooms;
       this.confRooms = confRooms;
   }

    public void checkIn(Guest guest, Bedroom bedroom){
       bedroom.addGuest(guest);
   }

   public void checkIn(Guest guest, Bedroom bedroom){
       bedroom.addGuest(guest);
   }

    public int guestCount(){ return this.guests.size(); }

}
