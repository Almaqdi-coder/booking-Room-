
public class Booking {

    private User userName;
    private MeetingRoom room;
    private String date;
    private String time;
    private int duration;

    public Booking(User userName, MeetingRoom room, String date, String time, int duration) {
        this.userName = userName;
        this.room = room;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public String getUserName() {
        return userName.getName();
    }

    public double getTotalCost() {
        return room.calculateCost(duration);
    }

    public String toString() {
        return "==============\n"
                + userName.toString()
                + "\n=============="
                + room.toString()
                + "\n==========="
                + "\nDate: " + date
                + "\nTime: " + time
                + "\nduration: " + duration+" hours"
                + "\nTotal Cost: " + getTotalCost()+" Rm";
    }
}
