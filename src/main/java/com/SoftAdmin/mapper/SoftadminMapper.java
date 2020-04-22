package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.bean.SoftadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftadminMapper {
    int countByExample(SoftadminExample example);

    int deleteByExample(SoftadminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Softadmin record);

    int insertSelective(Softadmin record);

    List<Softadmin> selectByExample(SoftadminExample example);

    Softadmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Softadmin record, @Param("example") SoftadminExample example);

    int updateByExample(@Param("record") Softadmin record, @Param("example") SoftadminExample example);

    int updateByPrimaryKeySelective(Softadmin record);

    int updateByPrimaryKey(Softadmin record);
    
    /**
     * 
     * @param softadmin 用户登录时对象
     * @return 
     */
    Softadmin login(Softadmin softadmin);

    /**
     * 
     * @return 获取所有管理信息
     */
	List<Softadmin> getAllOnlineAdmin();

	/**
	 * 
	 * @param username 用户名
	 * @return 是否存在该用户 int
	 */
	int checkAdminIsExit(@Param("username") String username);

	/**
	 * 
	 * @param username 用户名
	 * 用户上线则变更状态
	 */
	void adminOnLine(@Param("username") String username);
	
	/**
	 * 
	 * @param username 用户名
	 * 用户下线则变更状态
	 */
	void adminOutLine(@Param("username") String username);

	/**
	 * 
	 * @param username 用户名
	 * @return 区别身份
	 */
	Softadmin getPowerOfUser(@Param("username") String username);

	/**
	 * 
	 * @param username 用户名
	 * @param urlimg 头像
	 * @param password 密码
	 */
	void updatePass(@Param("username") String username,@Param("password")  String encodepass,@Param("urlimg")  String urlimg);

	/**
	 * 
	 * @param beforelimit limit前
	 * @param afterlimit   limit后
	 * @return List
	 */
	List<Softadmin> getAllAdmin(@Param("beforelimit") Integer beforelimit,@Param("afterlimit")  Integer afterlimit);

	/**
	 * 获取管理员数量
	 * @return
	 */
	int howmanyadmin();

	/**
	 * 
	 * @param username 用户名
	 * @param urlimg 头像
	 * @return
	 */
	int updateAdmindetilsByphone(@Param("username") String username,@Param("urlimg") String urlimg);

	/**
	 * 
	 * @param soft 用户名和密码
	 * @return
	 */
	int updateSoftAdminPass(Softadmin soft);

	/**
	 * 
	 * @param username 用户名
	 * @return
	 */
	int deleteUser(@Param("username") String username);

	/**
	 * 
	 * @param username 用户名
	 * @return
	 */
	Softadmin selectAdminByName(@Param("username") String username);



	
}