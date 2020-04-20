package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admintalkroom;
import com.SoftAdmin.bean.Softadmin;

public interface AdminTalkRoomService {

	List<Admintalkroom> getAllMessage(String month, String day);

	Boolean insert(Admintalkroom admin);

	List<Admintalkroom> getAllTalk();

	void clearOldMessage(Integer cha, int i, int j, int k, int l, int m);

	void clearOldMessageClear(int first);

	Integer getNumberOfTalk();

}
