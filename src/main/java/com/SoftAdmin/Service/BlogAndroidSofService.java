package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogaapp;

public interface BlogAndroidSofService {

	List<Blogaapp> getAllApp(Integer beforelimit,Integer afterlimit);

	int howmanyapp();

	Blogaapp memberedit(Integer nid);

	Boolean updateappByid(Blogaapp ba);

	Boolean addnewapp(Blogaapp ba);

	Boolean deleteapp(Integer nid);

	Blogaapp selectappByName(String appname);

}
