package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogMusictalk;
import com.SoftAdmin.bean.BlogPcgametalk;

public interface BlogMusicMessageService {

	/**
	 * 获取所有攻占工具留言
	 * @param beforelimit 网站工具留言前抑制点
	 * @param afterlimit  网站工具留言后抑制点
	 * @return
	 */
	List<BlogMusictalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	
	/**
	 * 总共多少条数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	BlogMusictalk memberedit(Integer nid);

	/**
	 * 根据id更新信息
	 * @param bt 工具网站信息
	 * @return
	 */
	Boolean updatemessageByid(BlogMusictalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogMusictalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogMusictalk> selectAllChosenByid(List<Integer> idlist);

	
	/**
	 * 根据id删除对应信息
	 * @param nid id
	 * @return
	 */
	Boolean deletemessage(Integer nid);

}
