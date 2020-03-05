package enjoy.timeTrack.controller;

import enjoy.timeTrack.model.ScreenInformation;
import enjoy.timeTrack.service.ScreenInformationService;
import enjoy.timeTrack.service.SignUpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping(value = "/restful/userPage",produces = "application/json; charset=UTF-8",method = RequestMethod.POST)
public class UserPageController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeTrackController.class);

    @Autowired
    ScreenInformationService screenInformationService;
    @Autowired
    SignUpService signUpService;

    @RequestMapping(value = "/addNewScreen",method = RequestMethod.POST)
    public ScreenInformation addNewScreen(@RequestBody ScreenInformation screenInformation){
        try {

            return screenInformationService.addNewScreen(screenInformation,signUpService.getUserInformation());
        }
        catch (Exception e){
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }
}
