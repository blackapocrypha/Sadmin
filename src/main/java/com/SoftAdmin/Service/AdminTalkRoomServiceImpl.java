package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Admintalkroom;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.mapper.AdmintalkroomMapper;


@Service
public class AdminTalkRoomServiceImpl implements AdminTalkRoomService {

	@Resource
	private AdmintalkroomMapper admintalkroomMapper;

	@Override
	public List<Admintalkroom> getAllMessage(String month, String day) {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getAllMessage(month,day);
	}

	
	@Override
	public Boolean insert(Admintalkroom admin) {
		// TODO Auto-generated method stub
		return admintalkroomMapper.insert(admin)>0;
	}


	@Override
	public List<Admintalkroom> getAllTalk() {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getAllTalk();
		}


	@Override
	public void clearOldMessage(Integer cha, int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		admintalkroomMapper.clearOldMessage(cha, i,j, k, l, m);
	}


	@Override
	public void clearOldMessageClear(int first) {
		// TODO Auto-generated method stub
		admintalkroomMapper.clearOldMessageClear(first);
	}


	@Override
	public Integer getNumberOfTalk() {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getNumberOfTalk();
	}

	
}
