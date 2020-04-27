package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.bean.BlogTxttalk;

public interface BlogPCgameMessageService {

	/**
	 * 获取所有pc游戏界面信息留言
	 * @param beforelimit pc游戏界面信息留言前抑制点
	 * @param afterlimit  pc游戏界面信息留言后抑制点
	 * @return
	 */
	List<BlogPcgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 根据id获取对应电脑游戏信息
	 * @param nid id
	 * @return
	 */
	BlogPcgametalk memberedit(Integer nid);

	/**
	 * 根据id更新留言信息
	 * @param bt 信息
	 * @return
	 */
	Boolean updatemessageByid(BlogPcgametalk bt);

	/**
	 * 查询所有id
	 * @return
	 */
	List<BlogPcgametalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogPcgametalk> selectAllChosenByid(List<Integer> idlist);

	
	/**
	 * 根据id删除留言
	 * @param nid
	 * @return
	 */
	Boolean deletemessage(Integer nid);

}
