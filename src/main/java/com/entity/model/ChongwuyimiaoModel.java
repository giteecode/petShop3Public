package com.entity.model;

import com.entity.ChongwuyimiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宠物疫苗
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public class ChongwuyimiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 适合宠物
	 */
	
	private String shihechongwu;
		
	/**
	 * 疫苗封面
	 */
	
	private String yimiaofengmian;
		
	/**
	 * 疫苗价格
	 */
	
	private String yimiaojiage;
		
	/**
	 * 疫苗类型
	 */
	
	private String yimiaoleixing;
		
	/**
	 * 产品规格
	 */
	
	private String chanpinguige;
		
	/**
	 * 生产厂家
	 */
	
	private String shengchanchangjia;
		
	/**
	 * 疫苗介绍
	 */
	
	private String yimiaojieshao;
				
	
	/**
	 * 设置：适合宠物
	 */
	 
	public void setShihechongwu(String shihechongwu) {
		this.shihechongwu = shihechongwu;
	}
	
	/**
	 * 获取：适合宠物
	 */
	public String getShihechongwu() {
		return shihechongwu;
	}
				
	
	/**
	 * 设置：疫苗封面
	 */
	 
	public void setYimiaofengmian(String yimiaofengmian) {
		this.yimiaofengmian = yimiaofengmian;
	}
	
	/**
	 * 获取：疫苗封面
	 */
	public String getYimiaofengmian() {
		return yimiaofengmian;
	}
				
	
	/**
	 * 设置：疫苗价格
	 */
	 
	public void setYimiaojiage(String yimiaojiage) {
		this.yimiaojiage = yimiaojiage;
	}
	
	/**
	 * 获取：疫苗价格
	 */
	public String getYimiaojiage() {
		return yimiaojiage;
	}
				
	
	/**
	 * 设置：疫苗类型
	 */
	 
	public void setYimiaoleixing(String yimiaoleixing) {
		this.yimiaoleixing = yimiaoleixing;
	}
	
	/**
	 * 获取：疫苗类型
	 */
	public String getYimiaoleixing() {
		return yimiaoleixing;
	}
				
	
	/**
	 * 设置：产品规格
	 */
	 
	public void setChanpinguige(String chanpinguige) {
		this.chanpinguige = chanpinguige;
	}
	
	/**
	 * 获取：产品规格
	 */
	public String getChanpinguige() {
		return chanpinguige;
	}
				
	
	/**
	 * 设置：生产厂家
	 */
	 
	public void setShengchanchangjia(String shengchanchangjia) {
		this.shengchanchangjia = shengchanchangjia;
	}
	
	/**
	 * 获取：生产厂家
	 */
	public String getShengchanchangjia() {
		return shengchanchangjia;
	}
				
	
	/**
	 * 设置：疫苗介绍
	 */
	 
	public void setYimiaojieshao(String yimiaojieshao) {
		this.yimiaojieshao = yimiaojieshao;
	}
	
	/**
	 * 获取：疫苗介绍
	 */
	public String getYimiaojieshao() {
		return yimiaojieshao;
	}
			
}
