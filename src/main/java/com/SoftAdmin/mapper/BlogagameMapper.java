package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.bean.BlogagameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogagameMapper {
    int countByExample(BlogagameExample example);

    int deleteByExample(BlogagameExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogagame record);

    int insertSelective(Blogagame record);

    List<Blogagame> selectByExample(BlogagameExample example);

    Blogagame selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogagame record, @Param("example") BlogagameExample example);

    int updateByExample(@Param("record") Blogagame record, @Param("example") BlogagameExample example);

    int updateByPrimaryKeySelective(Blogagame record);

    int updateByPrimaryKey(Blogagame record);

    /**
     * 获取安卓游戏分页查询信息
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Blogagame> getAllAgames(@Param("beforelimit")  Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanyagame();

	/**
	 * 根据名称查询详情
	 * @param appname
	 * @return
	 */
	Blogagame selectgameByName(@Param("appname") String appname);
}