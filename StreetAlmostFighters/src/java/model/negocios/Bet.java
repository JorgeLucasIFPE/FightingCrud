package model.negocios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Bet {
    private int id;
    private double amount;
    private boolean fighter;

    private User better;
    private Fight fight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isFighter() {
        return fighter;
    }

    public void setFighter(boolean fighter) {
        this.fighter = fighter;
    }

    public User getBetter() {
        return better;
    }

    public void setBetter(User better) {
        this.better = better;
    }

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }

}
