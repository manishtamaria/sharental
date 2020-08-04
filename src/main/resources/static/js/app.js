const app = angular.module('Sharental',['ui.bootstrap']);

app
    .controller('ProfileController', function($scope,$http) {
        $scope.user=null;
        $http({
            method: 'GET',
            url: "/api/user/profile?id="+1
        }).then(function successCallback(response) {
            console.log(response);
            $scope.user = response.data;
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
        $scope.products=[];
        $http({
            method: 'GET',
            url: "/api/user/"+1+"/products"
        }).then(function successCallback(response) {
            console.log(response);
            $scope.products = response.data;
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    })