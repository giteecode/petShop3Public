package com.dao;

import com.entity.ChongwuyimiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuyimiaoVO;
import com.entity.view.ChongwuyimiaoView;


/**
 * 宠物疫苗
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuyimiaoDao extends BaseMapper<ChongwuyimiaoEntity> {
	
	List<ChongwuyimiaoVO> selectListVO(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
	
	ChongwuyimiaoVO selectVO(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
	
	List<ChongwuyimiaoView> selectListView(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);

	List<ChongwuyimiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
	
	ChongwuyimiaoView selectView(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
	

}
