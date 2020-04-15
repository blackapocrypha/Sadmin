package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogMusictalk;
import com.SoftAdmin.bean.BlogPcgametalk;

public interface BlogMusicMessageService {

	List<BlogMusictalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	BlogMusictalk memberedit(Integer nid);

	Boolean updatemessageByid(BlogMusictalk bt);

	List<BlogMusictalk> selectAllIdAndTime();

	List<BlogMusictalk> selectAllChosenByid(List<Integer> idlist);

	Boolean deletemessage(Integer nid);

}
