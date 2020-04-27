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

	/**
	 * 获取所有安卓软件
	 * @param beforelimit 安卓软件前抑制点
	 * @param afterlimit  安卓软件后抑制点
	 * @return
	 */
	@Override
	public List<Blogaapp> getAllApp(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogaappMapper.getAllApp(beforelimit,afterlimit);
	}

	/**
	 * 总共多少条数据
	 * @return
	 */
	@Override
	public int howmanyapp() {
		// TODO Auto-generated method stub
		return blogaappMapper.howmanyapp();
	}

	/**
	 * 根据id获取对应信息 
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogaapp memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogaappMapper.selectByPrimaryKey(nid);
	}

	/**
	 * 更新信息
	 * @param ba 信息
	 * @return
	 */
	@Override
	public Boolean updateappByid(Blogaapp ba) {
		// TODO Auto-generated method stub
		return blogaappMapper.updateByPrimaryKey(ba)>0;
	}

	/**
	 * 增加信息
	 * @param ba 信息
	 * @return
	 */
	@Override
	public Boolean addnewapp(Blogaapp ba) {
		// TODO Auto-generated method stub
		return blogaappMapper.insert(ba)>0;
	}

	
	/**
	 * 根据id删除app
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deleteapp(Integer nid) {
		// TODO Auto-generated method stub
		return blogaappMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 根据名称查询app
	 * @param appname 名称
	 * @return
	 */
	@Override
	public Blogaapp selectappByName(String appname) {
		// TODO Auto-generated method stub
		return blogaappMapper.selectappByName(appname);
	}
}
