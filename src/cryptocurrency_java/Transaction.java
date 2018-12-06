package cryptocurrency_java;

import java.io.Serializable;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sender, recipient;
	private double amount;
	
	Transaction(String tSender, String tRecipient, double tAmount) {
		this.sender = tSender;
		this.recipient = tRecipient;
		this.amount = tAmount;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
