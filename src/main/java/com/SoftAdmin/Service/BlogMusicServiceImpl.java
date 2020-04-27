package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Blogmusic;
import com.SoftAdmin.mapper.BlogmusicMapper;

@Service
public class BlogMusicServiceImpl implements BlogMusicService {

	@Resource
	private BlogmusicMapper blogmusicMapper;

	/**
	 * 获取分页查询的音乐资源
	 * @param beforelimit 音乐前抑制点
	 * @param afterlimit  音乐后抑制点
	 * @return
	 */
	@Override
	public List<Blogmusic> getAllmusic(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return blogmusicMapper.getAllmusic(beforelimit,afterlimit);
	}

	/**
	 * 总共多少数据
	 * @return
	 */
	@Override
	public int howmanymusic() {
		// TODO Auto-generated method stub
		return blogmusicMapper.howmanymusic();
	}

	/**
	 * 根据id获取对应音乐
	 * @param nid id
	 * @return
	 */
	@Override
	public Blogmusic memberedit(Integer nid) {
		// TODO Auto-generated method stub
		return blogmusicMapper.selectByPrimaryKey(nid);
	}

	
	/**
	 * 更新音乐
	 * @param bmusic 音乐信息
	 * @return
	 */
	@Override
	public Boolean updateMusic(Blogmusic bmusic) {
		// TODO Auto-generated method stub
		return blogmusicMapper.updateByPrimaryKey(bmusic)>0;
	}

	/**
	 * 添加音乐
	 * @param bmusic 音乐
	 * @return
	 */
	@Override
	public Boolean addmusic(Blogmusic bmusic) {
		// TODO Auto-generated method stub
		return blogmusicMapper.insert(bmusic)>0;
	}

	/**
	 * 根据id删除音乐
	 * @param nid id
	 * @return
	 */
	@Override
	public Boolean deletemusic(Integer nid) {
		// TODO Auto-generated method stub
		return blogmusicMapper.deleteByPrimaryKey(nid)>0;
	}

	/**
	 * 更具名称查询音乐
	 * @param appname 音乐名
	 * @return
	 */
	@Override
	public Blogmusic selectmusicByName(String appname) {
		// TODO Auto-generated method stub
		return blogmusicMapper.selectmusicByName(appname);
	}
	
}
