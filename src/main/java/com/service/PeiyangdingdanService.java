package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeiyangdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeiyangdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeiyangdingdanView;


/**
 * 培养订单
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface PeiyangdingdanService extends IService<PeiyangdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeiyangdingdanVO> selectListVO(Wrapper<PeiyangdingdanEntity> wrapper);
   	
   	PeiyangdingdanVO selectVO(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
   	
   	List<PeiyangdingdanView> selectListView(Wrapper<PeiyangdingdanEntity> wrapper);
   	
   	PeiyangdingdanView selectView(@Param("ew") Wrapper<PeiyangdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeiyangdingdanEntity> wrapper);
   	

}

