package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogtools;
import com.SoftAdmin.bean.BlogtoolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogtoolsMapper {
    int countByExample(BlogtoolsExample example);

    int deleteByExample(BlogtoolsExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogtools record);

    int insertSelective(Blogtools record);

    List<Blogtools> selectByExample(BlogtoolsExample example);

    Blogtools selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogtools record, @Param("example") BlogtoolsExample example);

    int updateByExample(@Param("record") Blogtools record, @Param("example") BlogtoolsExample example);

    int updateByPrimaryKeySelective(Blogtools record);

    int updateByPrimaryKey(Blogtools record);


    /**
     * 分页查询工具网站
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Blogtools> getAllBlogOnlineTools(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanywebs();

	/**
	 * 根据id获取信息
	 * @param nid id
	 * @return
	 */
	Blogtools memberedit(@Param("nid") Integer nid);

	/**
	 * 删除信息
	 * @param nid id
	 * @return
	 */
	int deleteWeb(@Param("nid")  Integer nid);

	/**
	 * 根据名称查找对应网站
	 * @param webname 名称
	 * @return
	 */
	Blogtools selectWebByName(@Param("webname")  String webname);

	
}