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


import com.dao.ChongwuyimiaoyuyueDao;
import com.entity.ChongwuyimiaoyuyueEntity;
import com.service.ChongwuyimiaoyuyueService;
import com.entity.vo.ChongwuyimiaoyuyueVO;
import com.entity.view.ChongwuyimiaoyuyueView;

@Service("chongwuyimiaoyuyueService")
public class ChongwuyimiaoyuyueServiceImpl extends ServiceImpl<ChongwuyimiaoyuyueDao, ChongwuyimiaoyuyueEntity> implements ChongwuyimiaoyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuyimiaoyuyueEntity> page = this.selectPage(
                new Query<ChongwuyimiaoyuyueEntity>(params).getPage(),
                new EntityWrapper<ChongwuyimiaoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuyimiaoyuyueEntity> wrapper) {
		  Page<ChongwuyimiaoyuyueView> page =new Query<ChongwuyimiaoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuyimiaoyuyueVO> selectListVO(Wrapper<ChongwuyimiaoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuyimiaoyuyueVO selectVO(Wrapper<ChongwuyimiaoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuyimiaoyuyueView> selectListView(Wrapper<ChongwuyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuyimiaoyuyueView selectView(Wrapper<ChongwuyimiaoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
