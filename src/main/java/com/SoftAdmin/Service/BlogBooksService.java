package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogtxt;

public interface BlogBooksService {

	List<Blogtxt> getAllBooks(Integer beforelimit, Integer afterlimit);

	int howmanybooks();

	Blogtxt memberedit(Integer nid);

	Boolean updatebookByid(Blogtxt bt);

	Boolean addnewbook(Blogtxt bt);

	Boolean deletebooks(Integer nid);

	Blogtxt selectbookByName(String bookname);

}
