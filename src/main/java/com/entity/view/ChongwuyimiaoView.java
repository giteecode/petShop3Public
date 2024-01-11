package com.entity.view;

import com.entity.ChongwuyimiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物疫苗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("chongwuyimiao")
public class ChongwuyimiaoView  extends ChongwuyimiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuyimiaoView(){
	}
 
 	public ChongwuyimiaoView(ChongwuyimiaoEntity chongwuyimiaoEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuyimiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
