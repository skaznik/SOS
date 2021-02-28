package pl.gov.policja.ka.SOS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gov.policja.ka.SOS.model.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer > {
    Status findByStatusId (Status statusId);
}
