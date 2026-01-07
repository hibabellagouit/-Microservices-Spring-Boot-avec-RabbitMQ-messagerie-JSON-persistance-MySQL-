package siham.microservices.messagingconsumer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import siham.microservices.messagingconsumer.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}