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

    /**
     * 分页查询网站工具页面博客留言
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogTalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);


	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogTalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id列表
	 * @return
	 */
	List<BlogTalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);
}