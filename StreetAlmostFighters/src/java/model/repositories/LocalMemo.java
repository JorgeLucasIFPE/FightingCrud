/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repositories;

import java.util.ArrayList;
import java.util.List;
import model.negocios.Place;

/**
 *
 * @author ALUNO
 */
public class LocalMemo {
 
    private static LocalMemo myself = null;
    
    private List<Place> places = null;
    private static int lastId = 1;
    
    private LocalMemo() {
        this.places = new ArrayList<>();
    }
            
    public static LocalMemo getCurrentInstance() {
        if(myself == null)
            myself = new LocalMemo();
        
        return myself;
    }

    public void insert(Place l) {
        l.setId(lastId++);
        this.places.add(l);
    }

    public void change (Place l) {
       for(Place lAux : this.places) {
        if(lAux.getId() == l.getId()) {
            lAux.setNickname(l.getNickname());
            lAux.setCapacity(l.getCapacity());
            lAux.setAddress(l.getAddress());
            return;
            }
        }
    }
    
    public Place read(int id) {
        for(Place lAux : this.places) {
            if(lAux.getId() == id) {
                return lAux;
            }
        }
        return null;
    }
    
    public void delete(int id) {
        Place l = null;
        for(Place lAux : this.places){
            if(lAux.getId() == id) {
                l = lAux;
                break;
            }
        }
        this.places.remove(l);
    }
    
    public List<Place> readAll() {
        return this.places;
    }
    
}
