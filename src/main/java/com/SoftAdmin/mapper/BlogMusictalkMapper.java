package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogMusictalk;
import com.SoftAdmin.bean.BlogMusictalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMusictalkMapper {
    int countByExample(BlogMusictalkExample example);

    int deleteByExample(BlogMusictalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogMusictalk record);

    int insertSelective(BlogMusictalk record);

    List<BlogMusictalk> selectByExample(BlogMusictalkExample example);

    BlogMusictalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogMusictalk record, @Param("example") BlogMusictalkExample example);

    int updateByExample(@Param("record") BlogMusictalk record, @Param("example") BlogMusictalkExample example);

    int updateByPrimaryKeySelective(BlogMusictalk record);

    int updateByPrimaryKey(BlogMusictalk record);

    /**
     * 分页查询音乐留言
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogMusictalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogMusictalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id列表
	 * @return
	 */
	List<BlogMusictalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);

	
}