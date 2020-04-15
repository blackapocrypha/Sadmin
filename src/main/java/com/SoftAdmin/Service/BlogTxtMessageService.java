package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogTxttalk;

public interface BlogTxtMessageService {

	List<BlogTxttalk> getAllToolMessage(Integer beforelimit, Integer afterlimit);

	int howmanymessages();

	Boolean updatemessageByid(BlogTxttalk bt);

	List<BlogTxttalk> selectAllIdAndTime();

	List<BlogTxttalk> selectAllChosenByid(List<Integer> idlist);

	Boolean deletemessage(Integer nid);

	BlogTxttalk memberedit(Integer nid);

}
