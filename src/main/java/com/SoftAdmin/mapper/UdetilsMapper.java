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

    List<Udetils> getAllUsers(@Param("beforelimit") Integer beforelimit,@Param("afterlimit") Integer afterlimit);

	Udetils getUdetilsWhichUseToEdit(@Param("username") String username);

	int updateUdetilsByUphone(Udetils udetils);

	int addNewUser(@Param("fname") String fname,@Param("username") String username);

	int deleteUser(@Param("username") String username);

	Udetils selectUsersByName(@Param("username") String username);




}