package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwupeiyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwupeiyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwupeiyangView;


/**
 * 宠物培养
 *
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public interface ChongwupeiyangService extends IService<ChongwupeiyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwupeiyangVO> selectListVO(Wrapper<ChongwupeiyangEntity> wrapper);
   	
   	ChongwupeiyangVO selectVO(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
   	
   	List<ChongwupeiyangView> selectListView(Wrapper<ChongwupeiyangEntity> wrapper);
   	
   	ChongwupeiyangView selectView(@Param("ew") Wrapper<ChongwupeiyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwupeiyangEntity> wrapper);
   	

}

