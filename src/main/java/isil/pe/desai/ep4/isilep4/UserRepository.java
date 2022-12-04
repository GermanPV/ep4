package isil.pe.desai.ep4.isilep4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("seleccionar u de usuarios u donde u.email = ?1")
    public User findByEmail(String email);

}