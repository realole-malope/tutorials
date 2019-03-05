package za.co.malope.security.secureapp.repository;

import org.springframework.data.repository.Repository;
import za.co.malope.security.secureapp.entity.User;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {

    Optional<User> findUserByReferenceId(String referenceId);
}
