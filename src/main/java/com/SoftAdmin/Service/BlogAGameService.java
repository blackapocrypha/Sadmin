package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogagame;

public interface BlogAGameService {

	List<Blogagame> getAllAgames(Integer beforelimit, Integer afterlimit);

	int howmanyagame();

	Blogagame memberedit(Integer nid);

	Boolean updateagameByid(Blogagame bg);

	Boolean addnewandroidgame(Blogagame bg);

	Boolean deletegame(Integer nid);

	Blogagame selectgameByName(String appname);

}
