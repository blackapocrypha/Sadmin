package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogtxt;
import com.SoftAdmin.bean.BlogtxtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogtxtMapper {
    int countByExample(BlogtxtExample example);

    int deleteByExample(BlogtxtExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogtxt record);

    int insertSelective(Blogtxt record);

    List<Blogtxt> selectByExample(BlogtxtExample example);

    Blogtxt selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogtxt record, @Param("example") BlogtxtExample example);

    int updateByExample(@Param("record") Blogtxt record, @Param("example") BlogtxtExample example);

    int updateByPrimaryKeySelective(Blogtxt record);

    int updateByPrimaryKey(Blogtxt record);
    
    /**
     * 分页查询电子书
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<Blogtxt> getAllBooks(@Param("beforelimit") Integer beforelimit, @Param("afterlimit") Integer afterlimit);

	/**
	 * 总共多少书籍
	 * @return
	 */
	int howmanybooks();

	/**
	 * 根据书名找书籍
	 * @param bookname 书名
	 * @return
	 */
	Blogtxt selectbookByName(@Param("bookname") String bookname);
}