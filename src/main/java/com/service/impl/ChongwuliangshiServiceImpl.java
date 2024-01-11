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


import com.dao.ChongwuliangshiDao;
import com.entity.ChongwuliangshiEntity;
import com.service.ChongwuliangshiService;
import com.entity.vo.ChongwuliangshiVO;
import com.entity.view.ChongwuliangshiView;

@Service("chongwuliangshiService")
public class ChongwuliangshiServiceImpl extends ServiceImpl<ChongwuliangshiDao, ChongwuliangshiEntity> implements ChongwuliangshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuliangshiEntity> page = this.selectPage(
                new Query<ChongwuliangshiEntity>(params).getPage(),
                new EntityWrapper<ChongwuliangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuliangshiEntity> wrapper) {
		  Page<ChongwuliangshiView> page =new Query<ChongwuliangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuliangshiVO> selectListVO(Wrapper<ChongwuliangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuliangshiVO selectVO(Wrapper<ChongwuliangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuliangshiView> selectListView(Wrapper<ChongwuliangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuliangshiView selectView(Wrapper<ChongwuliangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
