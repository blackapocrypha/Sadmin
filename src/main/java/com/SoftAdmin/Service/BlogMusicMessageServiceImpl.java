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

	@Override
	public List<BlogMusictalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.howmanymessages();
	}

	@Override
	public BlogMusictalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatemessageByid(BlogMusictalk bt) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public List<BlogMusictalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogMusictalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.selectAllChosenByid(idlist);
	}

	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return BlogMusictalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
