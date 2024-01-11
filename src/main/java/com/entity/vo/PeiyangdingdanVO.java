package com.entity.vo;

import com.entity.PeiyangdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 培养订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public class PeiyangdingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 培养课程
	 */
	
	private String peiyangkecheng;
		
	/**
	 * 开始时间
	 */
	
	private String kaishishijian;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 培养周期
	 */
	
	private String peiyangzhouqi;
		
	/**
	 * 培养内容
	 */
	
	private String peiyangneirong;
		
	/**
	 * 培养师号
	 */
	
	private String peiyangshihao;
		
	/**
	 * 培养师名
	 */
	
	private String peiyangshiming;
		
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
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：宠物种类
	 */
	 
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
				
	
	/**
	 * 设置：培养课程
	 */
	 
	public void setPeiyangkecheng(String peiyangkecheng) {
		this.peiyangkecheng = peiyangkecheng;
	}
	
	/**
	 * 获取：培养课程
	 */
	public String getPeiyangkecheng() {
		return peiyangkecheng;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(String kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public String getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：培养周期
	 */
	 
	public void setPeiyangzhouqi(String peiyangzhouqi) {
		this.peiyangzhouqi = peiyangzhouqi;
	}
	
	/**
	 * 获取：培养周期
	 */
	public String getPeiyangzhouqi() {
		return peiyangzhouqi;
	}
				
	
	/**
	 * 设置：培养内容
	 */
	 
	public void setPeiyangneirong(String peiyangneirong) {
		this.peiyangneirong = peiyangneirong;
	}
	
	/**
	 * 获取：培养内容
	 */
	public String getPeiyangneirong() {
		return peiyangneirong;
	}
				
	
	/**
	 * 设置：培养师号
	 */
	 
	public void setPeiyangshihao(String peiyangshihao) {
		this.peiyangshihao = peiyangshihao;
	}
	
	/**
	 * 获取：培养师号
	 */
	public String getPeiyangshihao() {
		return peiyangshihao;
	}
				
	
	/**
	 * 设置：培养师名
	 */
	 
	public void setPeiyangshiming(String peiyangshiming) {
		this.peiyangshiming = peiyangshiming;
	}
	
	/**
	 * 获取：培养师名
	 */
	public String getPeiyangshiming() {
		return peiyangshiming;
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
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
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
