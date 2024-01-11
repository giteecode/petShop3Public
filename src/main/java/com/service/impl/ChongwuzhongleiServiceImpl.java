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


import com.dao.ChongwuzhongleiDao;
import com.entity.ChongwuzhongleiEntity;
import com.service.ChongwuzhongleiService;
import com.entity.vo.ChongwuzhongleiVO;
import com.entity.view.ChongwuzhongleiView;

@Service("chongwuzhongleiService")
public class ChongwuzhongleiServiceImpl extends ServiceImpl<ChongwuzhongleiDao, ChongwuzhongleiEntity> implements ChongwuzhongleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuzhongleiEntity> page = this.selectPage(
                new Query<ChongwuzhongleiEntity>(params).getPage(),
                new EntityWrapper<ChongwuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuzhongleiEntity> wrapper) {
		  Page<ChongwuzhongleiView> page =new Query<ChongwuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuzhongleiVO> selectListVO(Wrapper<ChongwuzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuzhongleiVO selectVO(Wrapper<ChongwuzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuzhongleiView> selectListView(Wrapper<ChongwuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuzhongleiView selectView(Wrapper<ChongwuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
