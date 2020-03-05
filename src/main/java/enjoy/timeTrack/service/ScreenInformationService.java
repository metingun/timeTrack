package enjoy.timeTrack.service;

import enjoy.timeTrack.model.ScreenInformation;
import enjoy.timeTrack.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenInformationService {
    @Autowired
    ErrorCodeService errorCodeService;

    private ScreenInformation[] screenInfoArray;

    public ScreenInformationService() {
        this.screenInfoArray = new ScreenInformation[50];
    }

    public ScreenInformation addNewScreen(ScreenInformation screenInformation, SignUp[] signUp) {
        for (int searchIndex = 0; searchIndex < signUp.length; searchIndex++)
            if (signUp[searchIndex] != null) {
                if (screenInformation.getUserName().equals(signUp[searchIndex].getUserName()) &&
                        screenInformation.getPassword().equals(signUp[searchIndex].getPassword())) {
                    screenConfirm(screenInformation,signUp,searchIndex);
                }
                screenInformation.setErrorCode(1002);
                screenInformation.setErrorMessage(errorCodeService.errorCode(screenInformation.getErrorCode()));
                return screenInformation;
            }
        screenInformation.setErrorCode(1002);
        screenInformation.setErrorMessage(errorCodeService.errorCode(screenInformation.getErrorCode()));
        return screenInformation;
        }

    private ScreenInformation screenConfirm(ScreenInformation screenInformation, SignUp[] signUp, int searchIndex){
        for (int screenSearchIndex=0;screenSearchIndex<screenInfoArray.length;screenSearchIndex++)
            if (screenInfoArray[screenSearchIndex].getScreenNumber().equals(screenInformation.getScreenNumber())) {
                screenInformation.setErrorCode(1003);
                screenInformation.setErrorMessage(errorCodeService.errorCode(screenInformation.getErrorCode()));
                return screenInformation;
            }
            screenInfoArray[signUp[searchIndex].getCurrentIndex()] = screenInformation;
            signUp[searchIndex].setScreenInformation(screenInfoArray);
            signUp[searchIndex].setCurrentIndex(signUp[searchIndex].getCurrentIndex() + 1);
            return screenInformation;
    }
}
