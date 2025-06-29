
public class MediumRoom extends MeetingRoom {
    public MediumRoom(String id) {
        super(id, "Medium", 10);
    }

    @Override
    public double calculateCost(int hours) {
        return hours * 35;
    }
}
