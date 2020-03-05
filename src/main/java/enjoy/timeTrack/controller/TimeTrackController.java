package enjoy.timeTrack.controller;

import enjoy.timeTrack.dao.DbConnection;
import enjoy.timeTrack.model.ChangePassword;
import enjoy.timeTrack.model.Login;
import enjoy.timeTrack.model.SignUp;
import enjoy.timeTrack.service.ChangePasswordService;
import enjoy.timeTrack.service.LoginService;
import enjoy.timeTrack.service.SignUpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping(value = "/restful/timeTrack", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)

public class TimeTrackController extends DbConnection {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeTrackController.class);

    @Autowired
    SignUpService signUpService;
    @Autowired
    LoginService loginService;
    @Autowired
    ChangePasswordService changePasswordService;

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public SignUp signUp(@RequestBody SignUp signUp) {
        try {
            add();
            return signUpService.addUser(signUp);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Login login(@RequestBody Login login) {
        try {
            return loginService.login(login, signUpService.getUserInformation());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public ChangePassword changePassword(@RequestBody ChangePassword changePassword) {
        try {
            return changePasswordService.changePassword(changePassword, signUpService.getUserInformation());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }
}
