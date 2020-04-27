package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogTalk;

public interface BlogToolMessageService {

	/**
	 * 分页查询获取网站工具页面留言
	 * @param beforelimit 获取网站工具页面留言前抑制点
	 * @param afterlimit  获取网站工具页面留言后抑制点
	 * @return
	 */
	List<BlogTalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 根据id获取信息
	 * @param nid id
	 * @return
	 */
	BlogTalk memberedit(Integer nid);

	/**
	 * 更新留言
	 * @param bt 留言信息
	 * @return
	 */
	Boolean updatemessageByid(BlogTalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogTalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogTalk> selectAllChosenByid(List<Integer> idlist);

	/**
	 * 删除留言
	 * @param nid id
	 * @return
	 */
	Boolean deleteMessage(Integer nid);

}
