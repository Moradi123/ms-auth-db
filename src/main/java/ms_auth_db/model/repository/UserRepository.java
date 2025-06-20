package ms_auth_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ms_auth_db.model.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
