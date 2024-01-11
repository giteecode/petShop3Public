package com.entity.view;

import com.entity.DiscusschongwuyimiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物疫苗评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
@TableName("discusschongwuyimiao")
public class DiscusschongwuyimiaoView  extends DiscusschongwuyimiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwuyimiaoView(){
	}
 
 	public DiscusschongwuyimiaoView(DiscusschongwuyimiaoEntity discusschongwuyimiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwuyimiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
