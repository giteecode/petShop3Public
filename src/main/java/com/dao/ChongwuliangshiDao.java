package com.dao;

import com.entity.ChongwuliangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuliangshiVO;
import com.entity.view.ChongwuliangshiView;


/**
 * 宠物粮食
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuliangshiDao extends BaseMapper<ChongwuliangshiEntity> {
	
	List<ChongwuliangshiVO> selectListVO(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
	
	ChongwuliangshiVO selectVO(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
	
	List<ChongwuliangshiView> selectListView(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);

	List<ChongwuliangshiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
	
	ChongwuliangshiView selectView(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
	

}
