package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogpcgame;

public interface BlogPCgameService {

	/**
	 * 分页查询博客pc游戏信息
	 * @param beforelimit  查询博客pc游戏信息前抑制点
	 * @param afterlimit   查询博客pc游戏信息后抑制点
	 * @return
	 */
	List<Blogpcgame> getAllpcgames(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少信息
	 * @return
	 */
	int howmanypcgame();

	/**
	 * 根据id查询对应详情
	 * @param nid id
	 * @return
	 */
	Blogpcgame memberedit(Integer nid);

	/**
	 * 更新电脑游戏
	 * @param bpcgame 详情
	 * @return
	 */
	Boolean updatepcgameByid(Blogpcgame bpcgame);

	/**
	 * 增加电脑游戏
	 * @param bpcgame 详情
	 * @return
	 */
	Boolean addnewpcgame(Blogpcgame bpcgame);

	/**
	 * 删除游戏
	 * @param nid id
	 * @return
	 */
	Boolean deletegames(Integer nid);

	/**
	 * 根据名称查询电脑游戏
	 * @param appname 游戏名
	 * @return
	 */
	Blogpcgame selectpcgameByName(String appname);

	
	
}
