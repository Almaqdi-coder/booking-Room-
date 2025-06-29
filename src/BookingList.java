
public class BookingList {
     private Booking[] bookings;
    private int count;

    public BookingList(int size) {
        bookings = new Booking[size];
        count = 0;
    }

    public boolean addBooking(Booking booking) {
        if (count < bookings.length) {
            bookings[count++] = booking;
            return true;
        }
        return false;
    }

    public String getFormattedBookings() {
        if (count == 0) 
           return "No bookings found.";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(bookings[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public Booking searchBooking(String name) {
        for (int i = 0; i < count; i++) {
            if (bookings[i].getUserName().equals(name)) {
                return bookings[i];
            }
        }
        return null;
    }

    public boolean deleteBooking(String name) {
        for (int i = 0; i < count; i++) {
            if (bookings[i].getUserName().equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    bookings[j] = bookings[j + 1];
                }
                bookings[--count] = null;
                return true;
            }
        }
        return false;
    }

    public boolean updateBooking(String name, Booking newBooking) {
        for (int i = 0; i < count; i++) {
            if (bookings[i].getUserName().equals(name)) {
                bookings[i] = newBooking;
                return true;
            }
        }
        return false;
    }
}
