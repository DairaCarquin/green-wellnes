package green.wellness.app.green_wellness.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import green.wellness.app.green_wellness.entities.Message;
import green.wellness.app.green_wellness.services.MessageServiceManager;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    MessageServiceManager mensajeServiceManager;

    @PostMapping()
    public ResponseEntity<Message> save(@RequestBody Message message){
        Message newMessage = mensajeServiceManager.save(message);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMessage);
    }
}