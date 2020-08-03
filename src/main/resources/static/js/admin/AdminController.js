
app
    .controller('AdminController', function($scope, $log,$uibModal, AdminDashboardService) {
        AdminDashboardService.getAllAdmins().then(function(resp){
            $scope.admins = resp;
        });

        $scope.addAdmin = function() {
            $uibModal.open({
                templateUrl: 'AddAdminModalTemplate.html',
                backdrop: true,
                windowClass: 'modal',
                controller($scope, $uibModalInstance, $log) {
                    $scope.submit = function(admin) {
                        $log.log(`Adding Admin`);
                        AdminDashboardService.addAdmin(admin);
                        $uibModalInstance.dismiss('cancel');
                    };
                    $scope.cancel = () => {
                        $uibModalInstance.dismiss('cancel');
                    };
                },
                resolve: {
                    user() {
                        return $scope.selected;
                    }
                }
            });
        };
    })