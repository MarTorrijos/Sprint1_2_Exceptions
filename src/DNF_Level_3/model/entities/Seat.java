package DNF_Level_3.model.entities;

public class Seat {

    private int rowNum;
    private int seatNum;
    private String bookerName;

    public Seat(int rowNum, int seatNum, String bookerName) {
        this.rowNum = rowNum;
        this.seatNum = seatNum;
        this.bookerName = bookerName;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getBookerName() {
        return bookerName;
    }

    public void setBookerName(String bookerName) {
        this.bookerName = bookerName;
    }

}
