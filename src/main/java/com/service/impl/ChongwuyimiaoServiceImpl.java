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


import com.dao.ChongwuyimiaoDao;
import com.entity.ChongwuyimiaoEntity;
import com.service.ChongwuyimiaoService;
import com.entity.vo.ChongwuyimiaoVO;
import com.entity.view.ChongwuyimiaoView;

@Service("chongwuyimiaoService")
public class ChongwuyimiaoServiceImpl extends ServiceImpl<ChongwuyimiaoDao, ChongwuyimiaoEntity> implements ChongwuyimiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuyimiaoEntity> page = this.selectPage(
                new Query<ChongwuyimiaoEntity>(params).getPage(),
                new EntityWrapper<ChongwuyimiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuyimiaoEntity> wrapper) {
		  Page<ChongwuyimiaoView> page =new Query<ChongwuyimiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuyimiaoVO> selectListVO(Wrapper<ChongwuyimiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuyimiaoVO selectVO(Wrapper<ChongwuyimiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuyimiaoView> selectListView(Wrapper<ChongwuyimiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuyimiaoView selectView(Wrapper<ChongwuyimiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
