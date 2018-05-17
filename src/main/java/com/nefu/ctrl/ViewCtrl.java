package com.nefu.ctrl;

import javax.websocket.server.PathParam;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewCtrl {
	
	@RequestMapping("/")
	public String getView() {
		
		return "Start";
	}

}
