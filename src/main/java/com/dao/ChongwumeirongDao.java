package com.dao;

import com.entity.ChongwumeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwumeirongVO;
import com.entity.view.ChongwumeirongView;


/**
 * 宠物美容
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwumeirongDao extends BaseMapper<ChongwumeirongEntity> {
	
	List<ChongwumeirongVO> selectListVO(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
	
	ChongwumeirongVO selectVO(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
	
	List<ChongwumeirongView> selectListView(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);

	List<ChongwumeirongView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
	
	ChongwumeirongView selectView(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
	

}
