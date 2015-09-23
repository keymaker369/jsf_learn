package com.cometoin.helloworld_example_rpcStyle;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface = "com.cometoin.helloworld_example_rpcStyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Resource
	WebServiceContext wsctx;

	@Override
	public String getHelloWorldAsString(String name) {

		MessageContext mctx = wsctx.getMessageContext();
		
		// get detail from request headers
		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List userList = (List) http_headers.get("Username");
		List passList = (List) http_headers.get("Password");

		String username = "";
		String password = "";

		if (userList != null) {
			username = userList.get(0).toString();
		}

		if (passList != null) {
			password = passList.get(0).toString();
		}

		// Should validate username and password with database
		if (username.equals("user1") && password.equals("pass1")) {
			return "Hello World JAX-WS " + name;
		} else {
			return "Unknown User!";
		}

		
	}

}
