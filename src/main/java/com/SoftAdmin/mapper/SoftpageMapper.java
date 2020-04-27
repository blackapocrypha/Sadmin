package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Softpage;
import com.SoftAdmin.bean.SoftpageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftpageMapper {
    int countByExample(SoftpageExample example);

    int deleteByExample(SoftpageExample example);

    int deleteByPrimaryKey(Integer softid);

    int insert(Softpage record);

    int insertSelective(Softpage record);

    List<Softpage> selectByExample(SoftpageExample example);

    Softpage selectByPrimaryKey(Integer softid);

    int updateByExampleSelective(@Param("record") Softpage record, @Param("example") SoftpageExample example);

    int updateByExample(@Param("record") Softpage record, @Param("example") SoftpageExample example);

    int updateByPrimaryKeySelective(Softpage record);

    int updateByPrimaryKey(Softpage record);

    /**
     * 更新软件
     * @param sp 软件
     * @return
     */
	int updateSoft(Softpage sp);
}