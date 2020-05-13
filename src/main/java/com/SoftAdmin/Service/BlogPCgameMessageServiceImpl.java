package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.bean.BlogTxttalk;
import com.SoftAdmin.mapper.BlogPcgametalkMapper;

@Service
public class BlogPCgameMessageServiceImpl implements BlogPCgameMessageService {

	@Resource
	private BlogPcgametalkMapper blogPcgametalkMapper;

	/**
	 * 获取所有pc游戏界面信息留言
	 * @param beforelimit pc游戏界面信息留言前抑制点
	 * @param afterlimit  pc游戏界面信息留言后抑制点
	 * @return
	 */
	@Override
	public List<BlogPcgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	/**
	 * 总共多少数据
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.howmanymessages();
	}

	/**
	 * 根据id获取对应电脑游戏信息
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogPcgametalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectByPrimaryKey(nid);
	}

	

	/**
	 * 根据id更新留言信息
	 * @param bt 信息
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogPcgametalk bt) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.updateByPrimaryKeySelective(bt)>0;
	}


	/**
	 * 查询所有id
	 * @return
	 */
	@Override
	public List<BlogPcgametalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectAllIdAndTime();
	}


	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogPcgametalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectAllChosenByid(idlist);
	}

	
	/**
	 * 根据id删除留言
	 * @param nid
	 * @return
	 */
	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
