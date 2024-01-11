package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwumeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwumeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwumeirongView;


/**
 * 宠物美容评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwumeirongService extends IService<DiscusschongwumeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwumeirongVO> selectListVO(Wrapper<DiscusschongwumeirongEntity> wrapper);
   	
   	DiscusschongwumeirongVO selectVO(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
   	
   	List<DiscusschongwumeirongView> selectListView(Wrapper<DiscusschongwumeirongEntity> wrapper);
   	
   	DiscusschongwumeirongView selectView(@Param("ew") Wrapper<DiscusschongwumeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwumeirongEntity> wrapper);
   	

}

