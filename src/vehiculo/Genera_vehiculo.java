/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ISAACELEAZAR
 */
public final class Genera_vehiculo {
ArrayList<String> placas_dia = new ArrayList();    
String lett,lett1,lett2,lett3 = new String();
String lett_m,lett1_m,lett2_m,lett3_m = new String();
String hora_1,fecha_1;
int CARROS = 0;
int MOTOS = 0;
int num[]= new int[] {0,1,2,3,4,5,6,7,8,9};
int numo,numo1,numo2,numo3,numo4,numo5,mnumo,mnumo1,mnumo2,mnumo3,mnumo4,mnumo5;
char numoo1,numoo2,numoo3,numoo ;
char let[]=new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
char let_e[] = new char[3];
char let_m[] = new char[3];
char ulet_m;
static int CANT_MUNI=1;
String[] pri_le = new String[6];
String[] pri_lem = new String[6];
int numbers;
Integer[] al = new Integer[3];
Integer[] al_m = new Integer [3];

public Genera_vehiculo(){
    this.genera_hora();
}
public void genera_hora(){
    String ho = null;
    LocalDateTime ahora = LocalDateTime.now();
    int hora = ahora.getHour();
    int seg = ahora.getSecond();
    int min = ahora.getMinute();
    if(hora<10&&min>10&&seg>10){
        ho = "0"+hora+":"+min+":"+seg;
        System.out.println("la hora es: "+ho);
    }
    else if(hora>10&&min<10&&seg>10){
        ho = hora+":0"+min+":"+seg;
        System.out.println("la hora es: "+ho);
    }
    else if(hora>10&&min>10&&seg<10){
        ho = hora+":"+min+":0"+seg;
        System.out.println("la hora es: "+ho);
    }
    else if(hora<10&&min<10&&seg>10){
        ho = "0"+hora+":0"+min+":"+seg;
        System.out.println("la hora es: "+ho);
    }
    else if(hora<10&&min>10&&seg<10){
        ho = "0"+hora+":"+min+":0"+seg;
        System.out.println("la hora es: "+ho);        
    }
    else if(hora>10&&min<10&&seg<10){
        ho = hora+":0"+min+":0"+seg;
        System.out.println("la hora es: "+ho);
    }
    else{
        ho = hora+":"+min+":"+seg;
        System.out.println("la hora es todos mayor a 10: "+ho);
    }
    
    
    int year = ahora.getYear();
    Month mes = ahora.getMonth();
    String mes_ = mes.toString();
    int dia = ahora.getDayOfMonth();
    System.out.println("La fecha es: "+dia+"de :"+mes+"del mes_ : "+mes_+"del año"+year);
    String fecha = Integer.toString(dia)+"/"+ahora.getMonthValue()+"/"+Integer.toString(year);
    
    System.out.println("FECHA: "+fecha);
    
    set_hora(ho);
    set_fecha(fecha);
    
}
public void genera_placa(){
    	int al_c,tm;

//for(tm=1;tm<=CANT_MUNI;tm++){

    //for(cm=0;cm<3;cm++){
		System.out.println("\n\n");
	for(al_c=0;al_c<3;al_c++){
	    if(al_c==0){
                al[al_c]=(int)((Math.random()*9)+1);}
            else{
                al[al_c]=(int)(Math.random()*9);
            }   
            tm = (int) (Math.random()*26);
            pri_le[al_c]= Integer.toString(let[tm]);
            let_e[al_c]=let[tm];
}
        //System.out.println("Numero 1: "+al[0]+"Numero 2: "+al[1]+"Numero 3: "+al[2]);
        numbers = (al[2]*1)+(al[1]*10)+(al[0]*100);
        //System.out.println("numbers"+numbers);
        //System.out.println("Letra 1: "+pri_le[0]+let_e[0]+" Letra 2: "+pri_le[1]+let_e[1]+" Letra 3: "+pri_le[2]+let_e[2]);
        lett1 = (Character.toString(let_e[0])+(Character.toString(let_e[1]))+(Character.toString(let_e[2])));
        //System.out.println("\t \t lett1: "+lett1);
        lett2 = (lett1+ Integer.toString(numbers));
        //System.out.println("lett 2: "+lett2);
        if(placas_dia.isEmpty() == true){
            //System.out.println("Solo una vez please");
            placas_dia.add(lett2);
            CARROS = 1;
        }
        else if(placas_dia.isEmpty()==false && placas_dia.contains(lett2)==false){
            //System.out.println("mas de una creo");
            placas_dia.add(lett2);
            CARROS ++;
        }
        else{
            //System.out.println("Repetida. ");
            this.genera_placa();
        }
  //}
}

public void genera_placa_moto(){
    int i,j,tm;
    for(i=0;i<3;i++){
        if(i==0){
        al_m[i]= (int) ((Math.random()*9)+1);
        }
        else if(i>0){
            al_m[i] = (int) (Math.random()*9);
        }
    //System.out.println("\t Numero : "+al_m[i]);
    }
    for(i=0;i<4;i++){
        tm = (int) (Math.random()*26);
        if(i<3){
            let_m[i] = let[tm];
        }
        else if(i==3){
            ulet_m = let[tm];
        }
    }
    //System.out.println("Letras moto: "+let_m[0]+"--"+let_m[1]+"--"+let_m[2]+"\t\t"+ulet_m);
    numo = (al_m[1]*1)+(al_m[0]*10);
    //System.out.println("NUMO : "+numo);
    lett1_m = Integer.toString(numo);
    //System.out.println("String de numeros : "+lett1_m);
    lett2_m = (Character.toString(let_m[0]))+(Character.toString(let_m[1]))+(Character.toString(let_m[2]))+lett1_m+(Character.toString(ulet_m));
    //System.out.println("PLACA MOTO : " + lett2_m);
    lett2 = lett2_m;
    if(placas_dia.isEmpty() == true){
            //System.out.println("Solo una vez please");
            placas_dia.add(lett2);
            MOTOS = 1;
        }
        else if(placas_dia.isEmpty()==false && placas_dia.contains(lett2)==false){
            //System.out.println("mas de una creo");
            placas_dia.add(lett2);
            MOTOS ++;            
        }
        else{
            //System.out.println("Repetida. ");
            this.genera_placa_moto();
        }
}

public String pasa_placa(){
    System.out.println("Esto paso: "+lett2);
    System.out.println("Lista :   "+placas_dia);
    return lett2;
    }

public int cantidad_carros(){
    System.out.println("Cantidad de carros : " + CARROS);
    return CARROS;
}

public int cantidad_motos(){
    System.out.println("Cantidad de motos: "+ MOTOS);
    return MOTOS;
}

public void set_fecha(String fecha_){
    fecha_1 = fecha_;
    
}
public String get_fecha(){
    return fecha_1;
}

public void set_hora(String hora_){
    hora_1 = hora_;
    
}
public String get_hora(){
    return hora_1;
}
}

