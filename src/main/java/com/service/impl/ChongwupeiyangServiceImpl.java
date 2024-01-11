package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChongwupeiyangDao;
import com.entity.ChongwupeiyangEntity;
import com.service.ChongwupeiyangService;
import com.entity.vo.ChongwupeiyangVO;
import com.entity.view.ChongwupeiyangView;

@Service("chongwupeiyangService")
public class ChongwupeiyangServiceImpl extends ServiceImpl<ChongwupeiyangDao, ChongwupeiyangEntity> implements ChongwupeiyangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwupeiyangEntity> page = this.selectPage(
                new Query<ChongwupeiyangEntity>(params).getPage(),
                new EntityWrapper<ChongwupeiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwupeiyangEntity> wrapper) {
		  Page<ChongwupeiyangView> page =new Query<ChongwupeiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwupeiyangVO> selectListVO(Wrapper<ChongwupeiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwupeiyangVO selectVO(Wrapper<ChongwupeiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwupeiyangView> selectListView(Wrapper<ChongwupeiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwupeiyangView selectView(Wrapper<ChongwupeiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
