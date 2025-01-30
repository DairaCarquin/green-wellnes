package green.wellness.app.green_wellness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import green.wellness.app.green_wellness.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}