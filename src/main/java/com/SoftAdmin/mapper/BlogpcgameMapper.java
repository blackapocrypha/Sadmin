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
}