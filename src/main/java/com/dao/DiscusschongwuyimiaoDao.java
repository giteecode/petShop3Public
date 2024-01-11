package com.dao;

import com.entity.DiscusschongwuyimiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuyimiaoVO;
import com.entity.view.DiscusschongwuyimiaoView;


/**
 * 宠物疫苗评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
public interface DiscusschongwuyimiaoDao extends BaseMapper<DiscusschongwuyimiaoEntity> {
	
	List<DiscusschongwuyimiaoVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
	
	DiscusschongwuyimiaoVO selectVO(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
	
	List<DiscusschongwuyimiaoView> selectListView(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);

	List<DiscusschongwuyimiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
	
	DiscusschongwuyimiaoView selectView(@Param("ew") Wrapper<DiscusschongwuyimiaoEntity> wrapper);
	

}
