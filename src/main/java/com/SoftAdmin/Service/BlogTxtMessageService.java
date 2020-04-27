package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogTxttalk;

public interface BlogTxtMessageService {

	/**
	 * 分页查询博客书籍页面留言信息
	 * @param beforelimit 博客书籍页面留言前抑制点
	 * @param afterlimit  博客书籍页面留言后抑制点
	 * @return
	 */
	List<BlogTxttalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	/**
	 * 共计多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 更新留言
	 * @param bt 电子书籍留言
	 * @return
	 */
	Boolean updatemessageByid(BlogTxttalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogTxttalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogTxttalk> selectAllChosenByid(List<Integer> idlist);

	/**
	 * 删除对应电子书籍留言
	 * @param nid id
	 * @return
	 */
	Boolean deletemessage(Integer nid);

	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	BlogTxttalk memberedit(Integer nid);

}
