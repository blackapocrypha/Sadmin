package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Softlist;

public interface SoftListService {

	/**
	 * 分页查询软件展示列表信息
	 * @param beforelimit 软件展示列表前抑制点
	 * @param afterlimit  软件展示列表后抑制点
	 * @return
	 */
	List<Softlist> getAllSoft(Integer beforelimit,Integer afterlimit);

	/**
	 * 根据id获取软件信息
	 * @param sid id
	 * @return
	 */
	Softlist getSoftDis(String sid);

	/**
	 * 更新软件
	 * @param soft 软件信息
	 * @return
	 */
	boolean updateSoft(Softlist soft);

}
