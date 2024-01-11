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


import com.dao.ChongwumeirongDao;
import com.entity.ChongwumeirongEntity;
import com.service.ChongwumeirongService;
import com.entity.vo.ChongwumeirongVO;
import com.entity.view.ChongwumeirongView;

@Service("chongwumeirongService")
public class ChongwumeirongServiceImpl extends ServiceImpl<ChongwumeirongDao, ChongwumeirongEntity> implements ChongwumeirongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwumeirongEntity> page = this.selectPage(
                new Query<ChongwumeirongEntity>(params).getPage(),
                new EntityWrapper<ChongwumeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwumeirongEntity> wrapper) {
		  Page<ChongwumeirongView> page =new Query<ChongwumeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwumeirongVO> selectListVO(Wrapper<ChongwumeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwumeirongVO selectVO(Wrapper<ChongwumeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwumeirongView> selectListView(Wrapper<ChongwumeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwumeirongView selectView(Wrapper<ChongwumeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
