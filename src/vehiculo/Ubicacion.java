/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

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
    int cCant1=0,mCant1=0,cCant2=0,mCant2=0,cCant3=0,mCant3=0;
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
            n_lugar = (int) ((Math.random()*40)+1);
            switch (piso) {
            case 0:
                cCant1++;
                break;
            case 1:
                cCant2++;
                break;
            case 2:
                cCant3++;
                break;
            default:
                break;
            }
        }
        else if(ind == 2){
            n_lugar = (int) ((Math.random()*(50-41+1)+40));
            switch (piso) {
            case 0:
                mCant1++;
                break;
            case 1:
                mCant2++;
                break;
            case 2:
                mCant3++;
                break;
            default:
                break;
            }
        }
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
    
    public void set_cCant1(int cC1_){
        cCant1 = cC1_;
    }
    
    public int get_cCant1(){
        return cCant1;
    }
    
    public void set_cCant2(int cC2_){
        cCant2 = cC2_;
    }
    
    public int get_cCant2(){
        return cCant2;
    }
    
    public void set_cCant3(int cC3_){
        cCant1 = cC3_;
    }
    
    public int get_cCant3(){
        return cCant3;
    }
    
    public void set_mCant1(int mC1_){
        mCant1 = mC1_;
    }
    
    public int get_mCant1(){
        return mCant1;
    }
    
    public void set_mCant2(int mC2_){
        mCant2 = mC2_;
    }
    
    public int get_mCant2(){
        return mCant2;
    }
    
    public void set_mCant3(int mC3_){
        mCant1 = mC3_;
    }
    
    public int get_mCant3(){
        return mCant3;
    }
   
}
