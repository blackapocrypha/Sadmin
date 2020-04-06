package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.bean.SoftadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftadminMapper {
    int countByExample(SoftadminExample example);

    int deleteByExample(SoftadminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Softadmin record);

    int insertSelective(Softadmin record);

    List<Softadmin> selectByExample(SoftadminExample example);

    Softadmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Softadmin record, @Param("example") SoftadminExample example);

    int updateByExample(@Param("record") Softadmin record, @Param("example") SoftadminExample example);

    int updateByPrimaryKeySelective(Softadmin record);

    int updateByPrimaryKey(Softadmin record);

	Softadmin login(Softadmin softadmin);
}