package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogtxt;
import com.SoftAdmin.mapper.BlogtxtMapper;

@Service
public class BlogBooksServiceImpl implements BlogBooksService {

	@Resource
	private BlogtxtMapper blogtxtMapper;

	@Override
	public List<Blogtxt> getAllBooks(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogtxtMapper.getAllBooks(beforelimit,afterlimit);
	}

	@Override
	public int howmanybooks() {
		// TODO Auto-generated method stub
		return blogtxtMapper.howmanybooks();
	}

	@Override
	public Blogtxt memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogtxtMapper.selectByPrimaryKey(nid);
	}

	@Override
	public Boolean updatebookByid(Blogtxt bt) {
		// TODO Auto-generated method stub
		return blogtxtMapper.updateByPrimaryKey(bt)>0;
	}

	@Override
	public Boolean addnewbook(Blogtxt bt) {
		// TODO Auto-generated method stub
		return blogtxtMapper.insert(bt)>0;
	}

	@Override
	public Boolean deletebooks(Integer nid) {
		// TODO Auto-generated method stub
		return blogtxtMapper.deleteByPrimaryKey(nid)>0;
	}

	@Override
	public Blogtxt selectbookByName(String bookname) {
		// TODO Auto-generated method stub
		return blogtxtMapper.selectbookByName(bookname);
	}
}
