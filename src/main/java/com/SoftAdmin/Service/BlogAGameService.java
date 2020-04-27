package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogagame;

public interface BlogAGameService {
	
	/**
	 * 获取所有安卓游戏
	 * @param beforelimit 分页查询首抑制点
	 * @param afterlimit 分页查询尾抑制点
	 * @return
	 */
	List<Blogagame> getAllAgames(Integer beforelimit, Integer afterlimit);

	/**
	 * 一共多少款安卓游戏
	 * @return
	 */
	int howmanyagame();

	/**
	 * 根据id获取安卓游戏信息
	 * @param nid id
	 * @return
	 */
	Blogagame memberedit(Integer nid);

	/**
	 * 根据id更新游戏
	 * @param bg 信息
	 * @return
	 */
	Boolean updateagameByid(Blogagame bg);

	/**
	 * 增加安卓游戏
	 * @param bg 游戏信息
	 * @return
	 */
	Boolean addnewandroidgame(Blogagame bg);

	/**
	 * 根据id删除游戏
	 * @param nid id
	 * @return
	 */
	Boolean deletegame(Integer nid);

	/**
	 * 根据软件名查询本体信息 
	 * @param appname 软件名
	 * @return
	 */
	Blogagame selectgameByName(String appname);

}
