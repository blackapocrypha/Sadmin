package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Users;
import com.SoftAdmin.bean.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    /**
     * 分页查询用户
     * @param beforelimit 前抑制点
     * @param afterlimit  后抑制点
     * @return
     */
    List<Users> getAllUsers(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

    /**
     * 总共多少数据
     * @return
     */
	Integer howmanyusers();

	/**
	 * 根据用户名找用户
	 * @param username 账户
	 * @return
	 */
	Users getUsersByUsername(@Param("username") String username);

	/**
	 * 更新用户
	 * @param user 账户
	 * @return
	 */
	int updatePasswordByUsername(Users user);

	/**
	 * 删除用户
	 * @param username 账号
	 * @return
	 */
	int deleteUser(@Param("username") String username);

	/**
	 * 根据名称查找用户
	 * @param username 名称
	 * @return
	 */
	Users selectUsersByName(@Param("username") String username);
}