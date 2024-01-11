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
 * 宠物疫苗
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
@TableName("chongwuyimiao")
public class ChongwuyimiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuyimiaoEntity() {
		
	}
	
	public ChongwuyimiaoEntity(T t) {
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
	 * 疫苗名称
	 */
					
	private String yimiaomingcheng;
	
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
	 * 设置：疫苗名称
	 */
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
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
