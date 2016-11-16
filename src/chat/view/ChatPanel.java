package chat.view;

import java.awt.Color;

import javax.swing.*;

import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JtextArea chatDisplay;
	private JTextField chatField;
	private Jbutton chatButton;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupPanel();
		setupLayout();
		setupListerners();
		setupChatDisplay();
	}
	private void setupChatDisplay()
	{
		
	}
	private void setupPanel()
	{
		this.setBackground(Color.orange);
		this.setLayout(baseLayout);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
	}
	private void setupLayout()
	{
		this,setBackground(Color.CYAN);
		
		
	}
	private void setupListerners()
	{
		
	}
}
