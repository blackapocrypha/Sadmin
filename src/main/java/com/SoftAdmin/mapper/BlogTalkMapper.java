package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogTalk;
import com.SoftAdmin.bean.BlogTalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTalkMapper {
    int countByExample(BlogTalkExample example);

    int deleteByExample(BlogTalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogTalk record);

    int insertSelective(BlogTalk record);

    List<BlogTalk> selectByExample(BlogTalkExample example);

    BlogTalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogTalk record, @Param("example") BlogTalkExample example);

    int updateByExample(@Param("record") BlogTalk record, @Param("example") BlogTalkExample example);

    int updateByPrimaryKeySelective(BlogTalk record);

    int updateByPrimaryKey(BlogTalk record);

	List<BlogTalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	int howmanymessages();

	List<BlogTalk> selectAllIdAndTime();

	List<BlogTalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);
}