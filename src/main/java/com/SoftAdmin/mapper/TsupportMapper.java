package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Tsupport;
import com.SoftAdmin.bean.TsupportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsupportMapper {
    int countByExample(TsupportExample example);

    int deleteByExample(TsupportExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Tsupport record);

    int insertSelective(Tsupport record);

    List<Tsupport> selectByExample(TsupportExample example);

    Tsupport selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Tsupport record, @Param("example") TsupportExample example);

    int updateByExample(@Param("record") Tsupport record, @Param("example") TsupportExample example);

    int updateByPrimaryKeySelective(Tsupport record);

    int updateByPrimaryKey(Tsupport record);


    /**
     * 分页查询技术支持信息
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Tsupport> getAllTsupport();

	/**
	 * 根据id获取技术支持信息
	 * @param tid id
	 * @return
	 */
	Tsupport memberedit(@Param("tid") Integer tid);

	
}