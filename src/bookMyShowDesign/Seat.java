package bookMyShowDesign;

public class Seat {
    private String seatId;
    private String seatNum;
    private String seatType;
    private int price;
    public Seat(String seatId, String seatNum, String seatType, int price) {
        this.seatId = seatId;
        this.seatNum = seatNum;
        this.seatType = seatType;
        this.price = price;
    }
    public String getSeatId() {
        return seatId;
    }
    public String getSeatNum() {
        return seatNum;
    }
    public String getSeatType() {
        return seatType;
    }
    public int getPrice() {
        return price;
    }

}
