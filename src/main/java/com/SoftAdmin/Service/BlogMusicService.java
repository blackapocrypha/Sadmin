package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Blogmusic;

public interface BlogMusicService {

	List<Blogmusic> getAllmusic(Integer beforelimit, Integer afterlimit);

	int howmanymusic();

	Blogmusic memberedit(Integer nid);

	Boolean updateMusic(Blogmusic bmusic);

	Boolean addmusic(Blogmusic bmusic);

	Boolean deletemusic(Integer nid);

	Blogmusic selectmusicByName(String appname);

}
