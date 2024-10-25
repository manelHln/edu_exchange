package org.project.backapi.service;

import org.springframework.stereotype.Service;

import com.corundumstudio.socketio.SocketIOServer;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatService {

    private final SocketIOServer socketIOServer;
    private final ChatConnectListener connectListener;
    private final ChatDisconnectListener disconnectListener;

    public ChatService(SocketIOServer socketIOServer, ChatConnectListener connectListener, ChatDisconnectListener disconnectListener) {
        this.socketIOServer = socketIOServer;
        this.connectListener = connectListener;
        this.disconnectListener = disconnectListener;
    }

    @PostConstruct
    private void init(){
        socketIOServer.addConnectListener(connectListener);
        socketIOServer.addDisconnectListener(disconnectListener);
        // socketIOServer.addEventListener("privateChatMessage", Message.class, privateChatMessageListener);
    }

}
