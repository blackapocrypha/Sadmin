package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAapptalk;

public interface BlogAndroidAppMessageService {

	/**
	 * 获取所有博客安卓软件页面留言
	 * @param beforelimit 分页查询前抑制点
	 * @param afterlimit 分页查询后抑制点
	 * @return
	 */
	List<BlogAapptalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	/**
	 * 多少条信息
	 * @return
	 */
	int howmanymessages();

	/**
	 * 根据id更新
	 * @param bt 更新信息
	 * @return
	 */
	Boolean updatemessageByid(BlogAapptalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogAapptalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询其对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogAapptalk> selectAllChosenByid(List<Integer> idlist);

	/**
	 * 根据id获得信息
	 * @param nid id
	 * @return
	 */
	BlogAapptalk memberedit(Integer nid);

	/**
	 * 根据id删除
	 * @param nid id
 	 * @return
	 */
	Boolean deletemessage(Integer nid);

}
