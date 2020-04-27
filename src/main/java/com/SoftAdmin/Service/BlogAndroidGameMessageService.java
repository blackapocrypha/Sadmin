package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.Blogagame;

public interface BlogAndroidGameMessageService {

	/**
	 * 获取在线网站工具页面信息
	 * @param beforelimit 在线网站工具前抑制点
	 * @param afterlimit 在线网站工具后抑制点
	 * @return
	 */
	List<BlogAgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 根据id获取详情
	 * @param nid id
	 * @return
	 */
	BlogAgametalk memberedit(Integer nid);

	/**
	 * 根据Id更新详情
	 * @param bt 信息
	 * @return
	 */
	Boolean updatemessageByid(BlogAgametalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogAgametalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogAgametalk> selectAllChosenByid(List<Integer> idlist);

	/**
	 * 删除信息
	 * @param nid id
	 * @return
	 */
	Boolean deletemessage(Integer nid);

}
