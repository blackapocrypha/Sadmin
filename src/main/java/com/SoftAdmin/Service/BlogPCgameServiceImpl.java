package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogpcgame;
import com.SoftAdmin.mapper.BlogpcgameMapper;

@Service
public class BlogPCgameServiceImpl implements BlogPCgameService {

	@Resource
	private BlogpcgameMapper blogpcgameMapper;

	/**
	 * 分页查询博客pc游戏信息
	 * @param beforelimit  查询博客pc游戏信息前抑制点
	 * @param afterlimit   查询博客pc游戏信息后抑制点
	 * @return
	 */
	@Override
	public List<Blogpcgame> getAllpcgames(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.getAllpcgames(beforelimit,afterlimit);
	}


	/**
	 * 总共多少信息
	 * @return
	 */
	@Override
	public int howmanypcgame() {
		// TODO Auto-generated method stub
		return blogpcgameMapper.howmanypcgame();
	}

	/**
	 * 根据id查询对应详情
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogpcgame memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.selectByPrimaryKey(nid);
	}


	/**
	 * 更新电脑游戏
	 * @param bpcgame 详情
	 * @return
	 */
	@Override
	public Boolean updatepcgameByid(Blogpcgame bpcgame) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.updateByPrimaryKey(bpcgame)>0;
	}


	/**
	 * 增加电脑游戏
	 * @param bpcgame 详情
	 * @return
	 */
	@Override
	public Boolean addnewpcgame(Blogpcgame bpcgame) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.insert(bpcgame)>0;
	}

	/**
	 * 删除游戏
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletegames(Integer nid) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 根据名称查询电脑游戏
	 * @param appname 游戏名
	 * @return
	 */
	@Override
	public Blogpcgame selectpcgameByName(String appname) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.selectpcgameByName(appname);
	}
	
	
}
