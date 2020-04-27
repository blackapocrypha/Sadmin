package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogAapptalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogAapptalkMapper {
    int countByExample(BlogAapptalkExample example);

    int deleteByExample(BlogAapptalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogAapptalk record);

    int insertSelective(BlogAapptalk record);

    List<BlogAapptalk> selectByExample(BlogAapptalkExample example);

    BlogAapptalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogAapptalk record, @Param("example") BlogAapptalkExample example);

    int updateByExample(@Param("record") BlogAapptalk record, @Param("example") BlogAapptalkExample example);

    int updateByPrimaryKeySelective(BlogAapptalk record);

    int updateByPrimaryKey(BlogAapptalk record);

    /**
     * 获取app分页留言信息
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogAapptalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	/**
	 * 共计多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 更新软件信息
	 * @param bt 信息
	 * @return
	 */
	Boolean updatemessageByid(BlogAapptalk bt);

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogAapptalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应软件信息
	 * @param idlist
	 * @return
	 */
	List<BlogAapptalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);

	/**
	 * 根据id获取对应信息
	 * @param nid
	 * @return
	 */
	BlogAapptalk memberedit(@Param("nid") Integer nid);
}