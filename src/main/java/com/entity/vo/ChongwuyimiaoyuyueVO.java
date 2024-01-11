package com.entity.vo;

import com.entity.ChongwuyimiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宠物疫苗预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public class ChongwuyimiaoyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 疫苗名称
	 */
	
	private String yimiaomingcheng;
		
	/**
	 * 适合宠物
	 */
	
	private String shihechongwu;
		
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
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 宠物资料
	 */
	
	private String chongwuziliao;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：宠物资料
	 */
	 
	public void setChongwuziliao(String chongwuziliao) {
		this.chongwuziliao = chongwuziliao;
	}
	
	/**
	 * 获取：宠物资料
	 */
	public String getChongwuziliao() {
		return chongwuziliao;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
