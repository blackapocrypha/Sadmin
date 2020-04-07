package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogtools;

public interface BlogToolsService {

	List<Blogtools> getAllBlogOnlineTools(Integer beforelimit, Integer afterlimit);

	int howmanywebs();

	Blogtools memberedit(Integer nid);

	Boolean updateToolsByid(Blogtools blogtools);

	Boolean addnewwebsite(Blogtools blogtools);

	Boolean deleteWeb(Integer nid);

	Blogtools selectWebByName(String webname);

}
