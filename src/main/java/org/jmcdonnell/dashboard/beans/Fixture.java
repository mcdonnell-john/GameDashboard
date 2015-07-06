/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author john
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Fixture.findAll", query = "SELECT f FROM Fixture f"),
    @NamedQuery(name = "Fixture.findById", query = "SELECT f FROM Fixture f WHERE f.id = :id")
})
public class Fixture implements Serializable, Resource {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Boolean isPlayed;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="HOME_PLAYER_ID")
    private Person homePlayer;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="HOME_TEAM_ID")
    private Team homeTeam;
    private Integer homeScore;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="AWAY_PLAYER_ID")
    private Person awayPlayer;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="AWAY_TEAM_ID")
    private Team awayTeam;
    private Integer awayScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fixture)) {
            return false;
        }
        Fixture other = (Fixture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jmcdonnell.dashboard.beans.Fixture[ id=" + id + " ]";
    }

    public Boolean getIsPlayed() {
        return isPlayed;
    }

    public void setIsPlayed(Boolean isPlayed) {
        this.isPlayed = isPlayed;
    }

    public Person getHomePlayer() {
        return homePlayer;
    }

    public void setHomePlayer(Person homePlayer) {
        this.homePlayer = homePlayer;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Person getAwayPlayer() {
        return awayPlayer;
    }

    public void setAwayPlayer(Person awayPlayer) {
        this.awayPlayer = awayPlayer;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }
    
}
