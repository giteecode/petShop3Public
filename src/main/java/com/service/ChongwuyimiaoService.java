package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuyimiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuyimiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuyimiaoView;


/**
 * 宠物疫苗
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuyimiaoService extends IService<ChongwuyimiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuyimiaoVO> selectListVO(Wrapper<ChongwuyimiaoEntity> wrapper);
   	
   	ChongwuyimiaoVO selectVO(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
   	
   	List<ChongwuyimiaoView> selectListView(Wrapper<ChongwuyimiaoEntity> wrapper);
   	
   	ChongwuyimiaoView selectView(@Param("ew") Wrapper<ChongwuyimiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuyimiaoEntity> wrapper);
   	

}

