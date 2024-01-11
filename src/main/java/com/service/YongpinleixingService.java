package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpinleixingView;


/**
 * 用品类型
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface YongpinleixingService extends IService<YongpinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpinleixingVO> selectListVO(Wrapper<YongpinleixingEntity> wrapper);
   	
   	YongpinleixingVO selectVO(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
   	
   	List<YongpinleixingView> selectListView(Wrapper<YongpinleixingEntity> wrapper);
   	
   	YongpinleixingView selectView(@Param("ew") Wrapper<YongpinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpinleixingEntity> wrapper);
   	

}

