package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogAgametalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogAgametalkMapper {
    int countByExample(BlogAgametalkExample example);

    int deleteByExample(BlogAgametalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogAgametalk record);

    int insertSelective(BlogAgametalk record);

    List<BlogAgametalk> selectByExample(BlogAgametalkExample example);

    BlogAgametalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogAgametalk record, @Param("example") BlogAgametalkExample example);

    int updateByExample(@Param("record") BlogAgametalk record, @Param("example") BlogAgametalkExample example);

    int updateByPrimaryKeySelective(BlogAgametalk record);

    int updateByPrimaryKey(BlogAgametalk record);
}