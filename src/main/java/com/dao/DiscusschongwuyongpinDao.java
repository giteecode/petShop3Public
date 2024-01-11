package com.dao;

import com.entity.DiscusschongwuyongpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuyongpinVO;
import com.entity.view.DiscusschongwuyongpinView;


/**
 * 宠物用品评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwuyongpinDao extends BaseMapper<DiscusschongwuyongpinEntity> {
	
	List<DiscusschongwuyongpinVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuyongpinEntity> wrapper);
	
	DiscusschongwuyongpinVO selectVO(@Param("ew") Wrapper<DiscusschongwuyongpinEntity> wrapper);
	
	List<DiscusschongwuyongpinView> selectListView(@Param("ew") Wrapper<DiscusschongwuyongpinEntity> wrapper);

	List<DiscusschongwuyongpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuyongpinEntity> wrapper);
	
	DiscusschongwuyongpinView selectView(@Param("ew") Wrapper<DiscusschongwuyongpinEntity> wrapper);
	

}
