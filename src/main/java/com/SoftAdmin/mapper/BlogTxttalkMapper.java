package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogTxttalk;
import com.SoftAdmin.bean.BlogTxttalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTxttalkMapper {
    int countByExample(BlogTxttalkExample example);

    int deleteByExample(BlogTxttalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogTxttalk record);

    int insertSelective(BlogTxttalk record);

    List<BlogTxttalk> selectByExample(BlogTxttalkExample example);

    BlogTxttalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogTxttalk record, @Param("example") BlogTxttalkExample example);

    int updateByExample(@Param("record") BlogTxttalk record, @Param("example") BlogTxttalkExample example);

    int updateByPrimaryKeySelective(BlogTxttalk record);

    int updateByPrimaryKey(BlogTxttalk record);
}