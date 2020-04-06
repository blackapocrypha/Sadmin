package com.SoftAdmin.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.mapper.SoftadminMapper;

@Service
public class SoftAdminServiceImpl implements SoftAdminService {

	@Resource
	private SoftadminMapper softadminMapper;

	@Override
	public Softadmin login(Softadmin softadmin) {
		// TODO Auto-generated method stub
		return softadminMapper.login(softadmin);
	}
	
	
	
}
