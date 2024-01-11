
var projectName = '网上宠物店';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的订单',
	url: '../shop-order/list.jsp'
},

{
	name: '我的地址',
	url: '../shop-address/list.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '宠物信息',
	url: './pages/chongwuxinxi/list.jsp'
}, 
{
	name: '宠物粮食',
	url: './pages/chongwuliangshi/list.jsp'
}, 
{
	name: '宠物用品',
	url: './pages/chongwuyongpin/list.jsp'
}, 
{
	name: '宠物疫苗',
	url: './pages/chongwuyimiao/list.jsp'
}, 
{
	name: '宠物美容',
	url: './pages/chongwumeirong/list.jsp'
}, 
{
	name: '宠物培养',
	url: './pages/chongwupeiyang/list.jsp'
}, 

]

var adminurl =  "http://localhost:8080/jspm9s757/index.jsp";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"培养师","menuJump":"列表","tableName":"peiyangshi"}],"menu":"培养师管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"宠物种类","menuJump":"列表","tableName":"chongwuzhonglei"}],"menu":"宠物种类管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物信息","menuJump":"列表","tableName":"chongwuxinxi"}],"menu":"宠物信息管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"食品类型","menuJump":"列表","tableName":"shipinleixing"}],"menu":"食品类型管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物粮食","menuJump":"列表","tableName":"chongwuliangshi"}],"menu":"宠物粮食管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"用品类型","menuJump":"列表","tableName":"yongpinleixing"}],"menu":"用品类型管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物用品","menuJump":"列表","tableName":"chongwuyongpin"}],"menu":"宠物用品管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","查看评论","疫苗预约"],"menu":"宠物疫苗","menuJump":"列表","tableName":"chongwuyimiao"}],"menu":"宠物疫苗管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","支付"],"menu":"宠物疫苗预约","menuJump":"列表","tableName":"chongwuyimiaoyuyue"}],"menu":"宠物疫苗预约管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除","查看评论","美容预约"],"menu":"宠物美容","menuJump":"列表","tableName":"chongwumeirong"}],"menu":"宠物美容管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除","支付"],"menu":"美容预约","menuJump":"列表","tableName":"meirongyuyue"}],"menu":"美容预约管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除","查看评论","下单"],"menu":"宠物培养","menuJump":"列表","tableName":"chongwupeiyang"}],"menu":"宠物培养管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除","支付"],"menu":"培养订单","menuJump":"列表","tableName":"peiyangdingdan"}],"menu":"培养订单管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","物流","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-newshot","buttons":["查看","物流"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-time","buttons":["查看","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"宠物信息列表","menuJump":"列表","tableName":"chongwuxinxi"}],"menu":"宠物信息模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"宠物粮食列表","menuJump":"列表","tableName":"chongwuliangshi"}],"menu":"宠物粮食模块"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"宠物用品列表","menuJump":"列表","tableName":"chongwuyongpin"}],"menu":"宠物用品模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","疫苗预约"],"menu":"宠物疫苗列表","menuJump":"列表","tableName":"chongwuyimiao"}],"menu":"宠物疫苗模块"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","美容预约"],"menu":"宠物美容列表","menuJump":"列表","tableName":"chongwumeirong"}],"menu":"宠物美容模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","下单"],"menu":"宠物培养列表","menuJump":"列表","tableName":"chongwupeiyang"}],"menu":"宠物培养模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","支付"],"menu":"宠物疫苗预约","menuJump":"列表","tableName":"chongwuyimiaoyuyue"}],"menu":"宠物疫苗预约管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","删除","支付"],"menu":"美容预约","menuJump":"列表","tableName":"meirongyuyue"}],"menu":"美容预约管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除","支付"],"menu":"培养订单","menuJump":"列表","tableName":"peiyangdingdan"}],"menu":"培养订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"宠物信息列表","menuJump":"列表","tableName":"chongwuxinxi"}],"menu":"宠物信息模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"宠物粮食列表","menuJump":"列表","tableName":"chongwuliangshi"}],"menu":"宠物粮食模块"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"宠物用品列表","menuJump":"列表","tableName":"chongwuyongpin"}],"menu":"宠物用品模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","疫苗预约"],"menu":"宠物疫苗列表","menuJump":"列表","tableName":"chongwuyimiao"}],"menu":"宠物疫苗模块"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","美容预约"],"menu":"宠物美容列表","menuJump":"列表","tableName":"chongwumeirong"}],"menu":"宠物美容模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","下单"],"menu":"宠物培养列表","menuJump":"列表","tableName":"chongwupeiyang"}],"menu":"宠物培养模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物培养","menuJump":"列表","tableName":"chongwupeiyang"}],"menu":"宠物培养管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"培养订单","menuJump":"列表","tableName":"peiyangdingdan"}],"menu":"培养订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"宠物信息列表","menuJump":"列表","tableName":"chongwuxinxi"}],"menu":"宠物信息模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"宠物粮食列表","menuJump":"列表","tableName":"chongwuliangshi"}],"menu":"宠物粮食模块"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"宠物用品列表","menuJump":"列表","tableName":"chongwuyongpin"}],"menu":"宠物用品模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","疫苗预约"],"menu":"宠物疫苗列表","menuJump":"列表","tableName":"chongwuyimiao"}],"menu":"宠物疫苗模块"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","美容预约"],"menu":"宠物美容列表","menuJump":"列表","tableName":"chongwumeirong"}],"menu":"宠物美容模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","下单"],"menu":"宠物培养列表","menuJump":"列表","tableName":"chongwupeiyang"}],"menu":"宠物培养模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"培养师","tableName":"peiyangshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
