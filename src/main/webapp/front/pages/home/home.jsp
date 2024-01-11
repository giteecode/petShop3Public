<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>首页</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<link rel="stylesheet" href="../../css/swiper.min.css" />
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<style>
		html::after {
			position: fixed;
			top: 0;
			right: 0;
			left: 0;
			bottom: 0;
			content: '';
			display: block;
			background-attachment: fixed;
			background-size: cover;
			background-position: center;
		}
		#app {
			position: relative;
			z-index: 1;
		}
		#swiper {
			overflow: hidden;
		}
		#swiper .layui-carousel-ind li {
			width: 16px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 3px;
			background-color: #f7f7f7;
			box-shadow: 0 0 6px rgba(110,22,64,.8);
		}
		#swiper .layui-carousel-ind li.layui-this {
			width: 24px;
			height: 10px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			border-radius: 0;
			background-color: rgba(110,22,64,1);
			box-shadow: 0 0 6px rgba(110,22,64,.8);
		}
	
		.recommend {
		  padding: 10px 0;
		  display: flex;
		  justify-content: center;
		  background-repeat: no-repeat;
		  background-position: center center;
		  background-size: cover;
		}
	
		.recommend .box {
		    width: 1014px;
		}
	
		.recommend .box .title {
			padding: 10px 5px;
			display: flex;
			justify-content: center;
			align-items: center;
			flex-direction: column;
		}
	
		.recommend .box .title span {
			padding: 0 10px;
			line-height: 1.4;
		}
	
		.recommend .box .list {
			display: flex;
			flex-wrap: wrap;
		}
		.index-pv1 .box .list .list-item {
			flex: 0 0 ${var1}%;
			padding: 0 5px;
			box-sizing: border-box;
		}
	
		.recommend .box .list .list-item-body {
			border: 1px solid rgba(0, 0, 0, 3);
			padding: 5px;
			box-sizing: border-box;
			cursor: pointer;
		}
	
		.recommend .box .list img {
			width: 100%;
			height: 100px;
			display: block;
			margin: 0 auto;
	    object-fit: cover;
	    max-width: 100%;
		}
	
		.recommend .box .list .name {
			padding-top: 5px;
			color: red;
			font-size: 14px;
			text-align: center;
			box-sizing: border-box;
		}
	
		.recommend .box .list .list-item3 {
			flex: 0 0 33.33%;
		}
	
		.recommend .box .list .list-item5 {
			flex: 0 0 20%;
		}
		
		/* 商品推荐-样式4-开始 */
		.recommend .list-4{
		  display: flex;
		  flex-wrap: wrap;
		  justify-content: center;
		}
		.recommend .list-4 .list-4-body {
		    display: flex;
		    flex-direction: column;
		}
		
		.recommend .list-4 .list-4-item {
		    position: relative;
		    z-index: 1;
		}
		.recommend .list-4 .list-4-item.item-1 {
		    width: 400px;
		    height: 400px;
		    margin-right: 20px;
		}
		
		.recommend .list-4 .list-4-item.item-2 {
		    width: 220px;
		    height: 190px;
		    margin-right: 20px;
		    margin-bottom: 20px;
		}
		
		.recommend .list-4 .list-4-item.item-3 {
		    width: 220px;
		    height: 190px;
		    margin-right: 20px;
		    margin-bottom: 0;
		}
		
		.recommend .list-4 .list-4-item.item-4 {
		    width: 190px;
		    height: 190px;
		    margin-right: 0;
		    margin-bottom: 20px;
		}
		
		.recommend .list-4 .list-4-item.item-5 {
		    width: 190px;
		    height: 190px;
		    margin-right: 0;
		    margin-bottom: 0;
		}
		
		.recommend .list-4 .list-4-item img {
		      width: 100%;
		      height: 100%;
		      object-fit: cover;
		      display: block;
		    }
		
		.recommend .list-4 .list-4-item .list-4-item-center {
			position: absolute;
			bottom: 0;
			left: 0;
			width: 100%;
			height: auto;
			display: flex;
			flex-wrap: wrap;
			background-color: rgba(0,0,0,.3);
		}
		.recommend .list-4 .list-4-item .list-4-item-center .list-4-item-title {
			width: 50%;
			text-align: left;
			line-height: 44px;
			color: #fff;
			font-size: 14px;
			padding: 0 6px;
		}
		
		.recommend .list-4 .list-4-item .list-4-item-center .list-4-item-price {
			width: 50%;
			text-align: right;
			line-height: 44px;
			color: #fff;
			font-size: 14px;
			padding: 0 6px;
		}
		/* 商品推荐-样式4-结束 */
		/* 商品推荐-样式5-开始 */
		.recommend .recommend-five-swiper.swiper-container-horizontal>.swiper-pagination-bullets {
		    line-height: 1;
		}
		.recommend .recommend-five-swiper .swiper-slide.swiper-slide-prev {
			z-index: 5;
		}
		.recommend .recommend-five-swiper .swiper-slide.swiper-slide-next {
			z-index: 5;
		}
		.recommend .recommend-five-swiper .swiper-slide.swiper-slide-active {
			z-index: 9;
		}
		
		.recommend .lists-five-swiper.swiper-container-horizontal>.swiper-pagination-bullets {
		    line-height: 1;
		}
		.recommend .lists-five-swiper .swiper-slide.swiper-slide-prev {
			z-index: 5;
		}
		.recommend .lists-five-swiper .swiper-slide.swiper-slide-next {
			z-index: 5;
		}
		.recommend .lists-five-swiper .swiper-slide.swiper-slide-active {
			z-index: 9;
		}
		/* 商品推荐-样式5-结束 */
	
		.news {
			padding: 10px 0;
			display: flex;
			justify-content: center;
			background-repeat: no-repeat;
			background-position: center center;
			background-size: cover;
			width: 100%;
		}
	
		.news .box {
		    width: 1014px;
		}
	
		.news .box .title {
			padding: 10px 5px;
			display: flex;
			justify-content: center;
			align-items: center;
			flex-direction: column;
		}
	
		.news .box .title span {
			padding: 0 10px;
			line-height: 1.4;
		}
	
		.news .box .list {
			display: flex;
			flex-wrap: wrap;
		}
		.index-pv2 .box .list .list-item {
			flex: 0 0 ${var2}%;
			padding: 0 10px;
			box-sizing: border-box;
		}
	
		.news .box .list .list-item .list-item-body {
			border: 1px solid rgba(0, 0, 0, 3);
			padding: 10px;
			box-sizing: border-box;
			display: flex;
			cursor: pointer;
		}
	
		.news .box .list .list-item .list-item-body img {
			width: 120px;
			height: 100%;
			display: block;
			margin: 0 auto;
	    object-fit: cover;
	    max-width: 100%;
		}
	
		.news .box .list .list-item .list-item-body .item-info {
			flex: 1;
			display: flex;
			justify-content: space-between;
			flex-direction: column;
			padding-left: 10px;
			box-sizing: border-box;
		}
	
		.news .box .list .list-item .list-item-body .item-info .name {
			padding-top: 5px;
			color: red;
			font-size: 14px;
			box-sizing: border-box;
			overflow: hidden;
			text-overflow: ellipsis;
			display: -webkit-box;
			-webkit-line-clamp: 1;
			-webkit-box-orient: vertical;
		}
	
		.news .box .list .list-item .list-item-body .item-info .time {
			padding-top: 5px;
			color: red;
			font-size: 14px;
			overflow: hidden;
			text-overflow: ellipsis;
			display: -webkit-box;
			-webkit-line-clamp: 1;
			-webkit-box-orient: vertical;
		}
	
		.news .box .list .list-item1 {
			flex: 0 0 100%;
		}
	
		.news .box .list .list-item3 {
			flex: 0 0 33.33%;
		}
	
		.lists {
			padding: 10px 0;
			display: flex;
			justify-content: center;
			background-repeat: no-repeat;
			background-position: center center;
			background-size: cover;
		}
	
		.lists .box {
		    width: 1014px;
		    overflow: hidden;
		}
	
		.lists .box .title {
			padding: 10px 5px;
			display: flex;
			justify-content: center;
			align-items: center;
			flex-direction: column;
		}
	
		.lists .box .title span {
			padding: 0 10px;
			line-height: 1.4;
		}
	
		.lists .box .swiper-slide {
			box-sizing: border-box;
			cursor: pointer;
		}
	
		.lists .box .swiper-slide .img-box {
			width: 100%;
			overflow: hidden;
		}
	
		.lists .box .swiper-slide .img-box img {
			width: 100%;
			height: 100%;
			object-fit: cover;
	    max-width: 100%;
		}
	.line1 {
		display: -webkit-box;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 1;
		overflow: hidden;
	}
	.line2 {
		display: -webkit-box;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 2;
		overflow: hidden;
	}
	.line3 {
		display: -webkit-box;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 3;
		overflow: hidden;
	}
	  	.index-pv3 .box .list .list-item {
	  		flex: 0 0 20%;
	  		padding: 0 10px;
	  		box-sizing: border-box;
	  	}
	
		.index-pv1 .animation-box:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1.1) rotate(0) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
		.index-pv2 .animation-box:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1.2) rotate(360deg) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
		.index-pv3 .animation-box:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1.1) rotate(0) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
		
		.index-pv1 .animation-box img:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1) rotate(0deg) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
		.index-pv2 .animation-box img:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1) rotate(0deg) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
		.index-pv3 .animation-box img:hover {
			transform: perspective(1000px) translate3d(0px, 0px, 0px) scale(1) rotate(0deg) skew(0deg, 0deg);
			transition: all 0.3s;
			z-index: 2;
			position: relative;
		}
	  
		.swiper-new-list-6 .swiper-wrapper {
			-webkit-transition-timing-function: linear;
			-moz-transition-timing-function: linear;
			-ms-transition-timing-function: linear;
			-o-transition-timing-function: linear;
			transition-timing-function: linear;
		}
		
		.idea {
		  display: flex;
		  flex-wrap: wrap;
		}
		.idea div {
		  display: flex;
		  justify-content: center;
		  align-items: center;
		  background-repeat: no-repeat;
		  background-size: 100% 100%;
		}
		.recommendIdea .box1 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box2 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box3 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box4 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box5 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box6 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box7 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box8 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box9 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.recommendIdea .box10 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		
		.newsIdea .box1 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box2 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box3 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box4 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box5 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box6 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box7 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box8 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box9 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.newsIdea .box10 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		
		.listsIdea .box1 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box2 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box3 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box4 {
			margin: 0 2%;
			padding: 0;
			width: 0;
			height: 80px;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,.3);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box5 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box6 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box7 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box8 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box9 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
		.listsIdea .box10 {
			margin: 0;
			padding: 0;
			width: 0;
			height: 0;
			font-size: 14px;
			color: #FFF;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #ccc;
			background-color: rgba(0,0,0,0);
						background-image: false?:'';
			box-shadow: 0 0 6px rgba(0,0,0,0);
		}
	</style>
	<body>

		<div id="app">
			<!-- 轮播图 -->
			<div class="layui-carousel" style="overflow: hidden;" id="swiper" :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 auto","borderColor":"rgba(0,0,0,.3)","borderRadius":"20px","borderWidth":"0","width":"100%","borderStyle":"solid"}'>
			  <div carousel-item>
				<div v-if="swiperList.length" v-for="(item,index) in swiperList" :key="index">
					<img style="width: 100%;height: 100%;object-fit:cover;" :src="baseurl+item.value" />
				</div>
			  </div>
			</div>
			<!-- 轮播图 -->



            <!-- 推荐 -->
				<div class="recommend index-pv1" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/8d6f35d05b364f8eb22e37febc8b0a88.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:80%'>
					<div v-if="true && 1 == 1" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"-210px 0 100px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"24px","borderStyle":"solid"}'>
				      <span>Recommend</span><span>宠物信息推荐</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
					<div class="list-4">
					    <div v-if="chongwuxinxiRecommend.length>0" class="list-4-item animation-box item-1" @click="jump('../chongwuxinxi/detail.jsp?id='+chongwuxinxiRecommend[0].id)" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"380px","borderStyle":"solid","height":"380px"}'>
									<img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuxinxiRecommend[0].chongwutupian?baseurl+chongwuxinxiRecommend[0].chongwutupian.split(',')[0]:''" alt="" />
					    			<div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
										<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuxinxiRecommend[0].chongwupinzhong}}</div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuxinxiRecommend.length>1" @click="jump('../chongwuxinxi/detail.jsp?id='+chongwuxinxiRecommend[1].id)" class="list-4-item animation-box item-2" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuxinxiRecommend[1].chongwutupian?baseurl+chongwuxinxiRecommend[1].chongwutupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuxinxiRecommend[1].chongwupinzhong}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuxinxiRecommend.length>2" @click="jump('../chongwuxinxi/detail.jsp?id='+chongwuxinxiRecommend[2].id)" class="list-4-item animation-box item-3" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuxinxiRecommend[2].chongwutupian?baseurl+chongwuxinxiRecommend[2].chongwutupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuxinxiRecommend[2].chongwupinzhong}}</div>
					    			  </div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuxinxiRecommend.length>3" @click="jump('../chongwuxinxi/detail.jsp?id='+chongwuxinxiRecommend[3].id)" class="list-4-item animation-box item-4" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 0 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"240px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuxinxiRecommend[3].chongwutupian?baseurl+chongwuxinxiRecommend[3].chongwutupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuxinxiRecommend[3].chongwupinzhong}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuxinxiRecommend.length>4" @click="jump('../chongwuxinxi/detail.jsp?id='+chongwuxinxiRecommend[4].id)" class="list-4-item animation-box item-5" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuxinxiRecommend[4].chongwutupian?baseurl+chongwuxinxiRecommend[4].chongwutupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuxinxiRecommend[4].chongwupinzhong}}</div>
					    			  </div>
					    			</div>
					    </div>
					</div>
					<div class="clear"></div>
					<div style="text-align: center;">
					<button @click="jump('../chongwuxinxi/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
					</div>
					<div v-if="true && 1 == 3" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
            <!-- 推荐 -->
				<div class="recommend index-pv1" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/8d6f35d05b364f8eb22e37febc8b0a88.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:80%'>
					<div v-if="true && 1 == 1" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"-210px 0 100px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"24px","borderStyle":"solid"}'>
				      <span>Recommend</span><span>宠物粮食推荐</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
					<div class="list-4">
					    <div v-if="chongwuliangshiRecommend.length>0" class="list-4-item animation-box item-1" @click="jump('../chongwuliangshi/detail.jsp?id='+chongwuliangshiRecommend[0].id)" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"380px","borderStyle":"solid","height":"380px"}'>
									<img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuliangshiRecommend[0].shipintupian?baseurl+chongwuliangshiRecommend[0].shipintupian.split(',')[0]:''" alt="" />
					    			<div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
										<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuliangshiRecommend[0].shipinmingcheng}}</div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuliangshiRecommend.length>1" @click="jump('../chongwuliangshi/detail.jsp?id='+chongwuliangshiRecommend[1].id)" class="list-4-item animation-box item-2" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuliangshiRecommend[1].shipintupian?baseurl+chongwuliangshiRecommend[1].shipintupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuliangshiRecommend[1].shipinmingcheng}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuliangshiRecommend.length>2" @click="jump('../chongwuliangshi/detail.jsp?id='+chongwuliangshiRecommend[2].id)" class="list-4-item animation-box item-3" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuliangshiRecommend[2].shipintupian?baseurl+chongwuliangshiRecommend[2].shipintupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuliangshiRecommend[2].shipinmingcheng}}</div>
					    			  </div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuliangshiRecommend.length>3" @click="jump('../chongwuliangshi/detail.jsp?id='+chongwuliangshiRecommend[3].id)" class="list-4-item animation-box item-4" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 0 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"240px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuliangshiRecommend[3].shipintupian?baseurl+chongwuliangshiRecommend[3].shipintupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuliangshiRecommend[3].shipinmingcheng}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuliangshiRecommend.length>4" @click="jump('../chongwuliangshi/detail.jsp?id='+chongwuliangshiRecommend[4].id)" class="list-4-item animation-box item-5" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuliangshiRecommend[4].shipintupian?baseurl+chongwuliangshiRecommend[4].shipintupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuliangshiRecommend[4].shipinmingcheng}}</div>
					    			  </div>
					    			</div>
					    </div>
					</div>
					<div class="clear"></div>
					<div style="text-align: center;">
					<button @click="jump('../chongwuliangshi/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
					</div>
					<div v-if="true && 1 == 3" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
            <!-- 推荐 -->
				<div class="recommend index-pv1" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/8d6f35d05b364f8eb22e37febc8b0a88.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:80%'>
					<div v-if="true && 1 == 1" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"-210px 0 100px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"24px","borderStyle":"solid"}'>
				      <span>Recommend</span><span>宠物用品推荐</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
					<div class="list-4">
					    <div v-if="chongwuyongpinRecommend.length>0" class="list-4-item animation-box item-1" @click="jump('../chongwuyongpin/detail.jsp?id='+chongwuyongpinRecommend[0].id)" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"380px","borderStyle":"solid","height":"380px"}'>
									<img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuyongpinRecommend[0].tupian?baseurl+chongwuyongpinRecommend[0].tupian.split(',')[0]:''" alt="" />
					    			<div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
										<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuyongpinRecommend[0].shangpinmingcheng}}</div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuyongpinRecommend.length>1" @click="jump('../chongwuyongpin/detail.jsp?id='+chongwuyongpinRecommend[1].id)" class="list-4-item animation-box item-2" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuyongpinRecommend[1].tupian?baseurl+chongwuyongpinRecommend[1].tupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuyongpinRecommend[1].shangpinmingcheng}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuyongpinRecommend.length>2" @click="jump('../chongwuyongpin/detail.jsp?id='+chongwuyongpinRecommend[2].id)" class="list-4-item animation-box item-3" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 20px 0 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuyongpinRecommend[2].tupian?baseurl+chongwuyongpinRecommend[2].tupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuyongpinRecommend[2].shangpinmingcheng}}</div>
					    			  </div>
					    			</div>
					    </div>
					    <div class="list-4-body">
					    			<div v-if="chongwuyongpinRecommend.length>3" @click="jump('../chongwuyongpin/detail.jsp?id='+chongwuyongpinRecommend[3].id)" class="list-4-item animation-box item-4" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0 0 20px 0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"240px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuyongpinRecommend[3].tupian?baseurl+chongwuyongpinRecommend[3].tupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuyongpinRecommend[3].shangpinmingcheng}}</div>
					    			  </div>
					    			</div>
					    			<div v-if="chongwuyongpinRecommend.length>4" @click="jump('../chongwuyongpin/detail.jsp?id='+chongwuyongpinRecommend[4].id)" class="list-4-item animation-box item-5" :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0, .3)","margin":"0","borderColor":"rgba(93, 117, 153, 1)","backgroundColor":"rgba(204, 204, 204, 0)","borderRadius":"30px","borderWidth":"4px","width":"280px","borderStyle":"solid","height":"300px"}'>
					    			  <img :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"#ccc","borderRadius":"30px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"100%"}' :src="chongwuyongpinRecommend[4].tupian?baseurl+chongwuyongpinRecommend[4].tupian.split(',')[0]:''" alt="" />
					    			  <div :style='{"padding":"0","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0, 0, 0, 0.5)","borderRadius":"0 0 26px 26px","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' v-if="true" class="list-4-item-center">
					    			  	<div class="list-4-item-title line1" :style='{"padding":"0 6px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"center","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"14px","borderStyle":"solid"}'>{{chongwuyongpinRecommend[4].shangpinmingcheng}}</div>
					    			  </div>
					    			</div>
					    </div>
					</div>
					<div class="clear"></div>
					<div style="text-align: center;">
					<button @click="jump('../chongwuyongpin/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
					</div>
					<div v-if="true && 1 == 3" class="idea recommendIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"100px 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/dae3b76531bc4c0f9d531dc5db71d1f1.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
			<!-- 推荐 -->

            

			<!-- 新闻资讯 -->

			

			<!-- 图文列表 -->
				<!-- 样式一 -->
				<div class="recommend index-pv3" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/f3f3be8f20714d08b1ed6a8b7533680e.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:50%'>
					<div v-if="true && 1 == 1" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"isshow":true,"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"10px 40% 10px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"20px","borderStyle":"solid"}'>
				      <span>DATA SHOW</span><span>宠物信息展示</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="list">
				      <div v-for="(item,index) in chongwuxinxiList" :key="index" @click="jump('../chongwuxinxi/detail.jsp?id='+item.id)" class="list-item" :class="5=='3'?'list-item3':5=='5'?'list-item5':''">
				        <div class="list-item-body animation-box" :style='{"padding":"32px 24px","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 0 10px 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(106, 190, 255, 1)","borderRadius":"40px","borderWidth":"0","borderStyle":"solid"}'>
							<img :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","borderColor":"rgba(0,0,0,.3)","borderRadius":"120px","borderWidth":"0","width":"170px","borderStyle":"solid","height":"270px"}' :src="item.chongwutupian?baseurl+item.chongwutupian.split(',')[0]:''" alt="" />
							<div  class="line1" v-if='true' :style='{"isshow":true,"padding":"10px 0","margin":"15px 0 10px","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(72, 54, 42, 1)","borderRadius":"16px","textAlign":"center","fontSize":"14px"}' class="name">{{item.chongwupinzhong}}</div>
				        </div>
				      </div>
				    </div>
				    <div class="clear"></div>
				    <div style="text-align: center;">
					<button @click="jump('../chongwuxinxi/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
				    </div>
					<div v-if="true && 1 == 3" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
			<!-- 图文列表 -->
				<!-- 样式一 -->
				<div class="recommend index-pv3" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/f3f3be8f20714d08b1ed6a8b7533680e.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:50%'>
					<div v-if="true && 1 == 1" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"isshow":true,"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"10px 40% 10px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"20px","borderStyle":"solid"}'>
				      <span>DATA SHOW</span><span>宠物疫苗展示</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="list">
				      <div v-for="(item,index) in chongwuyimiaoList" :key="index" @click="jump('../chongwuyimiao/detail.jsp?id='+item.id)" class="list-item" :class="5=='3'?'list-item3':5=='5'?'list-item5':''">
				        <div class="list-item-body animation-box" :style='{"padding":"32px 24px","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 0 10px 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(106, 190, 255, 1)","borderRadius":"40px","borderWidth":"0","borderStyle":"solid"}'>
							<img :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","borderColor":"rgba(0,0,0,.3)","borderRadius":"120px","borderWidth":"0","width":"170px","borderStyle":"solid","height":"270px"}' :src="item.yimiaofengmian?baseurl+item.yimiaofengmian.split(',')[0]:''" alt="" />
							<div  class="line1" v-if='true' :style='{"isshow":true,"padding":"10px 0","margin":"15px 0 10px","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(72, 54, 42, 1)","borderRadius":"16px","textAlign":"center","fontSize":"14px"}' class="name">{{item.yimiaomingcheng}}</div>
				        </div>
				      </div>
				    </div>
				    <div class="clear"></div>
				    <div style="text-align: center;">
					<button @click="jump('../chongwuyimiao/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
				    </div>
					<div v-if="true && 1 == 3" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
			<!-- 图文列表 -->
				<!-- 样式一 -->
				<div class="recommend index-pv3" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/f3f3be8f20714d08b1ed6a8b7533680e.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:50%'>
					<div v-if="true && 1 == 1" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"isshow":true,"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"10px 40% 10px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"20px","borderStyle":"solid"}'>
				      <span>DATA SHOW</span><span>宠物美容展示</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="list">
				      <div v-for="(item,index) in chongwumeirongList" :key="index" @click="jump('../chongwumeirong/detail.jsp?id='+item.id)" class="list-item" :class="5=='3'?'list-item3':5=='5'?'list-item5':''">
				        <div class="list-item-body animation-box" :style='{"padding":"32px 24px","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 0 10px 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(106, 190, 255, 1)","borderRadius":"40px","borderWidth":"0","borderStyle":"solid"}'>
							<img :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","borderColor":"rgba(0,0,0,.3)","borderRadius":"120px","borderWidth":"0","width":"170px","borderStyle":"solid","height":"270px"}' :src="item.tupian?baseurl+item.tupian.split(',')[0]:''" alt="" />
							<div  class="line1" v-if='true' :style='{"isshow":true,"padding":"10px 0","margin":"15px 0 10px","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(72, 54, 42, 1)","borderRadius":"16px","textAlign":"center","fontSize":"14px"}' class="name">{{item.fuwumingcheng}}</div>
				        </div>
				      </div>
				    </div>
				    <div class="clear"></div>
				    <div style="text-align: center;">
					<button @click="jump('../chongwumeirong/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
				    </div>
					<div v-if="true && 1 == 3" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
			<!-- 图文列表 -->
				<!-- 样式一 -->
				<div class="recommend index-pv3" :style='{"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0","borderColor":"rgba(0,0,0,.3)","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220305/f3f3be8f20714d08b1ed6a8b7533680e.png) no-repeat top","borderStyle":"solid"}'>
				  <div class="box" style='width:50%'>
					<div v-if="true && 1 == 1" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="title" :style='{"isshow":true,"padding":"10px 0 10px 0","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"10px 40% 10px 0","borderColor":"rgba(0,0,0,1)","backgroundColor":"rgba(247, 247, 247, 0)","color":"rgba(0, 0, 0, 1)","borderRadius":"0","alignItems":"center","borderWidth":"0","fontSize":"20px","borderStyle":"solid"}'>
				      <span>DATA SHOW</span><span>宠物培养展示</span>
				    </div>
					<div v-if="true && 1 == 2" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				    <div class="list">
				      <div v-for="(item,index) in chongwupeiyangList" :key="index" @click="jump('../chongwupeiyang/detail.jsp?id='+item.id)" class="list-item" :class="5=='3'?'list-item3':5=='5'?'list-item5':''">
				        <div class="list-item-body animation-box" :style='{"padding":"32px 24px","boxShadow":"0 0 0px rgba(110,22,64,.8)","margin":"0 0 10px 0","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(106, 190, 255, 1)","borderRadius":"40px","borderWidth":"0","borderStyle":"solid"}'>
							<img :style='{"boxShadow":"0 0 0px rgba(110,22,64,.8)","borderColor":"rgba(0,0,0,.3)","borderRadius":"120px","borderWidth":"0","width":"170px","borderStyle":"solid","height":"270px"}' :src="item.tupian?baseurl+item.tupian.split(',')[0]:''" alt="" />
							<div  class="line1" v-if='true' :style='{"isshow":true,"padding":"10px 0","margin":"15px 0 10px","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(72, 54, 42, 1)","borderRadius":"16px","textAlign":"center","fontSize":"14px"}' class="name">{{item.peiyangkecheng}}</div>
				        </div>
				      </div>
				    </div>
				    <div class="clear"></div>
				    <div style="text-align: center;">
					<button @click="jump('../chongwupeiyang/list.jsp')" style="display: block;cursor: pointer;" type="button" :style='{"padding":"0 15px","boxShadow":"0 0 6px rgba(255,0,0,0)","margin":"20px auto","borderColor":"#ccc","backgroundColor":"#fff","color":"rgba(106, 190, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","fontSize":"18px","borderStyle":"solid","height":"34px"}'>查看更多<i v-if="false" :style='{"isshow":false,"padding":"0 0 0 1px","fontSize":"14px","color":"rgba(110,22,64,1)"}' class="layui-icon layui-icon-next"></i></el-button>
				    </div>
					<div v-if="true && 1 == 3" class="idea listsIdea" :style='{"padding":"10px 5px","boxShadow":"0 0 6px rgba(0,0,0,0)","margin":"50px 0 0","borderColor":"#ccc","borderRadius":"0","borderWidth":"0","background":"transparent url(http://codegen.caihongy.cn/20220303/f1e9eb9364e04ae9ad4645dcde3de2b5.png) no-repeat top","width":"100%","borderStyle":"solid","height":"auto"}'>
						<div class="box1"></div>
						<div class="box2"></div>
						<div class="box3"></div>
						<div class="box4"></div>
						<div class="box5"></div>
						<div class="box6"></div>
						<div class="box7"></div>
						<div class="box8"></div>
						<div class="box9"></div>
						<div class="box10"></div>
					</div>
				  </div>
				</div>
			<!-- 图文列表 -->


		</div>
		<script src="../../layui/layui.js"></script>
		<script src="../../js/swiper.min.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>

		<script>
			var vue = new Vue({
				el: '#app',
				data: {


                    // 推荐数据
					chongwuxinxiRecommend: [],
                    // 推荐数据
					chongwuliangshiRecommend: [],
                    // 推荐数据
					chongwuyongpinRecommend: [],



                    chongwuxinxiList: [],
                    chongwuyimiaoList: [],
                    chongwumeirongList: [],
                    chongwupeiyangList: [],


                    // 轮播图
					swiperList: [],
					baseurl: '',
					// 新闻资讯
					newsList: [],
					leftNewsList: [],
					rightNewsList: []
				},
				filters: {
					newsDesc: function(val) {
						if (val) {
							if (val.length > 60) {
								return val.substring(0, 60).replace(/<[^>]*>/g).replace(/undefined/g, '');
							} else {
								return val.replace(/<[^>]*>/g).replace(/undefined/g, '');
							}
						}
						return '';
					}
				},
				methods: {
					jump(url) {
						jump(url)
					},
				}
			})

			layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var form = layui.form;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				vue.baseurl = http.baseurl;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						vue.swiperList = res.data.list;
						
						vue.$nextTick(() => {
							carousel.render({
								elem: '#swiper',
								width: '100%',
								height: '250px',
								arrow: 'hover',
								anim: 'default',
								autoplay: 'true',
								interval: '3000',
								indicator: 'none'
							});
						})
					}
				});
                


                

                // 获取推荐信息
      				var autoSortUrl = "chongwuxinxi/autoSort";
				http.request(autoSortUrl, 'get', {
					page: 1,
				}, function(res) {
					vue.chongwuxinxiRecommend = res.data.list
					let flag = 4;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
								new Swiper ('#recommendchongwuxinxi', options)
								new Swiper ('#recommendchongwuliangshi', options)
								new Swiper ('#recommendchongwuyongpin', options)
						})
					}
					
					// 商品推荐样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#recommend-five-swiperchongwuxinxi', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});
                // 获取推荐信息
      				var autoSortUrl = "chongwuliangshi/autoSort";
				http.request(autoSortUrl, 'get', {
					page: 1,
				}, function(res) {
					vue.chongwuliangshiRecommend = res.data.list
					let flag = 4;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
								new Swiper ('#recommendchongwuxinxi', options)
								new Swiper ('#recommendchongwuliangshi', options)
								new Swiper ('#recommendchongwuyongpin', options)
						})
					}
					
					// 商品推荐样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#recommend-five-swiperchongwuliangshi', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});
                // 获取推荐信息
      				var autoSortUrl = "chongwuyongpin/autoSort";
				http.request(autoSortUrl, 'get', {
					page: 1,
				}, function(res) {
					vue.chongwuyongpinRecommend = res.data.list
					let flag = 4;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
								new Swiper ('#recommendchongwuxinxi', options)
								new Swiper ('#recommendchongwuliangshi', options)
								new Swiper ('#recommendchongwuyongpin', options)
						})
					}
					
					// 商品推荐样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#recommend-five-swiperchongwuyongpin', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});

				

                http.request(`chongwuxinxi/list`, 'get', {
					page: 1,
					limit: 5 * 1
				}, function(res) {
					vue.chongwuxinxiList = res.data.list
					let flag = 1;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
							new Swiper ('#listschongwuxinxi', options)
							new Swiper ('#listschongwuyimiao', options)
							new Swiper ('#listschongwumeirong', options)
							new Swiper ('#listschongwupeiyang', options)
						})
					}
					// 商品列表样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#lists-five-swiperchongwuxinxi', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});
                http.request(`chongwuyimiao/list`, 'get', {
					page: 1,
					limit: 5 * 1
				}, function(res) {
					vue.chongwuyimiaoList = res.data.list
					let flag = 1;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
							new Swiper ('#listschongwuxinxi', options)
							new Swiper ('#listschongwuyimiao', options)
							new Swiper ('#listschongwumeirong', options)
							new Swiper ('#listschongwupeiyang', options)
						})
					}
					// 商品列表样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#lists-five-swiperchongwuyimiao', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});
                http.request(`chongwumeirong/list`, 'get', {
					page: 1,
					limit: 5 * 1
				}, function(res) {
					vue.chongwumeirongList = res.data.list
					let flag = 1;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
							new Swiper ('#listschongwuxinxi', options)
							new Swiper ('#listschongwuyimiao', options)
							new Swiper ('#listschongwumeirong', options)
							new Swiper ('#listschongwupeiyang', options)
						})
					}
					// 商品列表样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#lists-five-swiperchongwumeirong', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});
                http.request(`chongwupeiyang/list`, 'get', {
					page: 1,
					limit: 5 * 1
				}, function(res) {
					vue.chongwupeiyangList = res.data.list
					let flag = 1;
					let options = {"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"slidesPerView":5,"loop":true,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					if(flag == 3) {
						vue.$nextTick(() => {
							new Swiper ('#listschongwuxinxi', options)
							new Swiper ('#listschongwuyimiao', options)
							new Swiper ('#listschongwumeirong', options)
							new Swiper ('#listschongwupeiyang', options)
						})
					}
					// 商品列表样式五
					if(flag == 5) {
						vue.$nextTick(() => {
							var swiper = new Swiper('#lists-five-swiperchongwupeiyang', {
								loop: true,
								speed: 500,
								slidesPerView: Number(5),
								spaceBetween: Number(10),
								autoplay: {"delay":3000,"disableOnInteraction":false},
								centeredSlides: true,
								watchSlidesProgress: true,
								on: {
									setTranslate: function() {
										slides = this.slides
										for (i = 0; i < slides.length; i++) {
											slide = slides.eq(i)
											progress = slides[i].progress
											// slide.html(progress.toFixed(2)); //看清楚progress是怎么变化的
											slide.css({
												'opacity': '',
												'background': ''
											});
											slide.transform(''); //清除样式
							
											slide.transform('scale(' + (1.5 - Math.abs(progress) / 4) + ')');
										}
									},
									setTransition: function(transition) {
										for (var i = 0; i < this.slides.length; i++) {
											var slide = this.slides.eq(i)
											slide.transition(transition);
										}
									},
								},
								navigation: {"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},
								pagination: {"el":".swiper-pagination","clickable":true},
							});
						})
					}
				});

				
			});
		</script>
	</body>
</html>
