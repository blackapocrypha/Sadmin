package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogmusic;

public interface BlogMusicService {

	/**
	 * 获取分页查询的音乐资源
	 * @param beforelimit 音乐前抑制点
	 * @param afterlimit  音乐后抑制点
	 * @return
	 */
	List<Blogmusic> getAllmusic(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymusic();

	/**
	 * 根据id获取对应音乐
	 * @param nid id
	 * @return
	 */
	Blogmusic memberedit(Integer nid);

	
	/**
	 * 更新音乐
	 * @param bmusic 音乐信息
	 * @return
	 */
	Boolean updateMusic(Blogmusic bmusic);

	/**
	 * 添加音乐
	 * @param bmusic 音乐
	 * @return
	 */
	Boolean addmusic(Blogmusic bmusic);

	/**
	 * 根据id删除音乐
	 * @param nid id
	 * @return
	 */
	Boolean deletemusic(Integer nid);

	/**
	 * 更具名称查询音乐
	 * @param appname 音乐名
	 * @return
	 */
	Blogmusic selectmusicByName(String appname);

}
