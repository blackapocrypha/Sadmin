package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogsearch;
import com.SoftAdmin.bean.BlogsearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsearchMapper {
    int countByExample(BlogsearchExample example);

    int deleteByExample(BlogsearchExample example);

    int deleteByPrimaryKey(Integer blogid);

    int insert(Blogsearch record);

    int insertSelective(Blogsearch record);

    List<Blogsearch> selectByExample(BlogsearchExample example);

    Blogsearch selectByPrimaryKey(Integer blogid);

    int updateByExampleSelective(@Param("record") Blogsearch record, @Param("example") BlogsearchExample example);

    int updateByExample(@Param("record") Blogsearch record, @Param("example") BlogsearchExample example);

    int updateByPrimaryKeySelective(Blogsearch record);

    int updateByPrimaryKey(Blogsearch record);
}