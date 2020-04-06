package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogtools;
import com.SoftAdmin.bean.BlogtoolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogtoolsMapper {
    int countByExample(BlogtoolsExample example);

    int deleteByExample(BlogtoolsExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogtools record);

    int insertSelective(Blogtools record);

    List<Blogtools> selectByExample(BlogtoolsExample example);

    Blogtools selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogtools record, @Param("example") BlogtoolsExample example);

    int updateByExample(@Param("record") Blogtools record, @Param("example") BlogtoolsExample example);

    int updateByPrimaryKeySelective(Blogtools record);

    int updateByPrimaryKey(Blogtools record);
}