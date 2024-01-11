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

import com.entity.ChongwuliangshiEntity;
import com.entity.view.ChongwuliangshiView;

import com.service.ChongwuliangshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 宠物粮食
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@RestController
@RequestMapping("/chongwuliangshi")
public class ChongwuliangshiController {
    @Autowired
    private ChongwuliangshiService chongwuliangshiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuliangshiEntity chongwuliangshi, 
		HttpServletRequest request){

        EntityWrapper<ChongwuliangshiEntity> ew = new EntityWrapper<ChongwuliangshiEntity>();
    	PageUtils page = chongwuliangshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuliangshi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuliangshiEntity chongwuliangshi, 
		HttpServletRequest request){
        EntityWrapper<ChongwuliangshiEntity> ew = new EntityWrapper<ChongwuliangshiEntity>();
    	PageUtils page = chongwuliangshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuliangshi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuliangshiEntity chongwuliangshi){
       	EntityWrapper<ChongwuliangshiEntity> ew = new EntityWrapper<ChongwuliangshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuliangshi, "chongwuliangshi")); 
        return R.ok().put("data", chongwuliangshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuliangshiEntity chongwuliangshi){
        EntityWrapper< ChongwuliangshiEntity> ew = new EntityWrapper< ChongwuliangshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuliangshi, "chongwuliangshi")); 
		ChongwuliangshiView chongwuliangshiView =  chongwuliangshiService.selectView(ew);
		return R.ok("查询宠物粮食成功").put("data", chongwuliangshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuliangshiEntity chongwuliangshi = chongwuliangshiService.selectById(id);
		chongwuliangshi.setClicktime(new Date());
		chongwuliangshiService.updateById(chongwuliangshi);
        return R.ok().put("data", chongwuliangshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuliangshiEntity chongwuliangshi = chongwuliangshiService.selectById(id);
		chongwuliangshi.setClicktime(new Date());
		chongwuliangshiService.updateById(chongwuliangshi);
        return R.ok().put("data", chongwuliangshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuliangshiEntity chongwuliangshi, HttpServletRequest request){
    	chongwuliangshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuliangshi);

        chongwuliangshiService.insert(chongwuliangshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuliangshiEntity chongwuliangshi, HttpServletRequest request){
    	chongwuliangshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuliangshi);

        chongwuliangshiService.insert(chongwuliangshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwuliangshiEntity chongwuliangshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuliangshi);
        chongwuliangshiService.updateById(chongwuliangshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuliangshiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChongwuliangshiEntity> wrapper = new EntityWrapper<ChongwuliangshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = chongwuliangshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChongwuliangshiEntity chongwuliangshi, HttpServletRequest request,String pre){
        EntityWrapper<ChongwuliangshiEntity> ew = new EntityWrapper<ChongwuliangshiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = chongwuliangshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuliangshi), params), params));
        return R.ok().put("data", page);
    }





}
