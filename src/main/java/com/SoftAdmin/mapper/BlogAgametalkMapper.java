package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogAgametalkExample;
import com.SoftAdmin.bean.Blogagame;

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

    /**
     * 分页查询获取安卓游戏界面留言
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogAgametalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 共计多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 查询所有id
	 * @return
	 */
	List<BlogAgametalk> selectAllIdAndTime();

	/**
	 * 根据id数组查询对应信息
	 * @param idlist id数组
	 * @return
	 */
	List<BlogAgametalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);
}