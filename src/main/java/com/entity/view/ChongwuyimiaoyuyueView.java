package com.entity.view;

import com.entity.ChongwuyimiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物疫苗预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("chongwuyimiaoyuyue")
public class ChongwuyimiaoyuyueView  extends ChongwuyimiaoyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuyimiaoyuyueView(){
	}
 
 	public ChongwuyimiaoyuyueView(ChongwuyimiaoyuyueEntity chongwuyimiaoyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuyimiaoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
