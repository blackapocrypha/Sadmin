package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.mapper.BlogagameMapper;

@Service
public class BlogAGameServiceImpl implements BlogAGameService {

	@Resource
	private BlogagameMapper blogagameMapper;

	/**
	 * 获取所有安卓游戏
	 * @param beforelimit 分页查询首抑制点
	 * @param afterlimit 分页查询尾抑制点
	 * @return
	 */
	@Override
	public List<Blogagame> getAllAgames(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogagameMapper.getAllAgames(beforelimit,afterlimit);
	}

	/**
	 * 一共多少款安卓游戏
	 * @return
	 */
	@Override
	public int howmanyagame() {
		// TODO Auto-generated method stub
		return blogagameMapper.howmanyagame();
	}

	/**
	 * 根据id获取安卓游戏信息
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogagame memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogagameMapper.selectByPrimaryKey(nid);
	}

	/**
	 * 根据id更新游戏
	 * @param bg 信息
	 * @return
	 */
	@Override
	public Boolean updateagameByid(Blogagame bg) {
		// TODO Auto-generated method stub
		return blogagameMapper.updateByPrimaryKey(bg)>0;
	}

	
	/**
	 * 增加安卓游戏
	 * @param bg 游戏信息
	 * @return
	 */
	@Override
	public Boolean addnewandroidgame(Blogagame bg) {
		// TODO Auto-generated method stub
		return blogagameMapper.insert(bg)>0;
	}

	/**
	 * 根据id删除游戏
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletegame(Integer nid) {
		// TODO Auto-generated method stub
		return blogagameMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 根据软件名查询本体信息 
	 * @param appname 软件名
	 * @return
	 */
	@Override
	public Blogagame selectgameByName(String appname) {
		// TODO Auto-generated method stub
		return blogagameMapper.selectgameByName(appname);
	}
	
}
