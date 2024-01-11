package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuliangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuliangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuliangshiView;


/**
 * 宠物粮食评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwuliangshiService extends IService<DiscusschongwuliangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuliangshiVO> selectListVO(Wrapper<DiscusschongwuliangshiEntity> wrapper);
   	
   	DiscusschongwuliangshiVO selectVO(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
   	
   	List<DiscusschongwuliangshiView> selectListView(Wrapper<DiscusschongwuliangshiEntity> wrapper);
   	
   	DiscusschongwuliangshiView selectView(@Param("ew") Wrapper<DiscusschongwuliangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuliangshiEntity> wrapper);
   	

}

