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

import com.entity.PeiyangdingdanEntity;
import com.entity.view.PeiyangdingdanView;

import com.service.PeiyangdingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 培养订单
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@RestController
@RequestMapping("/peiyangdingdan")
public class PeiyangdingdanController {
    @Autowired
    private PeiyangdingdanService peiyangdingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeiyangdingdanEntity peiyangdingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("peiyangshi")) {
			peiyangdingdan.setPeiyangshihao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			peiyangdingdan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeiyangdingdanEntity> ew = new EntityWrapper<PeiyangdingdanEntity>();
    	PageUtils page = peiyangdingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peiyangdingdan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeiyangdingdanEntity peiyangdingdan, 
		HttpServletRequest request){
        EntityWrapper<PeiyangdingdanEntity> ew = new EntityWrapper<PeiyangdingdanEntity>();
    	PageUtils page = peiyangdingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peiyangdingdan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeiyangdingdanEntity peiyangdingdan){
       	EntityWrapper<PeiyangdingdanEntity> ew = new EntityWrapper<PeiyangdingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peiyangdingdan, "peiyangdingdan")); 
        return R.ok().put("data", peiyangdingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeiyangdingdanEntity peiyangdingdan){
        EntityWrapper< PeiyangdingdanEntity> ew = new EntityWrapper< PeiyangdingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peiyangdingdan, "peiyangdingdan")); 
		PeiyangdingdanView peiyangdingdanView =  peiyangdingdanService.selectView(ew);
		return R.ok("查询培养订单成功").put("data", peiyangdingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeiyangdingdanEntity peiyangdingdan = peiyangdingdanService.selectById(id);
        return R.ok().put("data", peiyangdingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeiyangdingdanEntity peiyangdingdan = peiyangdingdanService.selectById(id);
        return R.ok().put("data", peiyangdingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeiyangdingdanEntity peiyangdingdan, HttpServletRequest request){
    	peiyangdingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peiyangdingdan);

        peiyangdingdanService.insert(peiyangdingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeiyangdingdanEntity peiyangdingdan, HttpServletRequest request){
    	peiyangdingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peiyangdingdan);

        peiyangdingdanService.insert(peiyangdingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PeiyangdingdanEntity peiyangdingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peiyangdingdan);
        peiyangdingdanService.updateById(peiyangdingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peiyangdingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PeiyangdingdanEntity> wrapper = new EntityWrapper<PeiyangdingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("peiyangshi")) {
			wrapper.eq("peiyangshihao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = peiyangdingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
