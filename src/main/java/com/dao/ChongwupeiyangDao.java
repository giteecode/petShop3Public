package com.dao;

import com.entity.ChongwupeiyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwupeiyangVO;
import com.entity.view.ChongwupeiyangView;


/**
 * 宠物培养
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwupeiyangDao extends BaseMapper<ChongwupeiyangEntity> {
	
	List<ChongwupeiyangVO> selectListVO(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
	
	ChongwupeiyangVO selectVO(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
	
	List<ChongwupeiyangView> selectListView(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);

	List<ChongwupeiyangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
	
	ChongwupeiyangView selectView(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
	

}
