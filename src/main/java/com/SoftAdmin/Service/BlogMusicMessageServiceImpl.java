package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogMusictalk;
import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.mapper.BlogMusictalkMapper;

@Service
public class BlogMusicMessageServiceImpl implements BlogMusicMessageService {

	@Resource
	private BlogMusictalkMapper BlogMusictalkMapper;

	/**
	 * 获取所有攻占工具留言
	 * @param beforelimit 网站工具留言前抑制点
	 * @param afterlimit  网站工具留言后抑制点
	 * @return
	 */
	@Override
	public List<BlogMusictalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	
	/**
	 * 总共多少条数据
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.howmanymessages();
	}

	
	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogMusictalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectByPrimaryKey(nid);
	}

	

	/**
	 * 根据id更新信息
	 * @param bt 工具网站信息
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogMusictalk bt) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.updateByPrimaryKey(bt)>0;
	}

	/**
	 * 获取所有id
	 * @return
	 */
	@Override
	public List<BlogMusictalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectAllIdAndTime();
	}

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogMusictalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectAllChosenByid(idlist);
	}

	
	/**
	 * 根据id删除对应信息
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
