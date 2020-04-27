package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogpcgame;
import com.SoftAdmin.bean.BlogpcgameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogpcgameMapper {
    int countByExample(BlogpcgameExample example);

    int deleteByExample(BlogpcgameExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogpcgame record);

    int insertSelective(Blogpcgame record);

    List<Blogpcgame> selectByExample(BlogpcgameExample example);

    Blogpcgame selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogpcgame record, @Param("example") BlogpcgameExample example);

    int updateByExample(@Param("record") Blogpcgame record, @Param("example") BlogpcgameExample example);

    int updateByPrimaryKeySelective(Blogpcgame record);

    int updateByPrimaryKey(Blogpcgame record);

    /**
     * 分页查询pc游戏
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Blogpcgame> getAllpcgames(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanypcgame();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id列表
	 * @return
	 */
	Blogpcgame selectpcgameByName(@Param("appname") String appname);
}