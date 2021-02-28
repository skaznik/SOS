package pl.gov.policja.ka.SOS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gov.policja.ka.SOS.model.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, Integer> {
}
