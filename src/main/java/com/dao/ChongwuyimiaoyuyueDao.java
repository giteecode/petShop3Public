package com.dao;

import com.entity.ChongwuyimiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuyimiaoyuyueVO;
import com.entity.view.ChongwuyimiaoyuyueView;


/**
 * 宠物疫苗预约
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuyimiaoyuyueDao extends BaseMapper<ChongwuyimiaoyuyueEntity> {
	
	List<ChongwuyimiaoyuyueVO> selectListVO(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
	
	ChongwuyimiaoyuyueVO selectVO(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
	
	List<ChongwuyimiaoyuyueView> selectListView(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);

	List<ChongwuyimiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
	
	ChongwuyimiaoyuyueView selectView(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
	

}
