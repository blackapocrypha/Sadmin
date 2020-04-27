package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Softlist;
import com.SoftAdmin.mapper.SoftlistMapper;

@Service
public class SoftListServiceImpl implements SoftListService {

	@Resource
	private SoftlistMapper softlistMapper;

	/**
	 * 分页查询软件展示列表信息
	 * @param beforelimit 软件展示列表前抑制点
	 * @param afterlimit  软件展示列表后抑制点
	 * @return
	 */
	@Override
	public  List<Softlist> getAllSoft(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return softlistMapper.getAllSoft(beforelimit,afterlimit);
	}

	/**
	 * 根据id获取软件信息
	 * @param sid id
	 * @return
	 */
	@Override
	public Softlist getSoftDis(String sid) {
		// TODO Auto-generated method stub
		return softlistMapper.getSoftDis(sid);
	}

	/**
	 * 更新软件
	 * @param soft 软件信息
	 * @return
	 */
	@Override
	public boolean updateSoft(Softlist soft) {
		// TODO Auto-generated method stub
		return softlistMapper.updateSoft(soft)>0;
	}
}
