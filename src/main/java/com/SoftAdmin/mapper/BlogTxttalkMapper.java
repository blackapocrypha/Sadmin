package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogAgametalk;
import com.SoftAdmin.bean.BlogTxttalk;
import com.SoftAdmin.bean.BlogTxttalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTxttalkMapper {
    int countByExample(BlogTxttalkExample example);

    int deleteByExample(BlogTxttalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogTxttalk record);

    int insertSelective(BlogTxttalk record);

    List<BlogTxttalk> selectByExample(BlogTxttalkExample example);

    BlogTxttalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogTxttalk record, @Param("example") BlogTxttalkExample example);

    int updateByExample(@Param("record") BlogTxttalk record, @Param("example") BlogTxttalkExample example);

    int updateByPrimaryKeySelective(BlogTxttalk record);

    int updateByPrimaryKey(BlogTxttalk record);

    /**
     * 分页查询博客电子书界面留言
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
	List<BlogTxttalk> getAllToolMessage(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 总共多少数据
	 * @return
	 */
	int howmanymessages();

	/**
	 * 获取所有id
	 * @return
	 */
	List<BlogTxttalk> selectAllIdAndTime();

	/**
	 * 根据id数组获取对应信息
	 * @param idlist id列表
	 * @return
	 */
	List<BlogTxttalk> selectAllChosenByid(@Param("idlist") List<Integer> idlist);



	
}