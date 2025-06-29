
public class MeetingRoom {
    private String roomID;
    private String roomType;
    private int capacity;

    public MeetingRoom(String roomID, String roomType, int capacity) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.capacity = capacity;
    }

    public double calculateCost(int hours) {
        return hours * 20; 
    }

    public String toString() {
        return "\nRoom Id: "+roomID + 
                "\nRoom Type: " + roomType + 
                "\nCapacity: " + capacity;
    }
}
