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

	@Override
	public List<BlogPcgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.howmanymessages();
	}

	@Override
	public BlogPcgametalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatemessageByid(BlogPcgametalk bt) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public List<BlogPcgametalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogPcgametalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.selectAllChosenByid(idlist);
	}

	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogPcgametalkMapper.deleteByPrimaryKey(nid)>0;
	}
	
}
