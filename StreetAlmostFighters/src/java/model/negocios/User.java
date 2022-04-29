package model.negocios;


import java.util.ArrayList;
import java.util.List;

public class User{
    private int id;
    private String name;
    private String nickname;
    private String password;
    private String pix;
    private double saldo;
    
    private List<Bet> bet;
    
    
   public User() {
       this.bet = new ArrayList<>();
   }

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

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Bet> getBet() {
        return bet;
    }

    public void setBet(List<Bet> bet) {
        this.bet = bet;
    }
    
    
       public void addBet(Bet a) {
           this.bet.add(a);
       }
    
}