package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAapptalk;

public interface BlogAndroidAppMessageService {

	List<BlogAapptalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	Boolean updatemessageByid(BlogAapptalk bt);

	List<BlogAapptalk> selectAllIdAndTime();

	List<BlogAapptalk> selectAllChosenByid(List<Integer> idlist);

	BlogAapptalk memberedit(Integer nid);

	Boolean deletemessage(Integer nid);

}
