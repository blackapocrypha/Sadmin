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

	@Override
	public List<BlogAgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.howmanymessages();
	}

	@Override
	public BlogAgametalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatemessageByid(BlogAgametalk bt) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public List<BlogAgametalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogAgametalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.selectAllChosenByid(idlist);
	}

	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogAgametalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
	
	
}
