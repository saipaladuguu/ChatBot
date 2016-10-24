package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatController
{	
	private Chatbot stupidBot;
	private ChatViewer dispaly;
	
	public ChatController()
	{
		stupidBot = new Chatbot("wall-e");
		display = new ChatViewer();
		
	}
	
	
	public void start()
	{
		String response = "words";
		
		while(lengthChecker.lenghtChecker(response))
		{
			response = display.collectResponse("What do you want to talk about??")
		}
	}
}
