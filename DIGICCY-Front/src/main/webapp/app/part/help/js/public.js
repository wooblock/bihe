app.controller("public",["$scope","$http","$rootScope","postInfo",function (scope,http,rootScope,postInfo){
    $(".nav .inner a").eq(0).addClass("on").siblings().removeClass("on");
//    获取公告
    postInfo.dataInfos(rootScope.ip+"/notice/getNoticeByType.do",{'type':1})
    .success(function(data){
         scope.data=data.data;
    }).error(function(error){
        console.log("公告获取错误"+error);
    });
    scope.xiangxi=function(a){
    	window.sessionStorage['articleId']=a;
	    window.open("./index.html#/xiangxi");
    }
}]);