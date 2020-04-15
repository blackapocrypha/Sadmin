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

	@Override
	public List<BlogTxttalk> getAllToolMessage(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.getAllToolMessage(beforelimit,afterlimit);
	}

	@Override
	public int howmanymessages() {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.howmanymessages();
	}

	@Override
	public Boolean updatemessageByid(BlogTxttalk bt) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public List<BlogTxttalk> selectAllIdAndTime() {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectAllIdAndTime();
	}

	@Override
	public List<BlogTxttalk> selectAllChosenByid(List<Integer> idlist) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectAllChosenByid(idlist);
	}

	@Override
	public Boolean deletemessage(Integer nid) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public BlogTxttalk memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogTxttalkMapper.selectByPrimaryKey(nid);
	}
	
	
}
