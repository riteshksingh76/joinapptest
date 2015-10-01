package com.betasoft.join;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
// testing the git hub
public class ChatAdapter extends ArrayAdapter<ChatBean>{

	Context context;
	int resource;
	List<ChatBean> items;
	
	public ChatAdapter(Context context, int resource,List<ChatBean> items)
	{
		super(context, resource, items);
		this.context = context;
		this.resource = resource;
		this.items = items;
	}
	
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		convertView = mInflater.inflate(R.layout.chat_adapter, null);
		ImageView senderView = (ImageView) convertView.findViewById(R.id.msg_sender);
		TextView senderText = (TextView) convertView.findViewById(R.id.sender_chat_txt);
		ImageView receiverView = (ImageView) convertView.findViewById(R.id.msg_receiver);
		TextView receiverText = (TextView) convertView.findViewById(R.id.receiver_chat_txt);
		
		senderView.setBackgroundResource(items.get(position).senderPic);
		senderText.setText(items.get(position).sendersMessage);
		receiverView.setBackgroundResource(items.get(position).receiverPic);
		receiverText.setText(items.get(position).ReceiverMessage);
		return convertView;
		
	}
	
	
}
