/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocios;

import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class Fighter {
    private int id;
    private String name;
    private String nickname;
    private String password;
    private double weight;
    private double height;
    private Date birth;
    private boolean deft;
    private String course;
    private String marcialArt;
    private String emergencyContact;
    

    public Fighter(int id, String name, String nickname, String password, double weight, double height, Date birth, boolean deft, String course, String marcialArt, String emergencyContact) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.birth = birth;
        this.deft = deft;
        this.course = course;
        this.marcialArt = marcialArt;
        this.emergencyContact = emergencyContact;
    }
    
    public Fighter() {}
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public boolean isDeft() {
        return deft;
    }

    public void setDeft(boolean deft) {
        this.deft = deft;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMarcialArt() {
        return marcialArt;
    }

    public void setMarcialArt(String marcialArt) {
        this.marcialArt = marcialArt;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

  
    
}
