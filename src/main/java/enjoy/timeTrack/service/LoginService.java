package enjoy.timeTrack.service;

import enjoy.timeTrack.model.Login;
import enjoy.timeTrack.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    ErrorCodeService errorCodeService;

    public Login login(Login login, SignUp[] signUp) {
        for (int searchIndex = 0; searchIndex < signUp.length; searchIndex++)
            if (signUp[searchIndex] != null) {
                if (login.getUserName().equals(signUp[searchIndex].getUserName())
                        && login.getPassword().equals(signUp[searchIndex].getPassword())) {
                    login.setErrorCode(0);
                    return login;
                }
                login.setErrorCode(1002);
                login.setErrorMessage(errorCodeService.errorCode(login.getErrorCode()));
                return login;
            }
        login.setErrorCode(1002);
        login.setErrorMessage(errorCodeService.errorCode(login.getErrorCode()));
        return login;
    }
}