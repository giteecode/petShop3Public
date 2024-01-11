package com.entity.view;

import com.entity.ChongwuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("chongwuzhonglei")
public class ChongwuzhongleiView  extends ChongwuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuzhongleiView(){
	}
 
 	public ChongwuzhongleiView(ChongwuzhongleiEntity chongwuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
