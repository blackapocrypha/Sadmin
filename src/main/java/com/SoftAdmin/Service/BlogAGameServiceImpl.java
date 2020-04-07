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

	@Override
	public List<Blogagame> getAllAgames(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogagameMapper.getAllAgames(beforelimit,afterlimit);
	}

	@Override
	public int howmanyagame() {
		// TODO Auto-generated method stub
		return blogagameMapper.howmanyagame();
	}

	@Override
	public Blogagame memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogagameMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updateagameByid(Blogagame bg) {
		// TODO Auto-generated method stub
		return blogagameMapper.updateByPrimaryKey(bg)>0;
	}

	@Override
	public Boolean addnewandroidgame(Blogagame bg) {
		// TODO Auto-generated method stub
		return blogagameMapper.insert(bg)>0;
	}

	@Override
	public Boolean deletegame(Integer nid) {
		// TODO Auto-generated method stub
		return blogagameMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public Blogagame selectgameByName(String appname) {
		// TODO Auto-generated method stub
		return blogagameMapper.selectgameByName(appname);
	}
	
}
