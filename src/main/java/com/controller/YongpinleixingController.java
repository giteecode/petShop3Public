package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YongpinleixingEntity;
import com.entity.view.YongpinleixingView;

import com.service.YongpinleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用品类型
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@RestController
@RequestMapping("/yongpinleixing")
public class YongpinleixingController {
    @Autowired
    private YongpinleixingService yongpinleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongpinleixingEntity yongpinleixing, 
		HttpServletRequest request){

        EntityWrapper<YongpinleixingEntity> ew = new EntityWrapper<YongpinleixingEntity>();
    	PageUtils page = yongpinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinleixing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongpinleixingEntity yongpinleixing, 
		HttpServletRequest request){
        EntityWrapper<YongpinleixingEntity> ew = new EntityWrapper<YongpinleixingEntity>();
    	PageUtils page = yongpinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinleixing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongpinleixingEntity yongpinleixing){
       	EntityWrapper<YongpinleixingEntity> ew = new EntityWrapper<YongpinleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongpinleixing, "yongpinleixing")); 
        return R.ok().put("data", yongpinleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongpinleixingEntity yongpinleixing){
        EntityWrapper< YongpinleixingEntity> ew = new EntityWrapper< YongpinleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongpinleixing, "yongpinleixing")); 
		YongpinleixingView yongpinleixingView =  yongpinleixingService.selectView(ew);
		return R.ok("查询用品类型成功").put("data", yongpinleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongpinleixingEntity yongpinleixing = yongpinleixingService.selectById(id);
        return R.ok().put("data", yongpinleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongpinleixingEntity yongpinleixing = yongpinleixingService.selectById(id);
        return R.ok().put("data", yongpinleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YongpinleixingEntity yongpinleixing, HttpServletRequest request){
    	yongpinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yongpinleixing);

        yongpinleixingService.insert(yongpinleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YongpinleixingEntity yongpinleixing, HttpServletRequest request){
    	yongpinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yongpinleixing);

        yongpinleixingService.insert(yongpinleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YongpinleixingEntity yongpinleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongpinleixing);
        yongpinleixingService.updateById(yongpinleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yongpinleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YongpinleixingEntity> wrapper = new EntityWrapper<YongpinleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yongpinleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
