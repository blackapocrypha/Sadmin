package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.UdetilsExample;
import com.SoftAdmin.bean.Users;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UdetilsMapper {
    int countByExample(UdetilsExample example);

    int deleteByExample(UdetilsExample example);

    int deleteByPrimaryKey(Integer udid);

    int insert(Udetils record);

    int insertSelective(Udetils record);

    List<Udetils> selectByExample(UdetilsExample example);

    Udetils selectByPrimaryKey(Integer udid);

    int updateByExampleSelective(@Param("record") Udetils record, @Param("example") UdetilsExample example);

    int updateByExample(@Param("record") Udetils record, @Param("example") UdetilsExample example);

    int updateByPrimaryKeySelective(Udetils record);

    int updateByPrimaryKey(Udetils record);


    /**
     * 分页查询所有会员详情
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
    List<Udetils> getAllUsers(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

    /**
     * 根据账户获取对应会员信息
     * @param username 账户
     * @return
     */
	Udetils getUdetilsWhichUseToEdit(@Param("username") String username);

	/**
	 * 更新会员信息
	 * @param udetils 信息
	 * @return
	 */
	int updateUdetilsByUphone(Udetils udetils);

	/**
	 * 添加会员
	 * @param fname 昵称
	 * @param username 账户
	 * @return
	 */
	int addNewUser(@Param("fname") String fname,@Param("username") String username);

	/**
	 * 删除会员
	 * @param username 账户
	 * @return
	 */
	int deleteUser(@Param("username") String username);

	/**
	 * 根据信息搜索对应账户
	 * @param username 名称
	 * @return
	 */
	Udetils selectUsersByName(@Param("username") String username);




}