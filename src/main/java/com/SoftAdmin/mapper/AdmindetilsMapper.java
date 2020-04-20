package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.AdmindetilsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmindetilsMapper {
    int countByExample(AdmindetilsExample example);

    int deleteByExample(AdmindetilsExample example);

    int insert(Admindetils record);

    int insertSelective(Admindetils record);

    List<Admindetils> selectByExample(AdmindetilsExample example);

    int updateByExampleSelective(@Param("record") Admindetils record, @Param("example") AdmindetilsExample example);

    int updateByExample(@Param("record") Admindetils record, @Param("example") AdmindetilsExample example);

    /**
     * 
     * @param username 用户名
     * @return 根据用户名返回详情
     */
	Admindetils getAllAdminDetils(@Param("username") String username);

	/**
	 * 
	 * @param username 用户名
	 * @param phone 手机
	 * @param email 邮箱
	 * @param urlimg 头像
	 */
	void updateAdmin(@Param("username") String username,@Param("phone") String phone,@Param("email") String email,@Param("urlimg")  String urlimg);

	/**
	 * 
	 * @param beforelimit limit前
	 * @param afterlimit limit后
	 * @return
	 */
	List<Admindetils> getAllAdmin(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 
	 * @param username 用户名
	 * @return 根据用户名获取其信息
	 */
	Admindetils getAdmindetilsWhichUseToEdit(@Param("username") String username);

	
	/**
	 * 
	 * @param admindetils 用户信息
	 * @return
	 */
	int updateAdmindetilsByphone(Admindetils admindetils);

	/**
	 * 
	 * @param username 用户名
	 * @return
	 */
	int deleteUser(String username);



}