package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Softlist;
import com.SoftAdmin.bean.SoftlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftlistMapper {
    int countByExample(SoftlistExample example);

    int deleteByExample(SoftlistExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Softlist record);

    int insertSelective(Softlist record);

    List<Softlist> selectByExample(SoftlistExample example);

    Softlist selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Softlist record, @Param("example") SoftlistExample example);

    int updateByExample(@Param("record") Softlist record, @Param("example") SoftlistExample example);

    int updateByPrimaryKeySelective(Softlist record);

    int updateByPrimaryKey(Softlist record);

	List<Softlist> getAllSoft(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	Softlist getSoftDis(@Param("sid") String sid);

	int updateSoft(Softlist soft);
}