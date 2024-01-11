package com.dao;

import com.entity.PeiyangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeiyangshiVO;
import com.entity.view.PeiyangshiView;


/**
 * 培养师
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface PeiyangshiDao extends BaseMapper<PeiyangshiEntity> {
	
	List<PeiyangshiVO> selectListVO(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
	
	PeiyangshiVO selectVO(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
	
	List<PeiyangshiView> selectListView(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);

	List<PeiyangshiView> selectListView(Pagination page,@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
	
	PeiyangshiView selectView(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
	

}
