package pl.gov.policja.ka.SOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gov.policja.ka.SOS.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail (User email);
    User findByFirstName (User firstName);
    User findByOic (User oic);
}
