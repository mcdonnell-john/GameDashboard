var dashboardFactories = angular.module('dashboardFactory',['ngResource']);

dashboardFactories.factory("overview", ['$resource',
    function ($resource) {
        return $resource('webresources/overview/', {}, {
            query: {method: 'GET', isArray: false}
        });
    }]);
dashboardFactories.factory('player', ['$resource', function($resource){

   return $resource('webresources/persons/:playerId', {}, {
     findAll: {method: 'GET', isArray: true},
     get: {method: 'GET', isArray: false}
    });
    
}]);
dashboardFactories.factory('team', ['$resource', function($resource){

   return $resource('webresources/team/:teamId', {}, {
     findAll: {method: 'GET', isArray: true},
     get: {method: 'GET', isArray: false}
    });
    
}]);
dashboardFactories.factory('game', ['$resource', function($resource){

   return $resource('webresources/games/:gameId', {}, {
     findAll: {method: 'GET', isArray: true},
     get: {method: 'GET', isArray: false}
    });
    
}]);
dashboardFactories.factory('competition', ['$resource', function($resource){

   return $resource('webresources/competition/:competitionId', {}, {
     findAll: {method: 'GET', isArray: true},
     get: {method: 'GET', isArray: false}
    });
}]);