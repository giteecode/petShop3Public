package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuyimiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuyimiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuyimiaoView;


/**
 * 宠物疫苗评论表
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwuyimiaoService extends IService<DiscusschongwuyimiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuyimiaoVO> selectListVO(Wrapper<DiscusschongwuyimiaoEntity> wrapper);
   	
   	DiscusschongwuyimiaoVO selectVO(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
   	
   	List<DiscusschongwuyimiaoView> selectListView(Wrapper<DiscusschongwuyimiaoEntity> wrapper);
   	
   	DiscusschongwuyimiaoView selectView(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuyimiaoEntity> wrapper);
   	

}

