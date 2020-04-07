package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogpcgame;

public interface BlogPCgameService {

	List<Blogpcgame> getAllpcgames(Integer beforelimit, Integer afterlimit);

	int howmanypcgame();

	Blogpcgame memberedit(Integer nid);

	Boolean updatepcgameByid(Blogpcgame bpcgame);

	Boolean addnewpcgame(Blogpcgame bpcgame);

	Boolean deletegames(Integer nid);

	Blogpcgame selectpcgameByName(String appname);

	
	
}
