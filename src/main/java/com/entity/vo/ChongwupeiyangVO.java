package com.entity.vo;

import com.entity.ChongwupeiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宠物培养
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:35
 */
public class ChongwupeiyangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培养课程
	 */
	
	private String peiyangkecheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
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
			
}
