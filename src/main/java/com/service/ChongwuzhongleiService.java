package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuzhongleiView;


/**
 * 宠物种类
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwuzhongleiService extends IService<ChongwuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuzhongleiVO> selectListVO(Wrapper<ChongwuzhongleiEntity> wrapper);
   	
   	ChongwuzhongleiVO selectVO(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
   	
   	List<ChongwuzhongleiView> selectListView(Wrapper<ChongwuzhongleiEntity> wrapper);
   	
   	ChongwuzhongleiView selectView(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuzhongleiEntity> wrapper);
   	

}

