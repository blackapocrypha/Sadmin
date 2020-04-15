package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.bean.BlogTxttalk;

public interface BlogPCgameMessageService {

	List<BlogPcgametalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	BlogPcgametalk memberedit(Integer nid);

	Boolean updatemessageByid(BlogPcgametalk bt);

	List<BlogPcgametalk> selectAllIdAndTime();

	List<BlogPcgametalk> selectAllChosenByid(List<Integer> idlist);

	Boolean deletemessage(Integer nid);

}
