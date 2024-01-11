package com.entity.model;

import com.entity.ChongwuliangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宠物粮食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public class ChongwuliangshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食品名称
	 */
	
	private String shipinmingcheng;
		
	/**
	 * 食品类型
	 */
	
	private String shipinleixing;
		
	/**
	 * 适用宠物
	 */
	
	private String shiyongchongwu;
		
	/**
	 * 食品图片
	 */
	
	private String shipintupian;
		
	/**
	 * 食品详情
	 */
	
	private String shipinxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：食品名称
	 */
	 
	public void setShipinmingcheng(String shipinmingcheng) {
		this.shipinmingcheng = shipinmingcheng;
	}
	
	/**
	 * 获取：食品名称
	 */
	public String getShipinmingcheng() {
		return shipinmingcheng;
	}
				
	
	/**
	 * 设置：食品类型
	 */
	 
	public void setShipinleixing(String shipinleixing) {
		this.shipinleixing = shipinleixing;
	}
	
	/**
	 * 获取：食品类型
	 */
	public String getShipinleixing() {
		return shipinleixing;
	}
				
	
	/**
	 * 设置：适用宠物
	 */
	 
	public void setShiyongchongwu(String shiyongchongwu) {
		this.shiyongchongwu = shiyongchongwu;
	}
	
	/**
	 * 获取：适用宠物
	 */
	public String getShiyongchongwu() {
		return shiyongchongwu;
	}
				
	
	/**
	 * 设置：食品图片
	 */
	 
	public void setShipintupian(String shipintupian) {
		this.shipintupian = shipintupian;
	}
	
	/**
	 * 获取：食品图片
	 */
	public String getShipintupian() {
		return shipintupian;
	}
				
	
	/**
	 * 设置：食品详情
	 */
	 
	public void setShipinxiangqing(String shipinxiangqing) {
		this.shipinxiangqing = shipinxiangqing;
	}
	
	/**
	 * 获取：食品详情
	 */
	public String getShipinxiangqing() {
		return shipinxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
