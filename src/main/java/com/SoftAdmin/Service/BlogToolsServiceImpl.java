package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogtools;
import com.SoftAdmin.mapper.BlogtoolsMapper;

@Service
public class BlogToolsServiceImpl implements BlogToolsService {

	@Resource
	private BlogtoolsMapper blogtoolsMapper;

	@Override
	public List<Blogtools> getAllBlogOnlineTools(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.getAllBlogOnlineTools(beforelimit,afterlimit);
	}

	@Override
	public int howmanywebs() {
		// TODO Auto-generated method stub
		return blogtoolsMapper.howmanywebs();
	}

	@Override
	public Blogtools memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.memberedit(nid);
	}

	@Override
	public Boolean updateToolsByid(Blogtools blogtools) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.updateByPrimaryKey(blogtools)>0;
	}

	@Override
	public Boolean addnewwebsite(Blogtools blogtools) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.insert(blogtools)>0;
	}

	@Override
	public Boolean deleteWeb(Integer nid) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.deleteWeb(nid)>0;
	}

	@Override
	public Blogtools selectWebByName(String webname) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.selectWebByName(webname);
	}
	
}
