package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogtxt;

public interface BlogBooksService {

	/**
	 * 获取分页查询的图书展示
	 * @param beforelimit 图书展示前抑制点 
	 * @param afterlimit  图书展示后抑制点
	 * @return
	 */
	List<Blogtxt> getAllBooks(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少条数据
	 * @return
	 */
	int howmanybooks();

	/**
	 * 根据id获取信息
	 * @param nid id
	 * @return
	 */
	Blogtxt memberedit(Integer nid);

	/**
	 * 根据id更新书籍信息
	 * @param bt 信息
	 * @return
	 */
	Boolean updatebookByid(Blogtxt bt);

	/**
	 * 增加新书
	 * @param bt 信息
	 * @return
	 */
	Boolean addnewbook(Blogtxt bt);

	/**
	 * 根据id删除书籍
	 * @param nid id
 	 * @return
	 */
	Boolean deletebooks(Integer nid);

	/**
	 * 根据名称查找书籍
	 * @param bookname 书名
	 * @return
	 */
	Blogtxt selectbookByName(String bookname);

}
