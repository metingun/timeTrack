package enjoy.timeTrack.service;

import enjoy.timeTrack.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
    @Autowired
    ErrorCodeService errorCodeService;

    private SignUp[] userInformation;
    private int currentIndex = 0;

    public SignUpService() {
        this.userInformation = new SignUp[20];
    }

    public SignUp addUser(SignUp signUp) {
        for (int searchIndex = 0; searchIndex < userInformation.length; searchIndex++)
            if (userInformation[searchIndex] != null) {
                if (!userInformation[searchIndex].getUserName().equals(signUp.getUserName())
                        || !userInformation[searchIndex].getInputEmail().equals(signUp.getInputEmail())) {
                    userInformation[currentIndex] = signUp;
                    currentIndex++;
                    return signUp;
                }
                signUp.setErrorCode(1001);
                signUp.setErrorMessage(errorCodeService.errorCode(signUp.getErrorCode()));
                return signUp;
            }
        userInformation[currentIndex] = signUp;
        currentIndex++;
        return signUp;
    }

    public SignUp[] getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(SignUp[] userInformation) {
        this.userInformation = userInformation;
    }
    
}