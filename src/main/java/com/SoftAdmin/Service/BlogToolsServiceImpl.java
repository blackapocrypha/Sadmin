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


	/**
	 * 分页查询博客网站工具信息
	 * @param beforelimit 博客网站工具前抑制点
	 * @param afterlimit  博客网站工具后抑制点
	 * @return 
	 */
	@Override
	public List<Blogtools> getAllBlogOnlineTools(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.getAllBlogOnlineTools(beforelimit,afterlimit);
	}

	/**
	 * 共计多少数据
	 * @return
	 */
	@Override
	public int howmanywebs() {
		// TODO Auto-generated method stub
		return blogtoolsMapper.howmanywebs();
	}

	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogtools memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.memberedit(nid);
	}

	/**
	 * 更新工具网站
	 * @param blogtools 信息
	 * @return
	 */
	@Override
	public Boolean updateToolsByid(Blogtools blogtools) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.updateByPrimaryKey(blogtools)>0;
	}

	/**
	 * 增加工具网站
	 * @param blogtools 网站信息
	 * @return
	 */
	@Override
	public Boolean addnewwebsite(Blogtools blogtools) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.insert(blogtools)>0;
	}

	/**
	 * 删除网站
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deleteWeb(Integer nid) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.deleteWeb(nid)>0;
	}

	/**
	 * 根据名称查询对应网站
	 * @param webname 名称
	 * @return
	 */
	@Override
	public Blogtools selectWebByName(String webname) {
		// TODO Auto-generated method stub
		return blogtoolsMapper.selectWebByName(webname);
	}
	
}
