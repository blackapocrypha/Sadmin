package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.Blogagame;

public interface BlogAndroidGameMessageService {

	List<BlogAgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	BlogAgametalk memberedit(Integer nid);

	Boolean updatemessageByid(BlogAgametalk bt);

	List<BlogAgametalk> selectAllIdAndTime();

	List<BlogAgametalk> selectAllChosenByid(List<Integer> idlist);

	Boolean deletemessage(Integer nid);

}
