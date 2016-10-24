package chat.view;

public class ChatViewer
{
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response
	}
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	public int collectUserOption(String questions)
	{
		int response = 0;
		
		response = JOptionPane.showConfirmDialog(null, question);
		
		return response;
	}
}
