package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.mapper.BlogAgametalkMapper;

@Service
public class BlogAndroidGameMessageServiceImpl implements BlogAndroidGameMessageService {

	@Resource
	private BlogAgametalkMapper blogAgametalkMapper;

	/**
	 * 获取在线网站工具页面信息
	 * @param beforelimit 在线网站工具前抑制点
	 * @param afterlimit 在线网站工具后抑制点
	 * @return
	 */
	@Override
	public List<BlogAgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	/**
	 * 总共多少数据
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.howmanymessages();
	}

	/**
	 * 根据id获取详情
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogAgametalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectByPrimaryKey(nid);
	}

	/**
	 * 根据Id更新详情
	 * @param bt 信息
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogAgametalk bt) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.updateByPrimaryKey(bt)>0;
	}

	/**
	 * 获取所有id
	 * @return
	 */
	@Override
	public List<BlogAgametalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectAllIdAndTime();
	}

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogAgametalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectAllChosenByid(idlist);
	}

	
	/**
	 * 删除信息
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
	
	
}
