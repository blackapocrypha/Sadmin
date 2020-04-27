package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Tsupport;
import com.SoftAdmin.mapper.TsupportMapper;

@Service
public class TsupportServiceImpl implements TsupportService {

	@Resource
	private TsupportMapper tsupportMapper;

	/***
	 * 获取所有技术支持信息
	 * @return
	 */
	@Override
	public List<Tsupport> getAllTsupport() {
		// TODO Auto-generated method stub
		return tsupportMapper.getAllTsupport();
	}

	/**
	 * 根据id获取对应技术支持信息
	 * @param tid id
	 * @return
	 */
	@Override
	public Tsupport memberedit(Integer tid) {
		// TODO Auto-generated method stub
		return tsupportMapper.memberedit(tid);
	}
	
	/**
	 * 更新技术支持
	 * @param tsupport 信息
	 * @return
	 */
	@Override
	public boolean updateSupport(Tsupport tsupport) {
		// TODO Auto-generated method stub
		return tsupportMapper.updateByPrimaryKey(tsupport)>0;
	}
}
