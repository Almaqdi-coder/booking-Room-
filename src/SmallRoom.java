
public class SmallRoom extends MeetingRoom {
    public SmallRoom(String id) {
        super(id, "Small", 5);
    }

    @Override
    public double calculateCost(int hours) {
        return hours * 20;
    }
}
