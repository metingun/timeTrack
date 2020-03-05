package enjoy.timeTrack.dao;

import javax.persistence.*;

@Entity
@Table(name = "PERSONS")
public class SpringJPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phoneNumber")
    private int phoneNumber;
    @Column(name = "inputEmail")
    private String inputEmail;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "screenInformation")
    private String screenInformation;

    public SpringJPAEntity() {
    }

    public SpringJPAEntity(String name, int phoneNumber, String inputEmail,String companyName,String screenInformation) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.inputEmail = inputEmail;
        this.companyName=companyName;
        this.screenInformation=screenInformation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public String getScreenInformation() {
        return screenInformation;
    }

    public void setScreenInformation(String screenInformation) {
        this.screenInformation = screenInformation;
    }
}

