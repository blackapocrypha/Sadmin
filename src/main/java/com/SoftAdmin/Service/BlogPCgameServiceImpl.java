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

	@Override
	public List<Blogpcgame> getAllpcgames(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.getAllpcgames(beforelimit,afterlimit);
	}

	@Override
	public int howmanypcgame() {
		// TODO Auto-generated method stub
		return blogpcgameMapper.howmanypcgame();
	}

	@Override
	public Blogpcgame memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatepcgameByid(Blogpcgame bpcgame) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.updateByPrimaryKey(bpcgame)>0;
	}

	@Override
	public Boolean addnewpcgame(Blogpcgame bpcgame) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.insert(bpcgame)>0;
	}

	@Override
	public Boolean deletegames(Integer nid) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public Blogpcgame selectpcgameByName(String appname) {
		// TODO Auto-generated method stub
		return blogpcgameMapper.selectpcgameByName(appname);
	}
	
	
}
