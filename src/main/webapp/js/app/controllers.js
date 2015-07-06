var dashboardControllers = angular.module('dashboardControl', ['dashboardFactory'])
        .controller('PlayerListCtrl', ['$scope', 'playerList', function ($scope, playerList) {
                $scope.playerList = playerList;
            }])
        .controller('PlayerCtrl', ['$scope', 'player', function ($scope, player) {
                $scope.player = player;
            }])
        .controller('TeamListCtrl', ['$scope', 'teamList', function ($scope, teamList) {
                $scope.teamList = teamList;
            }])
        .controller('TeamCtrl', ['$scope', 'team', function ($scope, team) {
                $scope.team = team;
            }])
        .controller('GameListCtrl', ['$scope', 'gameList', function ($scope, gameList) {
                $scope.gameList = gameList;
            }])
        .controller('GameCtrl', ['$scope', 'game', function ($scope, game) {
                $scope.game = game;
            }])
        .controller('CompetitionListCtrl', ['$scope', 'competitionList', function ($scope, competitionList) {
                $scope.competitionList = competitionList;
            }])
        .controller('CompetitionCtrl', ['$scope', 'competition', function ($scope, competition) {
                $scope.competition = competition;
            }])
        .controller('OverviewCtrl', ['$scope', 'overview', function ($scope, overview) {
                $scope.overview = overview;

                $scope.getPlayerOverviewDataForChart = function () {
                    var playerOverviewData = [];

                    for (var idx = 0; idx < overview.playerOverview.length; idx++) {
                        var data = {
                            'playerId': overview.playerOverview[idx].player.id,
                            'playerName' : overview.playerOverview[idx].player.name,
                            'gamesPlayedLabels': ['Win', 'Loss', 'Draw'],
                            'gamesPlayedChartData': [overview.playerOverview[idx].gamesWon,
                                overview.playerOverview[idx].gamesLost,
                                overview.playerOverview[idx].gamesDrawn],
                            'homeAwayRatioLabels': ['Home', 'Away'],
                            'homeAwayRatioChartData': [overview.playerOverview[idx].homeGames,
                                overview.playerOverview[idx].awayGames]
                        };
                        playerOverviewData.push(data);
                    }

                    return playerOverviewData;
                };
            }])

        .controller('FixtureCreateController', function ($scope, $state, $stateParams, competition) {
            competition.postFixture($scope.fixture);

            $state.go('competition'); // on success go back to competition page again...
        });