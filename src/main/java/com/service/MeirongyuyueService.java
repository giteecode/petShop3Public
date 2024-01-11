package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongyuyueView;


/**
 * 美容预约
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface MeirongyuyueService extends IService<MeirongyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongyuyueVO> selectListVO(Wrapper<MeirongyuyueEntity> wrapper);
   	
   	MeirongyuyueVO selectVO(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
   	
   	List<MeirongyuyueView> selectListView(Wrapper<MeirongyuyueEntity> wrapper);
   	
   	MeirongyuyueView selectView(@Param("ew") Wrapper<MeirongyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongyuyueEntity> wrapper);
   	

}

