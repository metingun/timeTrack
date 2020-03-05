package enjoy.timeTrack.model;

public class ScreenInformation extends Login{
    private String screenNumber;
    private int payAnHour;
    private String status;

    public String getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(String screenNumber) {
        this.screenNumber = screenNumber;
    }

    public int getPayAnHour() {
        return payAnHour;
    }

    public void setPayAnHour(int payAnHour) {
        this.payAnHour = payAnHour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
