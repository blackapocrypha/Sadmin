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

	@Override
	public List<BlogAapptalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.howmanymessages();
	}

	@Override
	public Boolean updatemessageByid(BlogAapptalk bt) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.updatemessageByid(bt);
	}

	@Override
	public List<BlogAapptalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogAapptalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectAllChosenByid(idlist);
	}

	@Override
	public BlogAapptalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogAapptalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
