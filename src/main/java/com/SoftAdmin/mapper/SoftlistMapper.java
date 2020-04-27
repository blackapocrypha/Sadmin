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


    /**
     * 分页查询软件
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Softlist> getAllSoft(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	/**
	 * 根据id获取软件
	 * @param sid id
	 * @return
	 */
	Softlist getSoftDis(@Param("sid") String sid);

	/**
	 * 更新软件
	 * @param soft 软件
	 * @return
	 */
	int updateSoft(Softlist soft);
}