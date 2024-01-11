package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeiyangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeiyangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeiyangshiView;


/**
 * 培养师
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface PeiyangshiService extends IService<PeiyangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeiyangshiVO> selectListVO(Wrapper<PeiyangshiEntity> wrapper);
   	
   	PeiyangshiVO selectVO(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
   	
   	List<PeiyangshiView> selectListView(Wrapper<PeiyangshiEntity> wrapper);
   	
   	PeiyangshiView selectView(@Param("ew") Wrapper<PeiyangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeiyangshiEntity> wrapper);
   	

}

