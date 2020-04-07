package com.SoftAdmin.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Softpage;
import com.SoftAdmin.mapper.SoftpageMapper;

@Service
public class SoftPageServiceImpl implements SoftPageService {

	@Resource
	private SoftpageMapper softpageMapper;

	@Override
	public boolean updateSoft(Softpage sp) {
		// TODO Auto-generated method stub
		return softpageMapper.updateSoft(sp)>0;
	}
	
}
