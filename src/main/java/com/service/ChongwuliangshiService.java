package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuliangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuliangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuliangshiView;


/**
 * 宠物粮食
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuliangshiService extends IService<ChongwuliangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuliangshiVO> selectListVO(Wrapper<ChongwuliangshiEntity> wrapper);
   	
   	ChongwuliangshiVO selectVO(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
   	
   	List<ChongwuliangshiView> selectListView(Wrapper<ChongwuliangshiEntity> wrapper);
   	
   	ChongwuliangshiView selectView(@Param("ew") Wrapper<ChongwuliangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuliangshiEntity> wrapper);
   	

}

