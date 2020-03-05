/*
package enjoy.timeTrack.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpringJPAPerson implements JINSpringJPA {
    private final PersonDao userDao;

    public SpringJPAPerson(PersonDao userDao) {
        this.userDao = userDao;
    }

    @Transactional

    @Override
    public void add(SpringJPAEntity person) {
        userDao.add(person);
    }

    @Transactional(readOnly = true)
    public List<SpringJPAEntity> listPersons() {
        return userDao.listPersons();
    }
}*/
