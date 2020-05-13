package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogTalk;
import com.SoftAdmin.mapper.BlogTalkMapper;

@Service
public class BlogToolMessageServiceImpl implements BlogToolMessageService {

	@Resource
	private BlogTalkMapper blogTalkMapper;


	/**
	 * 分页查询获取网站工具页面留言
	 * @param beforelimit 获取网站工具页面留言前抑制点
	 * @param afterlimit  获取网站工具页面留言后抑制点
	 * @return
	 */
	@Override
	public List<BlogTalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogTalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	/**
	 * 总共多少数据
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogTalkMapper.howmanymessages();
	}

	/**
	 * 根据id获取信息
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogTalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectByPrimaryKey(nid);
	}

	/**
	 * 更新留言
	 * @param bt 留言信息
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogTalk bt) {
		// TODO Auto-generated method stub
		//return blogTalkMapper.updateByPrimaryKey(bt)>0;
		return blogTalkMapper.updateByPrimaryKeySelective(bt)>0;
	}

	/**
	 * 获取所有id
	 * @return
	 */
	@Override
	public List<BlogTalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectAllIdAndTime();
	}

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogTalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectAllChosenByid(idlist);
	}

	/**
	 * 删除留言
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deleteMessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogTalkMapper.deleteByPrimaryKey(nid)>0;
	}
}
