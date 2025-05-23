package I3.Classes;

/**
 * Contains pricing information for a room type.
 */
public class RoomFare {
    private String room_type;
    private int pricePerDay;

    // Getter and setter methods
    
    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}