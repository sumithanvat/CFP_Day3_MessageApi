package com.bridgelabz.SpringH2DataBase.service;

import com.bridgelabz.SpringH2DataBase.dto.MessageDTO;
import com.bridgelabz.SpringH2DataBase.model.Message;
import com.bridgelabz.SpringH2DataBase.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MessageService {
    @Autowired
    private MessageRepo messageRepo;


    public Message addMessage(MessageDTO messageDTO) {
        Message messageData=new Message(messageDTO);
        return messageRepo.save(messageData);

    }
}
