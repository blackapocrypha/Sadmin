package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Tsupport;

public interface TsupportService {

	/***
	 * 获取所有技术支持信息
	 * @return
	 */
	List<Tsupport> getAllTsupport();

	/**
	 * 根据id获取对应技术支持信息
	 * @param tid id
	 * @return
	 */
	Tsupport memberedit(Integer tid);

	/**
	 * 更新技术支持
	 * @param tsupport 信息
	 * @return
	 */
	boolean updateSupport(Tsupport tsupport);

}
