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

	@Override
	public  List<Softlist> getAllSoft(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return softlistMapper.getAllSoft(beforelimit,afterlimit);
	}

	@Override
	public Softlist getSoftDis(String sid) {
		// TODO Auto-generated method stub
		return softlistMapper.getSoftDis(sid);
	}

	@Override
	public boolean updateSoft(Softlist soft) {
		// TODO Auto-generated method stub
		return softlistMapper.updateSoft(soft)>0;
	}
}
