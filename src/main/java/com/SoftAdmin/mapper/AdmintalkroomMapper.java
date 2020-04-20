package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Admintalkroom;
import com.SoftAdmin.bean.AdmintalkroomExample;
import com.SoftAdmin.bean.Softadmin;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmintalkroomMapper {
    int countByExample(AdmintalkroomExample example);

    int deleteByExample(AdmintalkroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admintalkroom record);

    int insertSelective(Admintalkroom record);

    List<Admintalkroom> selectByExample(AdmintalkroomExample example);

    Admintalkroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admintalkroom record, @Param("example") AdmintalkroomExample example);

    int updateByExample(@Param("record") Admintalkroom record, @Param("example") AdmintalkroomExample example);

    int updateByPrimaryKeySelective(Admintalkroom record);

    int updateByPrimaryKey(Admintalkroom record);
    /**
     * 
     * @param month 月份
     * @param day 日期
     * @return 获取当日留言
     */
	List<Admintalkroom> getAllMessage(@Param("month") String month,@Param("day")  String day);

	/**
	 * 
	 * @return 本周全部留言
	 */
	List<Admintalkroom> getAllTalk();

	/**
	 * 
	 * @param cha 别天
	 * @param i 前前天
	 * @param j 前昨天
	 * @param k 前天
	 * @param l 昨天
	 * @param m 今天
	 */
	void clearOldMessage(@Param("cha") Integer cha,@Param("i") int i,@Param("j") int j,@Param("k") int k,@Param("l") int l,@Param("m") int m);

	/**
	 * 
	 * @param first 月初
	 */
	void clearOldMessageClear(@Param("first") int first);

	/**
	 * 
	 * @return 留言总数
	 */
	Integer getNumberOfTalk();

	
}