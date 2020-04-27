package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogtools;

public interface BlogToolsService {

	/**
	 * 分页查询博客网站工具信息
	 * @param beforelimit 博客网站工具前抑制点
	 * @param afterlimit  博客网站工具后抑制点
	 * @return 
	 */
	List<Blogtools> getAllBlogOnlineTools(Integer beforelimit, Integer afterlimit);

	/**
	 * 共计多少数据
	 * @return
	 */
	int howmanywebs();

	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	Blogtools memberedit(Integer nid);

	/**
	 * 更新工具网站
	 * @param blogtools 信息
	 * @return
	 */
	Boolean updateToolsByid(Blogtools blogtools);

	/**
	 * 增加工具网站
	 * @param blogtools 网站信息
	 * @return
	 */
	Boolean addnewwebsite(Blogtools blogtools);

	/**
	 * 删除网站
	 * @param nid id
	 * @return
	 */
	Boolean deleteWeb(Integer nid);

	/**
	 * 根据名称查询对应网站
	 * @param webname 名称
	 * @return
	 */
	Blogtools selectWebByName(String webname);

}
