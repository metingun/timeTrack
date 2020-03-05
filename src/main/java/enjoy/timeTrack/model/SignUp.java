package enjoy.timeTrack.model;


public class SignUp extends Login {
    private String name;
    private String phoneNumber;
    private String inputEmail;
    private String companyName;
    private ScreenInformation[] screenInformation;
    private int currentIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ScreenInformation[] getScreenInformation() {
        return screenInformation;
    }

    public void setScreenInformation(ScreenInformation[] screenInformation) {
        this.screenInformation = screenInformation;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public SignUp() {
        this.currentIndex = 0;
    }
}