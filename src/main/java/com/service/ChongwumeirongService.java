package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwumeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwumeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwumeirongView;


/**
 * 宠物美容
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwumeirongService extends IService<ChongwumeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwumeirongVO> selectListVO(Wrapper<ChongwumeirongEntity> wrapper);
   	
   	ChongwumeirongVO selectVO(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
   	
   	List<ChongwumeirongView> selectListView(Wrapper<ChongwumeirongEntity> wrapper);
   	
   	ChongwumeirongView selectView(@Param("ew") Wrapper<ChongwumeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwumeirongEntity> wrapper);
   	

}

