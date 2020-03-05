package enjoy.timeTrack.dao;
import java.util.List;

public interface JINSpringJPA {
    void add(SpringJPAEntity person);
    List<SpringJPAEntity> listPersons();
}