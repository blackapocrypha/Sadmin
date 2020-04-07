package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Softlist;

public interface SoftListService {

	 List<Softlist> getAllSoft(Integer beforelimit,Integer afterlimit);

	Softlist getSoftDis(String sid);

	boolean updateSoft(Softlist soft);

}
