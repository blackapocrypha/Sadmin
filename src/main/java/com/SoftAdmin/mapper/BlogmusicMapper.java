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

    /**
     * 分页查询获取音乐信息
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Blogmusic> getAllmusic(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 共计多少数据
	 * @return
	 */
	int howmanymusic();

	/**
	 * 根据名称获取对应信息
	 * @param appname 名称
	 * @return
	 */
	Blogmusic selectmusicByName(@Param("appname")  String appname);
}