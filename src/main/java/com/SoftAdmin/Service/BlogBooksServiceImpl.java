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

	/**
	 * 获取分页查询的图书展示
	 * @param beforelimit 图书展示前抑制点 
	 * @param afterlimit  图书展示后抑制点
	 * @return
	 */
	@Override
	public List<Blogtxt> getAllBooks(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogtxtMapper.getAllBooks(beforelimit,afterlimit);
	}

	/**
	 * 总共多少条数据
	 * @return
	 */
	@Override
	public int howmanybooks() {
		// TODO Auto-generated method stub
		return blogtxtMapper.howmanybooks();
	}

	/**
	 * 根据id获取信息
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogtxt memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogtxtMapper.selectByPrimaryKey(nid);
	}


	/**
	 * 根据id更新书籍信息
	 * @param bt 信息
	 * @return
	 */
	@Override
	public Boolean updatebookByid(Blogtxt bt) {
		// TODO Auto-generated method stub
		return blogtxtMapper.updateByPrimaryKey(bt)>0;
	}

	/**
	 * 增加新书
	 * @param bt 信息
	 * @return
	 */
	@Override
	public Boolean addnewbook(Blogtxt bt) {
		// TODO Auto-generated method stub
		return blogtxtMapper.insert(bt)>0;
	}

	/**
	 * 根据id删除书籍
	 * @param nid id
 	 * @return
	 */
	@Override
	public Boolean deletebooks(Integer nid) {
		// TODO Auto-generated method stub
		return blogtxtMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 根据名称查找书籍
	 * @param bookname 书名
	 * @return
	 */
	@Override
	public Blogtxt selectbookByName(String bookname) {
		// TODO Auto-generated method stub
		return blogtxtMapper.selectbookByName(bookname);
	}
}
