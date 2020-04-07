package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogmusic;
import com.SoftAdmin.mapper.BlogmusicMapper;

@Service
public class BlogMusicServiceImpl implements BlogMusicService {

	@Resource
	private BlogmusicMapper blogmusicMapper;

	@Override
	public List<Blogmusic> getAllmusic(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogmusicMapper.getAllmusic(beforelimit,afterlimit);
	}

	@Override
	public int howmanymusic() {
		// TODO Auto-generated method stub
		return blogmusicMapper.howmanymusic();
	}

	@Override
	public Blogmusic memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogmusicMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updateMusic(Blogmusic bmusic) {
		// TODO Auto-generated method stub
		return blogmusicMapper.updateByPrimaryKey(bmusic)>0;
	}

	@Override
	public Boolean addmusic(Blogmusic bmusic) {
		// TODO Auto-generated method stub
		return blogmusicMapper.insert(bmusic)>0;
	}

	@Override
	public Boolean deletemusic(Integer nid) {
		// TODO Auto-generated method stub
		return blogmusicMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public Blogmusic selectmusicByName(String appname) {
		// TODO Auto-generated method stub
		return blogmusicMapper.selectmusicByName(appname);
	}
	
}
