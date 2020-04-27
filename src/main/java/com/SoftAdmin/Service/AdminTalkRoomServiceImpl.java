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

	/**
	 * 根据日期获取留言
	 * @param month 月份
	 * @param day 日期
	 * @return
	 */
	@Override
	public List<Admintalkroom> getAllMessage(String month, String day) {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getAllMessage(month,day);
	}

	/**
	 * 增加留言
	 * @param admin 留言
	 * @return
	 */
	@Override
	public Boolean insert(Admintalkroom admin) {
		// TODO Auto-generated method stub
		return admintalkroomMapper.insert(admin)>0;
	}


	/**
	 * 获取所有留言
	 * @return
	 */
	@Override
	public List<Admintalkroom> getAllTalk() {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getAllTalk();
		}

	/**
	 * 只保留5天内留言
	 * @param cha 早些天
	 * @param i 前前天
	 * @param j 前昨天
	 * @param k 前天
	 * @param l 昨天
	 * @param m 今天
	 */
	@Override
	public void clearOldMessage(Integer cha, int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		admintalkroomMapper.clearOldMessage(cha, i,j, k, l, m);
	}


	/**
	 * 月初清理所有留言
	 * @param first 为1
	 */
	@Override
	public void clearOldMessageClear(int first) {
		// TODO Auto-generated method stub
		admintalkroomMapper.clearOldMessageClear(first);
	}


	/**
	 * 总共多少条留言
	 * @return
	 */
	@Override
	public Integer getNumberOfTalk() {
		// TODO Auto-generated method stub
		return admintalkroomMapper.getNumberOfTalk();
	}

	
}
