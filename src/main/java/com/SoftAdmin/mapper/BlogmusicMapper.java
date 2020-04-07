package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogmusic;
import com.SoftAdmin.bean.BlogmusicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogmusicMapper {
    int countByExample(BlogmusicExample example);

    int deleteByExample(BlogmusicExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogmusic record);

    int insertSelective(Blogmusic record);

    List<Blogmusic> selectByExample(BlogmusicExample example);

    Blogmusic selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogmusic record, @Param("example") BlogmusicExample example);

    int updateByExample(@Param("record") Blogmusic record, @Param("example") BlogmusicExample example);

    int updateByPrimaryKeySelective(Blogmusic record);

    int updateByPrimaryKey(Blogmusic record);

	List<Blogmusic> getAllmusic(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	int howmanymusic();

	Blogmusic selectmusicByName(@Param("appname")  String appname);
}