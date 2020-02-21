import java.util.Random;
import java.util.Scanner;

public class codiPPT {
    //variables globals que necessitarem per poder correr el programa.
    public static int idioma;
    public static int contador=1;
    public static int tiradaUser=0;
    public static int tiradaMaquina=0;
    public static int verificador=0;
    public static int guanyadorMaquina=0;
    public static int guanyadorUser=0;
    public static int nronda=0;
    public static String quiguanya="ningu";
    public static boolean guanyador=false;
    public static void main(String[] args) {
        seleccionaridioma(); //Métode per seleccionar idioma.
        instrucciones(); //Métode per dictar les instruccions.
        while(guanyador==false || nronda<3 ) {//Bucle per poder fer el nombre de rondes necessaries
        switch(idioma){//Un switch per a cada idioma
        case 1://1 Catala
            nronda++;//Aquí anam sumant el nombre de rondes
            System.out.println("Eligeix opció:\n1.Pedra\n2.Paper\n3.Tissora\nOpció: ");
            tiradausuari();//Métode per elegir la opció del usuari.
            switch(tiradaUser){//Un switch per sabre la opció elegida del usuari
            case 1:
            System.out.println("Usuari:Pedra");
            break;    
            case 2:
            System.out.println("Usuari:Paper");
            break; 
             case 3:
            System.out.println("Usuari:Tissora");
            break; 
            }
            tiradamaquina();//Métode per elegir la opció de la màquina.
            switch(tiradaMaquina){//Un switch per sabre la opció de la màquina.
            case 1:
            System.out.println("Màquina:Pedra");
            break;    
            case 2:
            System.out.println("Màquina:Paper");
            break; 
            case 3:
            System.out.println("Màquina:Tissora");
            break; 
            }
            guanyadorronda();//Métode per sabre qui guanya a cada ronda.
                        System.out.println("Punts Usuari: "+guanyadorUser);
                        System.out.println("Punts Màquina: "+guanyadorMaquina);
            guanyadorpartida();//Métode per sabre si hi ha un guanyador i si és la màquina o l'usuari.
            break;
        
        case 2://El mateix que el case 1, però en castellà.
            nronda++;
            System.out.println("Elige opción:\n1.Piedra\n2.Papel\n3.Tijera\nOpción: ");
            tiradausuari();
            switch(tiradaUser){
            case 1:
            System.out.println("Usuario:Piedra");
            break;    
            case 2:
            System.out.println("Usuario:Papel");
            break; 
             case 3:
            System.out.println("Usuario:Tijera");
            break; 
            }
            tiradamaquina();
            switch(tiradaMaquina){
            case 1:
            System.out.println("Máquina:Piedra");
            break;    
            case 2:
            System.out.println("Máquina:Papel");
            break; 
            case 3:
            System.out.println("Máquina:Tijera");
            break; 
            }
            guanyadorronda();
                        System.out.println("Puntos Usuario: "+guanyadorUser);
                        System.out.println("Puntos Máquina: "+guanyadorMaquina);
            guanyadorpartida();
            break;
           
        case 3://El mateix però en anglès.
            nronda++;
            System.out.println("Choose an option:\n1.Rock\n2.Paper\n3.Scissors\nOption: ");
            tiradausuari();
            switch(tiradaUser){
            case 1:
            System.out.println("User:Rock");
            break;    
            case 2:
            System.out.println("User:Paper");
            break; 
             case 3:
            System.out.println("User:Scissors");
            break; 
            }
            tiradamaquina();
            switch(tiradaMaquina){
            case 1:
            System.out.println("Machine:Rock");
            break;    
            case 2:
            System.out.println("Machine:Paper");
            break; 
            case 3:
            System.out.println("Machine:Scissors:");
            break; 
            }
            guanyadorronda();
                        System.out.println("User points: "+guanyadorUser);
                        System.out.println("Machine points: "+guanyadorMaquina);
            guanyadorpartida();
            break;

        }
    
    }
            msguanyador();//Métode per mostrar un missatge de guanyador. 
    }
    
    

public static void seleccionaridioma() {
        //Mostram un missatge per que l'usuari pugui saber que tecletjar.
        System.out.println("Pedra Paper Tissora");
        System.out.println("Tria un idioma/Select language/Elige un idioma:\n1.Català.\n2.Castellano.\n3.English.");
        System.out.println("Opció/Opción/Option: ");
        while(verificador==0){//utilitzam un bucle per fer un control d'errors, només poden ficar 1, 2 o 3.
        Scanner teclat = new Scanner(System.in);
        idioma = teclat.nextInt();
            if (idioma == 1 || idioma == 2 || idioma == 3){
                verificador=1;
            }
            else{
                System.out.println("Error, fica 1, 2 o 3.");
                System.out.println("Opció/Opción/Option: ");
            }
        }
        verificador=0;//per poder entrar als bucles que tenen verificador com a condició
    }
    public static void guanyadorronda() { //Aquest bloc de codi agafa el nombre de 1 al 3 introduit per l'usuari.       
    switch(tiradaUser) {//I el compara amb el resultat aleatori, que es el resultat de la màquina. 
            case 1: {//Si l'usuari introdueix 1
                if(tiradaMaquina==2) {//Si la màquina introdueix un 2, la màquina guanya.
                    guanyadorMaquina++;
                }else if(tiradaMaquina==3){//Si la màquina introdueix un 3, l'usuari guanya.
                    guanyadorUser++;
                }
                break;
            }
            case 2: {//Si l'usuari introdueix un 2.
                if(tiradaMaquina==1) {//Si la màquina introdueix un 1, l'usuari guanya.
                    guanyadorUser++;
                }else if(tiradaMaquina==3){//Si la màquina introdueix un 3, la màquina guanya.
                    guanyadorMaquina++;
                }
                break;
            }
            case 3: {//Si l'usuari introdueix un 3
                if(tiradaMaquina==1) {//Si la màquina introdueix un 1, la màquina guanya.
                    guanyadorMaquina++;                    
                }else if(tiradaMaquina==2) {//Si la màquina introdueix un 2, l'usuari guanya.
                    guanyadorUser++;
                }
                break;
            }
        }
        
          
    }


    public static void instrucciones() //Aquest bloc de codi tries l'idioma de les instruccions
    {
        switch (idioma) { //Idioma instruccions català
        case 1: {
            System.out.println("Juga a el millor de tres triant pedra, paper o tisores. Si no aconsegueixes guanyar a la màquina et convertiràs en un LOSER");
            break;
        }
        case 2: { //Idioma instruccions castellà
            System.out.println("Juega al mejor de tres eligiendo piedra, papel o tijeras. Si no consigues ganar a la máquina te convertirás en un LOSER");
            break;
        }
        case 3: { //Idioma instruccions anglès
            System.out.println("Play the best of three by choosing rock, paper or scissors. If you can't win the machine you will become a LOSER");
            break;
        }
      
    

    }
    }
    public static void tiradamaquina() { //Aquest bloc de codi el que fa és elegir la tirada de la màquina aleatoriament.
        Random rand = new Random();
        tiradaMaquina = rand.nextInt(3) + 1;
    }

    public static void tiradausuari(){
        while(verificador==0){//Un bucle per fer un control d'errors, no ens poden ficar una altra cosa que no sigui 1,2 o 3.
        Scanner teclat = new Scanner(System.in);
        tiradaUser = teclat.nextInt();
            if (tiradaUser == 1 || tiradaUser == 2 || tiradaUser == 3){
                verificador=1;
            }
            else{
                System.out.println("Error, fica 1, 2 o 3.");
                System.out.println("Opció/Opción/Option: ");
            }
        }
        verificador=0;//Tornam a possar el verificador a 0.
    }


public static void guanyadorpartida(){
    //Amb aquest if, veim si hi ha un guanyador, és a dir quan hi ha diferència de punts.
    if(guanyadorMaquina!=guanyadorUser){
        guanyador=true;
    }
    else{
        guanyador=false;
    }
    //Amb aquest if, sabem gràcies a un string, qui dels dos és el guanyador.
    if(guanyadorMaquina<guanyadorUser){
       quiguanya="U";
    }
    if(guanyadorUser<guanyadorMaquina){
        quiguanya="M";
    }

}
public static void msguanyador(){
    //aquest switch es per seleccionar l'idioma en que surt el missatge.
    switch(idioma){
        case 1:
         //Dins cada case, segons el valor de l'string, podem saber qui ha guanyat.
        if(quiguanya=="U"){
        System.out.println("Usuari guanya");    
        }
        if(quiguanya=="M"){
        System.out.println("Màquina guanya");    
        }
        break;
        case 2:
        if(quiguanya=="U"){
        System.out.println("Usuario gana");    
        }
        if(quiguanya=="M"){
        System.out.println("Maquina gana");    
        }
        break;
            case 3:
        if(quiguanya=="U"){
        System.out.println("User wins");    
        }
        if(quiguanya=="M"){
        System.out.println("Machine wins"); 
        break;
}
}
}
}