package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物粮食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("chongwuliangshi")
public class ChongwuliangshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuliangshiEntity() {
		
	}
	
	public ChongwuliangshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 食品编码
	 */
					
	private String shipinbianma;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食品编码
	 */
	public void setShipinbianma(String shipinbianma) {
		this.shipinbianma = shipinbianma;
	}
	/**
	 * 获取：食品编码
	 */
	public String getShipinbianma() {
		return shipinbianma;
	}
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
