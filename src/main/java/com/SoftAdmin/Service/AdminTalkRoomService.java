package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admintalkroom;
import com.SoftAdmin.bean.Softadmin;

public interface AdminTalkRoomService {

	/**
	 * 根据日期获取留言
	 * @param month 月份
	 * @param day 日期
	 * @return
	 */
	List<Admintalkroom> getAllMessage(String month, String day);

	/**
	 * 增加留言
	 * @param admin 留言
	 * @return
	 */
	Boolean insert(Admintalkroom admin);

	/**
	 * 获取所有留言
	 * @return
	 */
	List<Admintalkroom> getAllTalk();

	/**
	 * 只保留5天内留言
	 * @param cha 早些天
	 * @param i 前前天
	 * @param j 前昨天
	 * @param k 前天
	 * @param l 昨天
	 * @param m 今天
	 */
	void clearOldMessage(Integer cha, int i, int j, int k, int l, int m);

	/**
	 * 月初清理所有留言
	 * @param first 为1
	 */
	void clearOldMessageClear(int first);

	/**
	 * 总共多少条留言
	 * @return
	 */
	Integer getNumberOfTalk();

}
