package com.dao;

import com.entity.MeirongyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongyuyueVO;
import com.entity.view.MeirongyuyueView;


/**
 * 美容预约
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface MeirongyuyueDao extends BaseMapper<MeirongyuyueEntity> {
	
	List<MeirongyuyueVO> selectListVO(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
	
	MeirongyuyueVO selectVO(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
	
	List<MeirongyuyueView> selectListView(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);

	List<MeirongyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
	
	MeirongyuyueView selectView(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
	

}
