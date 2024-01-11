package com.dao;

import com.entity.DiscusschongwuliangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuliangshiVO;
import com.entity.view.DiscusschongwuliangshiView;


/**
 * 宠物粮食评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwuliangshiDao extends BaseMapper<DiscusschongwuliangshiEntity> {
	
	List<DiscusschongwuliangshiVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
	
	DiscusschongwuliangshiVO selectVO(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
	
	List<DiscusschongwuliangshiView> selectListView(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);

	List<DiscusschongwuliangshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
	
	DiscusschongwuliangshiView selectView(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
	

}
