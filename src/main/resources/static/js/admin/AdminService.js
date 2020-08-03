
app.service('AdminDashboardService', ["$log", "$q", "$http", function ($log, $q, $http) {

    this.getAllAdmins = function (){
        let defer = $q.defer();
        $http({
            method: "GET",
            url: "/api/admins"
        }).then(function (res) {
                if(parseInt(res.status/100) === 2) {
                    defer.resolve(res.data);
                } else {
                    defer.reject(res.data);
                }
            },
            function () {
                defer.reject();
            });

        return defer.promise;
    };

    this.addAdmin= function(admin){
        let defer = $q.defer();
        $http({
            method: "POST",
            url: "/api/admin/add",
            data:JSON.stringify(admin)

        }).then(function (res) {
                if(parseInt(res.status/100) === 2) {
                    defer.resolve(res.data);
                } else {
                    defer.reject(res.data);
                    // $().toastmessage('showErrorToast', res.data);
                }
            },
            function (resp) {
                // $().toastmessage('showErrorToast', resp);
                defer.reject();
            });

        return defer.promise;
    }
}])
