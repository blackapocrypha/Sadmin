package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogaapp;

public interface BlogAndroidSofService {

	/**
	 * 获取所有安卓软件
	 * @param beforelimit 安卓软件前抑制点
	 * @param afterlimit  安卓软件后抑制点
	 * @return
	 */
	List<Blogaapp> getAllApp(Integer beforelimit,Integer afterlimit);

	/**
	 * 总共多少条数据
	 * @return
	 */
	int howmanyapp();

	/**
	 * 根据id获取对应信息 
	 * @param nid id
	 * @return
	 */
	Blogaapp memberedit(Integer nid);

	/**
	 * 更新信息
	 * @param ba 信息
	 * @return
	 */
	Boolean updateappByid(Blogaapp ba);

	/**
	 * 增加信息
	 * @param ba 信息
	 * @return
	 */
	Boolean addnewapp(Blogaapp ba);

	/**
	 * 根据id删除app
	 * @param nid id
	 * @return
	 */
	Boolean deleteapp(Integer nid);

	/**
	 * 根据名称查询app
	 * @param appname 名称
	 * @return
	 */
	Blogaapp selectappByName(String appname);

}
