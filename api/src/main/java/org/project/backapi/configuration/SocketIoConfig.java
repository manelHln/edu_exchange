package org.project.backapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.corundumstudio.socketio.SocketIOServer;

import jakarta.annotation.PreDestroy;

@Configuration
public class SocketIoConfig {

    private SocketIOServer server;

    @Bean
    public SocketIOServer socketIOServer(){
        com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
        config.setPort(9090);
        config.setHostname("localhost");
        server = new SocketIOServer(config);
        server.start();

        return server;
    }

    @PreDestroy
    public void stopSocketIoServer(){
        this.server.stop();
    }
}