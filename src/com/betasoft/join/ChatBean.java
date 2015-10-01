package com.betasoft.join;

public class ChatBean {
	String sendersMessage,ReceiverMessage;
	int senderPic,receiverPic;

	public ChatBean(int sender_pic, String senders_message , int receiver_pic , String Receiver_message)
	{
		this.senderPic = sender_pic;
		this.sendersMessage = senders_message;
		this.receiverPic = receiver_pic;
		this.ReceiverMessage = Receiver_message;
	}

}
