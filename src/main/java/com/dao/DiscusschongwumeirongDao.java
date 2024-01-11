package com.dao;

import com.entity.DiscusschongwumeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwumeirongVO;
import com.entity.view.DiscusschongwumeirongView;


/**
 * 宠物美容评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwumeirongDao extends BaseMapper<DiscusschongwumeirongEntity> {
	
	List<DiscusschongwumeirongVO> selectListVO(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
	
	DiscusschongwumeirongVO selectVO(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
	
	List<DiscusschongwumeirongView> selectListView(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);

	List<DiscusschongwumeirongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
	
	DiscusschongwumeirongView selectView(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
	

}
