//week3
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LoginRecordRepository extends JpaRepository<LoginRecord, Long> {

    List<LoginRecord> findAllByLoginTimeBetween(LocalDateTime start, LocalDateTime end);
}
