package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.bean.BlogPcgametalkExample;
import com.SoftAdmin.bean.BlogTxttalk;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPcgametalkMapper {
    int countByExample(BlogPcgametalkExample example);

    int deleteByExample(BlogPcgametalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogPcgametalk record);

    int insertSelective(BlogPcgametalk record);

    List<BlogPcgametalk> selectByExample(BlogPcgametalkExample example);

    BlogPcgametalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogPcgametalk record, @Param("example") BlogPcgametalkExample example);

    int updateByExample(@Param("record") BlogPcgametalk record, @Param("example") BlogPcgametalkExample example);

    int updateByPrimaryKeySelective(BlogPcgametalk record);

    int updateByPrimaryKey(BlogPcgametalk record);

    /**
     * 分页查询pc游戏界面留言
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogPcgametalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogPcgametalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id列表
	 * @return
	 */
	List<BlogPcgametalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);

	
}