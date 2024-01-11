package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwupeiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwupeiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwupeiyangView;


/**
 * 宠物培养评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwupeiyangService extends IService<DiscusschongwupeiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwupeiyangVO> selectListVO(Wrapper<DiscusschongwupeiyangEntity> wrapper);
   	
   	DiscusschongwupeiyangVO selectVO(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
   	
   	List<DiscusschongwupeiyangView> selectListView(Wrapper<DiscusschongwupeiyangEntity> wrapper);
   	
   	DiscusschongwupeiyangView selectView(@Param("ew") Wrapper<DiscusschongwupeiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwupeiyangEntity> wrapper);
   	

}

