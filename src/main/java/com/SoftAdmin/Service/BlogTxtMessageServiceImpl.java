package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogTxttalk;
import com.SoftAdmin.mapper.BlogTxttalkMapper;

@Service
public class BlogTxtMessageServiceImpl implements BlogTxtMessageService {

	@Resource
	private BlogTxttalkMapper blogTxttalkMapper;


	/**
	 * 分页查询博客书籍页面留言信息
	 * @param beforelimit 博客书籍页面留言前抑制点
	 * @param afterlimit  博客书籍页面留言后抑制点
	 * @return
	 */
	@Override
	public List<BlogTxttalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	/**
	 * 共计多少数据
	 * @return
	 */
	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.howmanymessages();
	}

	/**
	 * 更新留言
	 * @param bt 电子书籍留言
	 * @return
	 */
	@Override
	public Boolean updatemessageByid(BlogTxttalk bt) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.updateByPrimaryKey(bt)>0;
	}

	/**
	 * 获取所有id
	 * @return
	 */
	@Override
	public List<BlogTxttalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectAllIdAndTime();
	}

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	@Override
	public List<BlogTxttalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectAllChosenByid(idlist);
	}

	/**
	 * 删除对应电子书籍留言
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 根据id获取对应信息
	 * @param nid id
	 * @return
	 */
	@Override
	public BlogTxttalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectByPrimaryKey(nid);
	}
	
	
}
