package com.dao;

import com.entity.YongpinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpinleixingVO;
import com.entity.view.YongpinleixingView;


/**
 * 用品类型
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface YongpinleixingDao extends BaseMapper<YongpinleixingEntity> {
	
	List<YongpinleixingVO> selectListVO(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
	
	YongpinleixingVO selectVO(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
	
	List<YongpinleixingView> selectListView(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);

	List<YongpinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
	
	YongpinleixingView selectView(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
	

}
