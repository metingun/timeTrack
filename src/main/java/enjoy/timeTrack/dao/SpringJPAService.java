package enjoy.timeTrack.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJPAService implements JINSpringJPA{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(SpringJPAEntity person) {
        entityManager.persist(person);
    }

    @Override
    public List<SpringJPAEntity> listPersons() {
        CriteriaQuery<SpringJPAEntity> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(SpringJPAEntity.class);
        @SuppressWarnings("unused")
        Root<SpringJPAEntity> root = criteriaQuery.from(SpringJPAEntity.class);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }


}