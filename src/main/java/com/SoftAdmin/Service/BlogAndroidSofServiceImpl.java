package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogaapp;
import com.SoftAdmin.mapper.BlogaappMapper;

@Service
public class BlogAndroidSofServiceImpl implements BlogAndroidSofService {

	@Resource
	private BlogaappMapper blogaappMapper;

	@Override
	public List<Blogaapp> getAllApp(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogaappMapper.getAllApp(beforelimit,afterlimit);
	}

	@Override
	public int howmanyapp() {
		// TODO Auto-generated method stub
		return blogaappMapper.howmanyapp();
	}

	@Override
	public Blogaapp memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogaappMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updateappByid(Blogaapp ba) {
		// TODO Auto-generated method stub
		return blogaappMapper.updateByPrimaryKey(ba)>0;
	}

	@Override
	public Boolean addnewapp(Blogaapp ba) {
		// TODO Auto-generated method stub
		return blogaappMapper.insert(ba)>0;
	}

	@Override
	public Boolean deleteapp(Integer nid) {
		// TODO Auto-generated method stub
		return blogaappMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public Blogaapp selectappByName(String appname) {
		// TODO Auto-generated method stub
		return blogaappMapper.selectappByName(appname);
	}
}
