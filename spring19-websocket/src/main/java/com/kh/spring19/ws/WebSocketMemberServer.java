package com.kh.spring19.ws;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebSocketMemberServer extends TextWebSocketHandler{
	
	private Set<WebSocketSession> visitor = new HashSet<>();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		visitor.add(session);
		log.debug("사용자 접속(현재 {}명)", visitor.size());
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		visitor.remove(session);
		log.debug("사용자 접속(현재 {}명)", visitor.size());
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		for(WebSocketSession user : visitor) {
			user.sendMessage(message);
		}
	}
}
