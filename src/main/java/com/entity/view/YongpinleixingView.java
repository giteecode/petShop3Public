package com.entity.view;

import com.entity.YongpinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("yongpinleixing")
public class YongpinleixingView  extends YongpinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongpinleixingView(){
	}
 
 	public YongpinleixingView(YongpinleixingEntity yongpinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, yongpinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
