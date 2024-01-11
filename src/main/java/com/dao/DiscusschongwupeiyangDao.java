package com.dao;

import com.entity.DiscusschongwupeiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwupeiyangVO;
import com.entity.view.DiscusschongwupeiyangView;


/**
 * 宠物培养评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwupeiyangDao extends BaseMapper<DiscusschongwupeiyangEntity> {
	
	List<DiscusschongwupeiyangVO> selectListVO(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
	
	DiscusschongwupeiyangVO selectVO(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
	
	List<DiscusschongwupeiyangView> selectListView(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);

	List<DiscusschongwupeiyangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
	
	DiscusschongwupeiyangView selectView(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
	

}
