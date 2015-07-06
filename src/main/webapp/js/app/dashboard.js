/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var dashboardApp = angular.module('dashboardApp', ['ui.router', 'dashboardFactory', 'dashboardControl', 'chart.js'])

        .config(['$stateProvider', '$urlRouterProvider',
            function ($stateProvider, $urlRouterProvider) {

                $urlRouterProvider.otherwise('/overview');

                // States
                $stateProvider
                        .state('overview', {
                            url: '/overview',
                            templateUrl: 'templates/overview.html',
                            controller: 'OverviewCtrl',
                            resolve: {
                                overview: ['overview', function (overview) {
//                                return overview.query();
                                        return {'numberOfGamesPlayed': 75,
                                            'totalNumberOfGames': 100,
                                            'numberOfPlayers': 3,
                                            'numberOfCompetitions': 2,
                                            'playerOverview': [
                                                {'player': {
                                                        'id': 1,
                                                        'name': 'John',
                                                        'imageUrl': 'https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xaf1/v/t1.0-1/c26.26.325.325/s160x160/268701_10200160797083827_829467255_n.jpg?oh=71c4b8122be114f635d567beca790d32&oe=55CB288C&__gda__=1440724015_777f7ba3942c7adb0ac5ce74902d6425'
                                                    },
                                                    'competitonsEntered': 2,
                                                    'gamesPlayed': 20,
                                                    'gamesWon': 15,
                                                    'gamesLost': 2,
                                                    'gamesDrawn': 3,
                                                    'homeGames': 10,
                                                    'homeGamesWon': 10,
                                                    'homeGamesLost': 0,
                                                    'homeGamesDrawn': 0,
                                                    'awayGames': 10,
                                                    'awayGamesWon': 5,
                                                    'awayGamesLost': 2,
                                                    'awayGamesDrawn': 3
                                                },
                                                {'player': {
                                                        'id': 2,
                                                        'name': 'Mark',
                                                        'imageUrl': 'https://fbcdn-profile-a.akamaihd.net/hprofile-ak-frc3/v/t1.0-1/c68.33.415.415/s160x160/942728_10201237772293642_489246806_n.jpg?oh=475b4c005fe95edd8d893964eff7c7b0&oe=55DEFFE9&__gda__=1439766040_61d74847d1fe7133ca07ecaa11e23385'
                                                    },
                                                    'competitonsEntered': 2,
                                                    'gamesPlayed': 20,
                                                    'gamesWon': 15,
                                                    'gamesLost': 2,
                                                    'gamesDrawn': 3,
                                                    'homeGames': 10,
                                                    'homeGamesWon': 10,
                                                    'homeGamesLost': 0,
                                                    'homeGamesDrawn': 0,
                                                    'awayGames': 10,
                                                    'awayGamesWon': 5,
                                                    'awayGamesLost': 2,
                                                    'awayGamesDrawn': 3
                                                },
                                                {'player': {
                                                        'id': 3,
                                                        'name': 'Tommy',
                                                        'imageUrl': 'https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xpf1/v/t1.0-1/c53.53.662.662/s160x160/534502_10152191287070114_322322669_n.jpg?oh=27fc6c34163c4ccd740684b59a7485e6&oe=55D60489&__gda__=1439546715_525310f7376314b02adabbac627ac08f'
                                                    },
                                                    'competitonsEntered': 2,
                                                    'gamesPlayed': 20,
                                                    'gamesWon': 15,
                                                    'gamesLost': 2,
                                                    'gamesDrawn': 3,
                                                    'homeGames': 10,
                                                    'homeGamesWon': 10,
                                                    'homeGamesLost': 0,
                                                    'homeGamesDrawn': 0,
                                                    'awayGames': 10,
                                                    'awayGamesWon': 5,
                                                    'awayGamesLost': 2,
                                                    'awayGamesDrawn': 3
                                                }
                                            ]};
                                    }]
                            }
                        })
                        .state('playerList', {
                            url: "/playerList",
                            templateUrl: 'templates/playerList.html',
                            controller: 'PlayerListCtrl',
                            resolve: {
                                playerList: ['player', function (player) {
                                        return player.findAll();
                                    }]
                            }
                        })
                        .state('player', {
                            url: "/player/:playerId",
                            templateUrl: 'templates/player.html',
                            controller: 'PlayerCtrl',
                            resolve: {
                                player: ['player', '$stateParams'
                                            , function (player, $stateParams) {
                                        return player.get({playerId: $stateParams.playerId});
                                            }]
                            }
                        })
                        .state('teamList', {
                            url: "/teamList",
                            templateUrl: 'templates/teamList.html',
                            controller: 'TeamListCtrl',
                            resolve: {
                                teamList: ['team', function (team) {
                                        return team.findAll();
                                    }]
                            }
                        })
                        .state('team', {
                            url: "/team/:teamId",
                            templateUrl: 'templates/team.html',
                            controller: 'TeamCtrl',
                            resolve: {
                                team: ['team', '$stateParams'
                                            , function (team, $stateParams) {
                                                return team.get({teamId: $stateParams.teamId});
                                            }]
                            }
                        })
                        .state('gameList', {
                            url: "/gameList",
                            templateUrl: 'templates/gameList.html',
                            controller: 'GameListCtrl',
                            resolve: {
                                gameList: ['game', function (game) {
                                        return game.findAll();
                                    }]
                            }
                        })
                        .state('game', {
                            url: "/game/:gameId",
                            templateUrl: 'templates/game.html',
                            controller: 'GameCtrl',
                            resolve: {
                                game: ['game', '$stateParams'
                                            , function (game, $stateParams) {
                                                return game.get({gameId: $stateParams.gameId});
                                            }]
                            }
                        })
                        .state('competitionList', {
                            url: "/competitionList",
                            templateUrl: 'templates/competitionList.html',
                            controller: 'CompetitionListCtrl',
                            resolve: {
                                competitionList: ['competition', function (competition) {
                                        return competition.findAll();
                                    }]
                            }
                        })
                        .state('competition', {
                            url: "/competition/:competitionId",
                            templateUrl: 'templates/competition.html',
                            controller: 'CompetitionCtrl',
                            resolve: {
                                competition: ['competition', '$stateParams'
                                            , function (competition, $stateParams) {
                                                return competition.get({competitionId: $stateParams.competitionId});
                                            }]
                            }
                        });
            }
        ]).run(function ($state) {
    $state.go('overview'); //make a transition to overview state when app starts
});
