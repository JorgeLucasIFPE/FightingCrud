/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Fight {
    private int id;
    private Date dateHour;
    private int result;
    
    private Fighter fighterA;
    private Fighter fighterB;
    private Place location;
    
    private List<Bet> bets;
    
    public Fight() {
        this.bets = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateHour() {
        return dateHour;
    }

    public void setDateHour(Date dateHour) {
        this.dateHour = dateHour;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Fighter getFighterA() {
        return fighterA;
    }

    public void setFighterA(Fighter fighterA) {
        this.fighterA = fighterA;
    }

    public Fighter getFighterB() {
        return fighterB;
    }

    public void setFighterB(Fighter fighterB) {
        this.fighterB = fighterB;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    
}
