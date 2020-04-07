package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Tsupport;

public interface TsupportService {

	List<Tsupport> getAllTsupport();

	Tsupport memberedit(Integer tid);

	boolean updateSupport(Tsupport tsupport);

}
