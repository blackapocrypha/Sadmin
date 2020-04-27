package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogTalk;
import com.SoftAdmin.mapper.BlogAapptalkMapper;

@Service
public class BlogAndroidAppMessageServiceImpl implements BlogAndroidAppMessageService {

	@Resource
	private BlogAapptalkMapper blogAapptalkMapper;

	/**
	 * 获取所有博客安卓软件页面留言
	 * @param beforelimit 分页查询前抑制点
	 * @param afterlimit 分页查询后抑制点
	 * @return
	 */
	@Override
	public List<BlogAapptalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	/**
	 * 多少条信息
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.howmanymessages();
	}

	/**
	 * 根据id更新
	 * @param bt 更新信息
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogAapptalk bt) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.updatemessageByid(bt);
	}

	/**
	 * 获取所有id
	 * @return
	 */
	@Override
	public List<BlogAapptalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectAllIdAndTime();
	}

	/**
	 * 根据id数组查询其对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogAapptalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectAllChosenByid(idlist);
	}

	/**
	 * 根据id获得信息
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogAapptalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectByPrimaryKey(nid);
	}

	/**
	 * 根据id删除
	 * @param nid id
 	 * @return
	 */
	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
