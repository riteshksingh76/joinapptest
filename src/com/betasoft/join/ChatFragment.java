package com.betasoft.join;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ChatFragment extends Fragment {
	ListView chatListView;
	ArrayList<ChatBean> chatBean;
	ChatAdapter ca;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView =inflater.inflate(R.layout.activity_main,container,false);

		chatListView = (ListView) rootView.findViewById(R.id.chat_list);

		chatBean = new ArrayList<ChatBean>();
		chatBean.add(new ChatBean(R.drawable.img_thumbnail_slider, "Hi Lisa What's up", R.drawable.lisa_chat_icon, "Hi Daniel I'm fine"));
		chatBean.add(new ChatBean(R.drawable.img_thumbnail_slider, "You wana Join Gym", R.drawable.lisa_chat_icon, "Yes why not But where"));
		
		ca = new ChatAdapter(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, chatBean);
		chatListView.setAdapter(ca);
		chatListView.invalidate();
		
		return rootView;
	}


}
