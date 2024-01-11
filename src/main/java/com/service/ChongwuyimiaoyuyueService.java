package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuyimiaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuyimiaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuyimiaoyuyueView;


/**
 * 宠物疫苗预约
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuyimiaoyuyueService extends IService<ChongwuyimiaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuyimiaoyuyueVO> selectListVO(Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
   	
   	ChongwuyimiaoyuyueVO selectVO(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
   	
   	List<ChongwuyimiaoyuyueView> selectListView(Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
   	
   	ChongwuyimiaoyuyueView selectView(@Param("ew") Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuyimiaoyuyueEntity> wrapper);
   	

}

