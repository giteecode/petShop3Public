package com.entity.view;

import com.entity.PeiyangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培养师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("peiyangshi")
public class PeiyangshiView  extends PeiyangshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeiyangshiView(){
	}
 
 	public PeiyangshiView(PeiyangshiEntity peiyangshiEntity){
 	try {
			BeanUtils.copyProperties(this, peiyangshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
