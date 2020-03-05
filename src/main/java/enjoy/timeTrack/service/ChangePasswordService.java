package enjoy.timeTrack.service;

import enjoy.timeTrack.model.ChangePassword;
import enjoy.timeTrack.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordService {
    @Autowired
    ErrorCodeService errorCodeService;

    public ChangePassword changePassword(ChangePassword changePassword, SignUp[] signUp) {
        for (int searchIndex = 0; searchIndex < signUp.length; searchIndex++)
            if (signUp[searchIndex] != null) {
                if (changePassword.getUserName().equals(signUp[searchIndex].getUserName())
                        && changePassword.getPassword().equals(signUp[searchIndex].getPassword())) {
                    signUp[searchIndex].setPassword(changePassword.getNewPassword());
                    changePassword.setErrorCode(0);
                    return changePassword;
                }
                changePassword.setErrorCode(1002);
                changePassword.setErrorMessage(errorCodeService.errorCode(changePassword.getErrorCode()));
                return changePassword;
            }
        changePassword.setErrorCode(1002);
        changePassword.setErrorMessage(errorCodeService.errorCode(changePassword.getErrorCode()));
        return changePassword;
    }
}
