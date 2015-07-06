/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author john
 */
public class Teams {

    private Teams() {

    }

    // still need to get game...
    public static List<Team> FIFA_TEAMS() {
        List<Team> teams = new ArrayList<>();

        Team arsenal = new Team();
        arsenal.setName("Arsenal");
        arsenal.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/53/Arsenal_FC.svg/323px-Arsenal_FC.svg.png");
        teams.add(arsenal);

        Team astonVilla = new Team();
        astonVilla.setName("Aston Villa");
        astonVilla.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/1/15/Aston_Villa.svg/143px-Aston_Villa.svg.png");
        teams.add(astonVilla);

        Team bournmouth = new Team();
        bournmouth.setName("AFC Bournemouth");
        bournmouth.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/e5/AFC_Bournemouth_%282013%29.svg/241px-AFC_Bournemouth_%282013%29.svg.png");
        teams.add(bournmouth);

        Team chelsea = new Team();
        chelsea.setName("Chelsea");
        chelsea.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/209px-Chelsea_FC.svg.png");
        teams.add(chelsea);

        Team crystalPalace = new Team();
        crystalPalace.setName("Crystal Palace");
        crystalPalace.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Crystal_Palace_FC_logo.svg/69px-Crystal_Palace_FC_logo.svg.png");
        teams.add(crystalPalace);

        Team everton = new Team();
        everton.setName("Everton");
        everton.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/7c/Everton_FC_logo.svg/325px-Everton_FC_logo.svg.png");
        teams.add(everton);

        Team leicester = new Team();
        leicester.setName("Leicester City");
        leicester.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/2/2d/Leicester_City_crest.svg/400px-Leicester_City_crest.svg.png");
        teams.add(leicester);

        Team liverpool = new Team();
        liverpool.setName("Liverpool");
        liverpool.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/370px-Liverpool_FC.svg.png");
        teams.add(liverpool);

        Team manCity = new Team();
        manCity.setName("Manchester City");
        manCity.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Manchester_City.svg/221px-Manchester_City.svg.png");
        teams.add(manCity);

        Team manUnited = new Team();
        manUnited.setName("Manchester United");
        manUnited.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/296px-Manchester_United_FC_crest.svg.png");
        teams.add(manUnited);

        Team newcastle = new Team();
        newcastle.setName("Newcastle United");
        newcastle.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Newcastle_United_Logo.svg/800px-Newcastle_United_Logo.svg.png");
        teams.add(newcastle);

        Team norwich = new Team();
        norwich.setName("Norwich City");
        norwich.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/8/8c/Norwich_City.svg/1118px-Norwich_City.svg.png");
        teams.add(norwich);

        Team southhampton = new Team();
        southhampton.setName("Southhampton");
        southhampton.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/c/c9/FC_Southampton.svg/356px-FC_Southampton.svg.png");
        teams.add(southhampton);

        Team stoke = new Team();
        stoke.setName("Stoke City");
        stoke.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/2/29/Stoke_City_FC.svg/460px-Stoke_City_FC.svg.png");
        teams.add(stoke);

        Team sunderland = new Team();
        sunderland.setName("Sunderland AFC");
        sunderland.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/77/Logo_Sunderland.svg/300px-Logo_Sunderland.svg.png");
        teams.add(sunderland);

        Team swansea = new Team();
        swansea.setName("Swansea City");
        swansea.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/f/f9/Swansea_City_AFC_logo.svg/672px-Swansea_City_AFC_logo.svg.png");
        teams.add(swansea);

        Team spurs = new Team();
        spurs.setName("Tottenham Hotspur");
        spurs.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/b/b4/Tottenham_Hotspur.svg/321px-Tottenham_Hotspur.svg.png");
        teams.add(spurs);

        Team watford = new Team();
        watford.setName("Watford");
        watford.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/e2/Watford.svg/431px-Watford.svg.png");
        teams.add(watford);

        Team westBrom = new Team();
        westBrom.setName("West Bromwich Albion");
        westBrom.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/8/8b/West_Bromwich_Albion.svg/586px-West_Bromwich_Albion.svg.png");
        teams.add(westBrom);

        Team westHam = new Team();
        westHam.setName("West Ham United");
        westHam.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/e0/West_Ham_United_FC.svg/800px-West_Ham_United_FC.svg.png");
        teams.add(westHam);

        Team realMadrid = new Team();
        realMadrid.setName("Real Madrid");
        realMadrid.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/143px-Real_Madrid_CF.svg.png");
        teams.add(realMadrid);

        Team barcelona = new Team();
        barcelona.setName("Barcalona");
        barcelona.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/4/47/FC_Barcelona_%28crest%29.svg/142px-FC_Barcelona_%28crest%29.svg.png");
        teams.add(barcelona);

        Team burnley = new Team();
        burnley.setName("Burnley");
        burnley.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/0/02/Burnley_FC_badge.png");
        teams.add(burnley);

        Team qpr = new Team();
        qpr.setName("Queens Park Rangers");
        qpr.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/c/c4/Queensparkrangersfclogo.svg/512px-Queensparkrangersfclogo.svg.png");
        teams.add(qpr);

        Team hull = new Team();
        hull.setName("Hull City");
        hull.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/2/20/Hull_City_Crest_2014.svg/1295px-Hull_City_Crest_2014.svg.png");
        teams.add(hull);

        Team bayern = new Team();
        bayern.setName("Bayern Munich");
        bayern.setTeamLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Logo_FC_Bayern_M%C3%BCnchen.svg/768px-Logo_FC_Bayern_M%C3%BCnchen.svg.png");
        teams.add(bayern);

        Team dortmund = new Team();
        dortmund.setName("Borussia Dortmund");
        dortmund.setTeamLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Borussia_Dortmund_logo.svg/768px-Borussia_Dortmund_logo.svg.png");
        teams.add(dortmund);

        return teams;
    }

    public static List<Team> NBA_TEAMS() {
        List<Team> teams = new ArrayList<>();

        Team t1 = new Team();
        t1.setName("Boston Celtics");
        t1.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Boston_Celtics.svg/250px-Boston_Celtics.svg.png");
        teams.add(t1);
        Team t2 = new Team();
        t2.setName("Brooklyn Nets");
        t2.setTeamLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Brooklyn_Nets_newlogo.svg/250px-Brooklyn_Nets_newlogo.svg.png");
        teams.add(t2);
        Team t3 = new Team();
        t3.setName("New York Knicks");
        t3.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/d/d8/NewYorkKnicks.PNG");
        teams.add(t3);
        Team t4 = new Team();
        t4.setName("Philadelphia 76ers");
        t4.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/b/ba/Philadelphia_76ers_Logo.png");
        teams.add(t4);
        Team t5 = new Team();
        t5.setName("Toronto Raptors");
        t5.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/1/1e/Toronto_Raptors_logo_2015-16.png");
        teams.add(t5);
        Team t6 = new Team();
        t6.setName("Chicago Bulls");
        t6.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/6/67/Chicago_Bulls_logo.svg/204px-Chicago_Bulls_logo.svg.png");
        teams.add(t6);
        Team t7 = new Team();
        t7.setName("Cleveland Cavaliers");
        t7.setTeamLogo("");
        teams.add(t7);
        Team t8 = new Team();
        t8.setName("Detroit Pistons");
        t8.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/1/1e/Detroit_Pistons_logo.svg/300px-Detroit_Pistons_logo.svg.png");
        teams.add(t8);
        Team t9 = new Team();
        t9.setName("Indiana Pacers");
        t9.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/1/1b/Indiana_Pacers.svg/250px-Indiana_Pacers.svg.png");
        teams.add(t9);
        Team t10 = new Team();
        t10.setName("Milwaukee Bucks");
        t10.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/9/9a/Milwaukee_Bucks_logo15.png");
        teams.add(t10);
        Team t11 = new Team();
        t11.setName("Atlanta Hawks");
        t11.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/6/63/Atlanta_Hawks_2015_Primary_Logo.png");
        teams.add(t11);
        Team t12 = new Team();
        t12.setName("Charlotte Hornets");
        t12.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/9/9a/Charlotte-Hornets_new_logo.png");
        teams.add(t12);
        Team t13 = new Team();
        t13.setName("Miami Heat");
        t13.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/f/fb/Miami_Heat_logo.svg/149px-Miami_Heat_logo.svg.png");
        teams.add(t13);
        Team t14 = new Team();
        t14.setName("Orlando Magic");
        t14.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/8/85/Orlando_magic_logo.png");
        teams.add(t14);
        Team t15 = new Team();
        t15.setName("Washington Wizards");
        t15.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/8/82/Wizards_clipped_rev_1.png");
        teams.add(t15);
        Team t16 = new Team();
        t16.setName("Denver Nuggets");
        t16.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/76/Denver_Nuggets.svg/250px-Denver_Nuggets.svg.png");
        teams.add(t16);
        Team t17 = new Team();
        t17.setName("Minnesota Timberwolves");
        t17.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/78/Minnesota_Timberwolves.svg/250px-Minnesota_Timberwolves.svg.png");
        teams.add(t17);
        Team t18 = new Team();
        t18.setName("Oklahoma City Thunder");
        t18.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/5d/Oklahoma_City_Thunder.svg/250px-Oklahoma_City_Thunder.svg.png");
        teams.add(t18);
        Team t19 = new Team();
        t19.setName("Portland Trail Blazers");
        t19.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/74/Portland_Trail_Blazers.svg/205px-Portland_Trail_Blazers.svg.png");
        teams.add(t19);
        Team t20 = new Team();
        t20.setName("Utah Jazz");
        t20.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/53/Utah_Jazz_logo%2C_%282010_%27new_look%27%29.svg/250px-Utah_Jazz_logo%2C_%282010_%27new_look%27%29.svg.png");
        teams.add(t20);
        Team t21 = new Team();
        t21.setName("Golden State Warriors");
        t21.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/01/Golden_State_Warriors_logo.svg/361px-Golden_State_Warriors_logo.svg.png");
        teams.add(t21);
        Team t22 = new Team();
        t22.setName("Los Angeles Clippers");
        t22.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/2/2c/Los_Angeles_Clippers_logo.png");
        teams.add(t22);
        Team t23 = new Team();
        t23.setName("Los Angeles Lakers");
        t23.setTeamLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/LosAngeles_Lakers_logo.svg/360px-LosAngeles_Lakers_logo.svg.png");
        teams.add(t23);
        Team t24 = new Team();
        t24.setName("Phoenix Suns");
        t24.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/e/e7/Phoenix_Suns_2013_LOGO.png");
        teams.add(t24);
        Team t25 = new Team();
        t25.setName("Sacramento Kings");
        t25.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/6/60/Sacramento_Kings.svg/203px-Sacramento_Kings.svg.png");
        teams.add(t25);
        Team t26 = new Team();
        t26.setName("Dallas Mavericks");
        t26.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/9/97/Dallas_Mavericks_logo.svg/243px-Dallas_Mavericks_logo.svg.png");
        teams.add(t26);
        Team t27 = new Team();
        t27.setName("Houston Rockets");
        t27.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/2/28/Houston_Rockets.svg/410px-Houston_Rockets.svg.png");
        teams.add(t27);
        Team t28 = new Team();
        t28.setName("Memphis Grizzlies");
        t28.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/f/f1/Memphis_Grizzlies.svg/203px-Memphis_Grizzlies.svg.png");
        teams.add(t28);
        Team t29 = new Team();
        t29.setName("New Orleans Pelicans");
        t29.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/2/21/New_Orleans_Pelicans.png");
        teams.add(t29);
        Team t30 = new Team();
        t30.setName("San Antonio Spurs");
        t30.setTeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/a/a2/San_Antonio_Spurs.svg/250px-San_Antonio_Spurs.svg.png");
        teams.add(t30);
        return teams;
    }

    public static List<Team> MADDEN_TEAMS() {
        List<Team> teams = new ArrayList<>();

        return teams;
    }
}
