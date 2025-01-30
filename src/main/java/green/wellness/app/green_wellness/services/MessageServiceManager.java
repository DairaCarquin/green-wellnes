package green.wellness.app.green_wellness.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import green.wellness.app.green_wellness.entities.Message;
import green.wellness.app.green_wellness.repositories.MessageRepository;
import jakarta.transaction.Transactional;

@Service
public class MessageServiceManager implements MessageService {
    
    @Autowired
    MessageRepository messageRepository;
    @Override
    @Transactional
    public Message save(Message message) {
        return this.messageRepository.save(message);
    }
}
