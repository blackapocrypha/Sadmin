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

	@Override
	public List<Tsupport> getAllTsupport() {
		// TODO Auto-generated method stub
		return tsupportMapper.getAllTsupport();
	}

	@Override
	public Tsupport memberedit(Integer tid) {
		// TODO Auto-generated method stub
		return tsupportMapper.memberedit(tid);
	}

	@Override
	public boolean updateSupport(Tsupport tsupport) {
		// TODO Auto-generated method stub
		return tsupportMapper.updateByPrimaryKey(tsupport)>0;
	}
}
