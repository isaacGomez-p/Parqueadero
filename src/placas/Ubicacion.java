/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placas;

import java.util.ArrayList;

/**
 *
 * @author ISAACELEAZAR
 */
public final class Ubicacion {
    ArrayList<String> lugares = new ArrayList();
    char let[]=new char[] {'A','B','C'};
    char a;
    int n_lugar_, ind, cant1=0, cant2=0, cant3=0;
    String pos, piso_ = new String();
    
        
    public void genera_lugar(int ind_){
        int piso,n_lugar=0;
        ind = ind_;
        piso = (int) ((Math.random()*3));
        switch (piso) {
            case 0:
                cant1++;
                break;
            case 1:
                cant2++;
                break;
            case 2:
                cant3++;
                break;
            default:
                break;
        }
        a = let[piso];
        if(ind == 1){
            n_lugar = (int) ((Math.random()*80)+1);}
        else if(ind == 2){
            n_lugar = (int) ((Math.random()*(100-81+1)+80));}
        System.out.println("lugar: "+n_lugar+"\nPiso"+piso);
        pos = Character.toString(a)+Integer.toString(n_lugar);
        System.out.println("Posicion : "+pos);
        if(lugares.isEmpty()==true){
            lugares.add(pos);
            this.set_posicion(pos);
        }
        else if( lugares.isEmpty()==false && lugares.contains(pos)==false){
            lugares.add(pos);
            this.set_posicion(pos);
        }
        else if(lugares.contains(pos)==true){
            System.out.println("Repetida"+n_lugar+"\n Pos"+pos);
            genera_lugar(ind);
        } else {
        }
        System.out.println("LISTA \nLugar: "+lugares);
     }
    
       
    
    public void set_posicion(String p__){
        piso_ = p__;
    }
    
    public String get_posicion(){
        return piso_;
    }
    
    public void set_cant1(int c1_){
        cant1 = c1_;
    }
    
    public int get_cant1(){
        return cant1;
    }
    
    public void set_cant2(int c2_){
        cant2 = c2_;
    }
    
    public int get_cant2(){
        return cant2;
    }
    
    public void set_cant3(int c3_){
        cant1 = c3_;
    }
    
    public int get_cant3(){
        return cant3;
    }
    
   
}
