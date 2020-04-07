package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogtxt;
import com.SoftAdmin.bean.BlogtxtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogtxtMapper {
    int countByExample(BlogtxtExample example);

    int deleteByExample(BlogtxtExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogtxt record);

    int insertSelective(Blogtxt record);

    List<Blogtxt> selectByExample(BlogtxtExample example);

    Blogtxt selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogtxt record, @Param("example") BlogtxtExample example);

    int updateByExample(@Param("record") Blogtxt record, @Param("example") BlogtxtExample example);

    int updateByPrimaryKeySelective(Blogtxt record);

    int updateByPrimaryKey(Blogtxt record);

	List<Blogtxt> getAllBooks(@Param("beforelimit") Integer beforelimit, @Param("afterlimit") Integer afterlimit);

	int howmanybooks();

	Blogtxt selectbookByName(@Param("bookname") String bookname);
}