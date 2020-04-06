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

    List<Users> getAllUsers(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	Integer howmanyusers();

	Users getUsersByUsername(@Param("username") String username);

	int updatePasswordByUsername(Users user);

	int deleteUser(@Param("username") String username);

	Users selectUsersByName(@Param("username") String username);
}