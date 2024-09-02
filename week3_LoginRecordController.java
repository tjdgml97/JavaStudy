import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logins")
public class LoginRecordController {

    private final LoginRecordService loginRecordService;

    public LoginRecordController(LoginRecordService loginRecordService) {
        this.loginRecordService = loginRecordService;
    }

    @GetMapping("/2020")
    public long getTotalLoginsFor2020() {
        return loginRecordService.getTotalLoginsFor2020();
    }
}
