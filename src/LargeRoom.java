
public class LargeRoom extends MeetingRoom{
     public LargeRoom(String id) {
        super(id, "Large", 20);
    }

    @Override
    public double calculateCost(int hours) {
        return hours * 50;
    }
}
