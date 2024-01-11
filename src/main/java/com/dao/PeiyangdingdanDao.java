package com.dao;

import com.entity.PeiyangdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeiyangdingdanVO;
import com.entity.view.PeiyangdingdanView;


/**
 * 培养订单
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface PeiyangdingdanDao extends BaseMapper<PeiyangdingdanEntity> {
	
	List<PeiyangdingdanVO> selectListVO(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
	
	PeiyangdingdanVO selectVO(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
	
	List<PeiyangdingdanView> selectListView(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);

	List<PeiyangdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
	
	PeiyangdingdanView selectView(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
	

}
