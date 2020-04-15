package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogTalk;

public interface BlogToolMessageService {

	List<BlogTalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	BlogTalk memberedit(Integer nid);

	Boolean updatemessageByid(BlogTalk bt);

	List<BlogTalk> selectAllIdAndTime();

	List<BlogTalk> selectAllChosenByid(List<Integer> idlist);

	Boolean deleteMessage(Integer nid);

}
