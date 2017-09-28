app.controller("liaojie",["$scope","$http",function($scope,$http){
    $http({
        url:'../../transation.json',
        method:'GET'
    }).success(function(data){
        $scope.ljTitle=data.liaojie.ljTitle;
        $scope.ljLogo=data.liaojie.ljLogo;
        $scope.ljcon4=data.liaojie.ljcon4;
        $scope.ljcon5=data.liaojie.ljcon5;
        $scope.ljsp1=data.liaojie.ljsp1;
        $scope.lgsp2=data.liaojie.lgsp2;
        $scope.lgsp3=data.liaojie.lgsp3;
        $scope.ljlkt=data.liaojie.ljlkt;
        $scope.ljDown=data.liaojie.ljDown;
        $scope.ljFoot=data.liaojie.ljFoot;
        $scope.ljtable=data.liaojie.ljtable;
        $scope.ljts=data.liaojie.ljts;
        $scope.lims=data.liaojie.lims;
        $scope.ljqd=data.liaojie.ljqd;
        $scope.ljqda=data.liaojie.ljqda;
        
    }).error(function(data){
        console.log(data);
    });
}]);