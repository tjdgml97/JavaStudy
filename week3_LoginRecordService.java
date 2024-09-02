import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Service
public class LoginRecordService {

    private final LoginRecordRepository loginRecordRepository;

    public LoginRecordService(LoginRecordRepository loginRecordRepository) {
        this.loginRecordRepository = loginRecordRepository;
    }

    public long getTotalLoginsFor2020() {
        LocalDateTime startOf2020 = LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0);
        LocalDateTime endOf2020 = LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59);

        List<LoginRecord> records = loginRecordRepository.findAllByLoginTimeBetween(startOf2020, endOf2020);
        return records.size();
    }
}
