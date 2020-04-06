package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Ufaver;
import com.SoftAdmin.bean.UfaverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UfaverMapper {
    int countByExample(UfaverExample example);

    int deleteByExample(UfaverExample example);

    int insert(Ufaver record);

    int insertSelective(Ufaver record);

    List<Ufaver> selectByExample(UfaverExample example);

    int updateByExampleSelective(@Param("record") Ufaver record, @Param("example") UfaverExample example);

    int updateByExample(@Param("record") Ufaver record, @Param("example") UfaverExample example);
}