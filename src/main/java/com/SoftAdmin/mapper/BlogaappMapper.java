package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogaapp;
import com.SoftAdmin.bean.BlogaappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogaappMapper {
    int countByExample(BlogaappExample example);

    int deleteByExample(BlogaappExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogaapp record);

    int insertSelective(Blogaapp record);

    List<Blogaapp> selectByExample(BlogaappExample example);

    Blogaapp selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogaapp record, @Param("example") BlogaappExample example);

    int updateByExample(@Param("record") Blogaapp record, @Param("example") BlogaappExample example);

    int updateByPrimaryKeySelective(Blogaapp record);

    int updateByPrimaryKey(Blogaapp record);
 
    /**
     * 获取app分页查询信息
     * @param beforelimit 前抑制点
     * @param afterlimit 后抑制点
     * @return
     */
	List<Blogaapp> getAllApp(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 总共度多少数据
	 * @return
	 */
	int howmanyapp();

	/**
	 * 根据名称查询对应app
	 * @param appname 名称
	 * @return
	 */
	Blogaapp selectappByName(@Param("appname") String appname);

	
}