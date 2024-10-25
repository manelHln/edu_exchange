package org.project.backapi.service;

import org.springframework.stereotype.Service;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.listener.ConnectListener;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatConnectListener implements ConnectListener {
    
    @Override
    public void onConnect(SocketIOClient client){
        log.info("Connected user : {}",client.getSessionId().toString());
    }
}
