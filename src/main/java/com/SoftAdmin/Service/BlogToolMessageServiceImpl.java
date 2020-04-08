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

	@Override
	public List<BlogTalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogTalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogTalkMapper.howmanymessages();
	}

	@Override
	public BlogTalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatemessageByid(BlogTalk bt) {
		// TODO Auto-generated method stub
		return blogTalkMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public List<BlogTalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogTalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogTalkMapper.selectAllChosenByid(idlist);
	}
}
