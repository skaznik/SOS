package pl.gov.policja.ka.SOS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gov.policja.ka.SOS.model.Type;

@Repository
public interface TypeRepository extends CrudRepository <Type, Integer> {
}
