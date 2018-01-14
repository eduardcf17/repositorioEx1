import java.io.*;

public class juego {
	
	public static void main (String args[]) throws IOException,InterruptedException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
//DECLARACIONES
int vida;
vida=3;
int vidaEnemigos;
int vidaDragon;
vidaDragon=4;
int vidaBoss;
vidaBoss=10;
vidaEnemigos=3;
String personaje;		
String accion;		
String cogerObjeto;
int objeto;
objeto=0;
int primeraDerrota;
primeraDerrota=0;
int primeraDerrotaDragon;
primeraDerrotaDragon=0;

//TEXTO DE INICIO
System.out.println("UN MAL SE ESTA ERIGIENDO");
Thread.sleep(1000);
System.out.println("TU HAS SIDO ELEGIDO PARA DERROTARLO");
Thread.sleep(1000);
System.out.println("COMO INVOCADOR ELIGE A UN SER Y PREPARATE PARA LA CONTIENDA");
Thread.sleep(1000);
System.out.println("SOLO TIENES UNA OPORTUNIDAD ASÍ QUE ELIGE BIEN");
Thread.sleep(1000);


//TABLA CON INFO PARA ELEGIR
System.out.println("BIENVENIDO SELECCIONE EL PERSONAJE QUE VA A INVOCAR PARA LA CONTIENDA");							
System.out.println("    _______________________________________________");
System.out.println("    ||      TIPO     ||  VIDA   ||    INFORMACIÓN  ||  ");
System.out.println("    _______________________________________________");
System.out.println("    || MAGO          ||   4     ||TECLA 1          ||");
System.out.println("    || GUITARRISTA   ||   3     ||TECLA 2          || ");                                                     
System.out.println("    || HOMER         ||   3     ||TECLA 3          ||  ");                                        
System.out.println("    || SAYAN         ||   4     ||TECLA 4          ||  ");                                        
System.out.println("    || SONIC         ||         ||TECLA 5          ||  ");                                                                              
System.out.println("    -----------------------------------------------	"	);

//SELECION DE PERSONAJE O INFORMACIÓN
System.out.println(" INTRODUZE EL NOMBRE DEL PERSONAJE PARA SELECIONAR O PULSA LA TECLA DE INFORMACIÓN");
personaje = reader.readLine();
while(!(personaje.equalsIgnoreCase("mago") || personaje.equalsIgnoreCase("guitarrista")|| personaje.equalsIgnoreCase("homer") || personaje.equalsIgnoreCase("sayan") || personaje.equalsIgnoreCase("sonic") )){
	System.out.println("Personaje no reconocido,vuelva a introducirlo");
	personaje = reader.readLine();
	}
//EN CASO DE PEDIR INFORMACIO
if(personaje.equals("1")){
	System.out.println("El mago es muy util contra jefes finales dado su ataque especial");
	System.out.println("INTRODUZE PERSONAJE");
	personaje=reader.readLine();
	}
if(personaje.equals("2")){
	System.out.println("El guitarrista es una gran opcion para enfrentarse a los elfos,huiran despavoridos del sonido de tu guitarra con tu ataque especial");
	System.out.println("INTRODUZE PERSONAJE");
	personaje=reader.readLine();
	}
if(personaje.equals("3")){
	System.out.println("El ataque especial de homer (lanzar rosquillas) puede recuperarles puntos de salud");
	System.out.println("INTRODUZE PERSONAJE");
	personaje=reader.readLine();
	}
if(personaje.equals("4")){
	System.out.println("El sayan es muy bueno contra dragones, con su ataque especial puede lanzar una bola de energia que los puede atravesar");
	System.out.println("INTRODUZE PERSONAJE");
	personaje=reader.readLine();
	}
if(personaje.equals("5")){
	System.out.println("Personaje muy rapido,los ataques normales se realizan 2 veces");
	System.out.println("INTRODUZE PERSONAJE");
	personaje=reader.readLine();
	}
//AJUSTE VIDA PERSONAJES
if(personaje.equals("mago") || personaje.equals("MAGO")){
	vida=vida+1;
	}
if(personaje.equals("guitarrista") || personaje.equals("GUITARRISTA")){
	vida=vida+0;
	}
if(personaje.equals("homer") || personaje.equals("HOMER")){
	vida=vida+0;
	}
if(personaje.equals("sayan") || personaje.equals("SAYAN")){
	vida=vida+1;
	}




//APARICION PERSONAJES


if(personaje.equals("homer") || personaje.equals("HOMER")){
System.out.println("UN HOMER SALVAJE A PARECIDO");
Thread.sleep(1000);
System.out.println("▓▓▓ ");											 
System.out.println("▒▒▒▓▓ ");
System.out.println("▒▒▒▒▒▓"); 
System.out.println("▒▒▒▒▒▒▓ ");
System.out.println("▒▒▒▒▒▒▓ ");
System.out.println("▒▒▒▒▒▒▒▓ ");
System.out.println("▒▒▒▒▒▒▒▓▓▓ ");
System.out.println("▒▓▓▓▓▓▓░░░▓ ");
System.out.println("▒▓░░░░▓░░░░▓ ");
System.out.println("▓░░░░░░▓░▓░▓ ");
System.out.println("▓░░░░░░▓░░░▓ ");
System.out.println("▓░░▓░░░▓▓▓▓ ");
System.out.println("▒▓░░░░▓▒▒▒▒▓ ");
System.out.println("▒▒▓▓▓▓▒▒▒▒▒▓ ");
System.out.println("▒▒▒▒▒▒▒▒▓▓▓▓ ");
System.out.println("▒▒▒▒▒▓▓▓▒▒▒▒▓ ");
System.out.println("▒▒▒▒▓▒▒▒▒▒▒▒▒▓ ");
System.out.println("▒▒▒▓▒▒▒▒▒▒▒▒▒▓ ");
System.out.println("▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓ ");
System.out.println("▒▓▒▓▒▒▒▒▒▒▒▒▒▓ ");
System.out.println("▒▓▒▓▓▓▓▓▓▓▓▓▓ ");
System.out.println("▒▓▒▒▒▒▒▒▒▓ ");
System.out.println("▒▒▓▒▒▒▒▒▓ ");
}
Thread.sleep(1000);
if(personaje.equals("mago") || personaje.equals("MAGO")){
System.out.println("MAGO ESTA LISTO PARA LA BATALLA");
}
if(personaje.equals("guitarrista") || personaje.equals("GUITARRISTA")){
System.out.println("Guitarrista listo para dar Rock and Roll");
Thread.sleep(1000);
System.out.println("______________$$$$$$$$$");
System.out.println("_____________$$$$$$$$$$$_________________________________,,");
System.out.println("_____________$$$$$$$$$$$$______________________________$$$$$,");
System.out.println("_____________`$$$$$$$$$$$____________________________$$$$$$$");
System.out.println("______________`$$$$$$$$$Z$______$$$_______$$$_______$$$$$$$$");
System.out.println("_______________`$ZzZ$$$Z$$$___$$$$$$$___$$$$$$$____$$$$$$$$`");
System.out.println("________________`$$$ZZZ$$$$$_$$$$$$$$$_$$$$$$$$$__$$$$$$$$`");
System.out.println("_________________`$$$$$$$$$$_$$ZZ$$$$$_$$ZZZ$$$$_$$$$$$$$");
System.out.println("____u$$$$$$u______`$$$$$$$$$$_$$$ZZZ$$_$$$$$ZZ$$_$$$$$$$`");
System.out.println("__$$$$$$$$$$Z$_____`$ZZ$$$ZZZ_$$$$$$$$_$$$$$$$$$_$$$$$$");
System.out.println("_$$$$$$$$$$$Z$$$$__$$$$zzz$$$_$$$$$$$$_$$$$$$$$$_$$$$$$`");
System.out.println("_$$$$$$$$$$Z$$$$$$$$$$$$$$$$$_$$ZZ$$$$_$ZZZ$$$$$_$$$$$`");
System.out.println("___`$$$$$$$Z$$$$$$$$$$$$$$$$$_$$$$$ZZ$_$_$$$$$$$_$$$$$`");
System.out.println("________`$Z$$$$$$$$$$$$$$$$$$_$SB$$$__$$_$$$$$$_$$$$`");
System.out.println("__________`$$$$$$$$$$$$$$$$$$$,````,$$$$,_````,$$$$$$$`");
System.out.println("___________`$$$$$$$$$$$$$$$$$$$$$$_$$$$$$$$$$$$$$$`");
System.out.println("_____________`$$$$$$$$$$$$$$$$$$$$$_$$$$$$$$$$$$$`");
System.out.println("_______________`$$$$$$$$$$$$$$$$$$$_$$$$$$$$$$$$`");
System.out.println("__________________`$$$$$$$$$$$$$$$$_$$$$$$$$$$`");
System.out.println("___________________`$$$$$$$$$$$$$$$$_$$$$$$$`");
System.out.println("_____________________$$$$$$$$$$$$$$$$$$$$$$");
}
if(personaje.equals("sayan") || personaje.equals("SAYAN")){
System.out.println("Sayan cargo su ki al maxio para el combate");
Thread.sleep(1000);
System.out.println("____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$______");
System.out.println("____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$________");
System.out.println("____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_________");
System.out.println("____$$$$$$$$$$_________$$$$$$$$$$$$___________");
System.out.println("____$$$$$$$$$_________$$$$$$$$$$$_____________");
System.out.println("____$$$$$$$$________$$$$$$$$$$$_________$_____");
System.out.println("____$$$$$$$________$$$$$$$$$$$_________$$_____");
System.out.println("____$$$$$$____$$$$$$$$$$$$$$__________$$$_____");
System.out.println("____$$$$$______$$$$$$$$$$$$__________$$$$_____");
System.out.println("____$$$$_______$$$$$$$$$$$$_________$$$$$_____");
System.out.println("____$$$______$$$$$$$$$$$$$$$_______$$$$$$_____");
System.out.println("____$$______$$$$$$$$$$$___________$$$$$$$_____");
System.out.println("____$______$$$$$$$$$$$___________$$$$$$$$_____");
System.out.println("__________$$$$$$$$$$$___________$$$$$$$$$_____");
System.out.println("________$$$$$$$$$$$____________$$$$$$$$$$_____");
System.out.println("_______$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_____");
System.out.println("______$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_____");
System.out.println("_____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_____");
System.out.println("____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_____");
}
if(personaje.equals("sonic") || personaje.equals("SONIC")){
System.out.println("Sonic llego a gran velocidad a tu llamada");
Thread.sleep(1000);
System.out.println("_████████___ ██");
System.out.println("_█▓▓▓▓█░▓▓███▓█");
System.out.println("__█▓▓▓█░░▓▓▓█▓█");
System.out.println("___█▓▓█░▓▓▓▓▓▓█");
System.out.println("____█▓▓▓▓▓▓▓▓▓█");
System.out.println("___█▓▓▓▓▓__▓__▓█");
System.out.println("__█▓▓▓▓▓___▓____█");
System.out.println("_█▓▓▓▓▓_░__▓░__█");
System.out.println("█▓▓▓▓▓▓_█__▓█__█");
System.out.println("█████▓▓_░__▓░__█");
System.out.println("___█▓▓▓░░░░░░███");
System.out.println("__█▓▓▓▓░░░░░░░█");
System.out.println("_███████░░░░░█");
System.out.println("___██░░░█████");
System.out.println("__█░░███░░░█");
System.out.println("_█░█__█▓░░░██");
System.out.println("_██____▓░░█__█");
System.out.println("__█____▓▓██__█");
System.out.println("___█__█▓██__█");
System.out.println("____███▓█▓██");
System.out.println("_______█▓█▓█");
System.out.println("_______█▓█▓██");
System.out.println("______█___█__█");
System.out.println("______█▓▓▓█▓▓███");
System.out.println("_____█____▓█▓▓_▓▓█");
System.out.println("____█▓▓▓▓_█▓▓_▓▓▓█");
System.out.println("____██████████████ ");
}
//Declaracion de i y del tiempo junto su inicializacion
int i;
int tiempo;
String dia;
tiempo=0;

//Que objetos saldran cuando se derrote a un enemigo(la creacion del aleatorio dentro del for)
int numeroAleatorio;
numeroAleatorio = 1;
//Cuando en el combate se derrote y el numero sea 1
int pocion;
pocion=vida+2;
//Cuando en el combate se derrote y el numero sea 2
int pocionPlus;
pocionPlus=vida+10;
//Cuando en el combate se derrote y el numero sea 3
int matadragones;
matadragones=vidaDragon-2;
//Cuando en el combate se derrote y el numero sea 4
int mataElfos;
mataElfos=vidaEnemigos-3;
//Cuando en el combate se derrote y el numero sea 5
int debilitaBoss;
debilitaBoss=vidaBoss-5;

//Bucle del combate y el momento de este
for(i=0;vida>0;i++){
	if (tiempo%2 == 0){
		dia="dia";
		}else{
			dia="noche";
			}
	//numero que decide objeto que sale al derrotar enemigo
	numeroAleatorio = (int) (Math.random() * 5) + 1;//Numero aleatorio del 1 al 5
	//informacion tiempo y vida
	tiempo=tiempo+1;
	System.out.println("Es de "+dia+" "+"tu "+personaje+" "+"esta preparado ");
	System.out.println("tu vida es "+vida);
	Thread.sleep(1000);
	if (vidaEnemigos>0){
		if(i<1){
			System.out.println("ELFOS ENEMIGOS APAREZEN");
			}else{
				System.out.println("ELFOS ENEMIGOS PERSISTEN");
				}
		System.out.println("QUE DESEAS HACER");
			Thread.sleep(1000);
		System.out.println("+=======================+");
		System.out.println("| ATAQUE|ATAQUE ESPECIAL|");                 
		System.out.println("|=======================|");
		System.out.println("|DEFENSA|               |");
		System.out.println("+=======================+");
		accion=reader.readLine();
		while (!(accion.equals("ATAQUE") || accion.equals("ataque") || accion.equals("defensa") || accion.equals("DEFENSA") || accion.equals("ATAQUE ESPECIAL") || accion.equals("ataque especial")    )){
			System.out.println("Accion no reconocida vulevela a introducir");
			accion=reader.readLine();
			}
		if (accion.equals("ATAQUE") || accion.equals("ataque")){
			vidaEnemigos=vidaEnemigos-1;
			if(personaje.equalsIgnoreCase("sonic")){
				System.out.println("sonic realiza un segundo golpe");
				Thread.sleep(200);
				vidaEnemigos=vidaEnemigos-1;
				}
			}
		if (accion.equals("DEFENSA") || accion.equals("defensa")){
			vida=vida+1;
			}
		if (accion.equals("ATAQUE ESPECIAL") || accion.equals("ataque especial")){
			vidaEnemigos=vidaEnemigos-2;
			if (personaje.equalsIgnoreCase("guitarrista")){
				System.out.println("Los elfos no soportan el sonido de tu guitarra,les quitas toda la vida de golpe!!!");
				vidaEnemigos=0;
				Thread.sleep(500);
				System.out.println("##################/J.,");
				System.out.println("#################o/_l ");
				System.out.println("################ o/__l");
				System.out.println("################o/__.l");
				System.out.println("############### o/___l");
				System.out.println("###############o/___.;");
				System.out.println("################)__(  ");
				System.out.println("################l----`");
				System.out.println("################l..Y..");
				System.out.println("################l--,--");
				System.out.println("################l___l ");
				System.out.println("################lo---l");
				System.out.println("################l___l ");
				System.out.println("################lo---l");
				System.out.println("################l___l ");
				System.out.println("################l--.--");
				System.out.println("################l___l ");
				System.out.println("################l--.--");
				System.out.println("################l___l ");
				System.out.println("################l--.--");
				System.out.println("###########^.^,##lºo_ol");
				System.out.println("##########/___l###l=D=l");
				System.out.println("##########l___.l###l_ _l");
				System.out.println("##########'___.'l ## l= =l");
				System.out.println("##########  l____  l.'--'= =l##.^.^");
				System.out.println("###########l______ l= =l-.##__/");
				System.out.println("###########:______l= =l_____/");
				System.out.println("###########/_____l_____l___(");
				System.out.println("##########./_______________l");
				System.out.println("######### ,'_________________'.");
				System.out.println("#########,'__________________'.");
				System.out.println("#########l________l---------l_____'l");
				System.out.println("#########l________l---------l_____'l");
				System.out.println("#########`________o-----_º_____'");
				System.out.println("##########`______o_____o____'");
				System.out.println("###########`-______________-'");
				System.out.println("#######################");
				System.out.println("###################### ");
				}
				if (personaje.equalsIgnoreCase("homer")){
					System.out.println("HOMER ATACA LANZANDO ROSQUILLAS");
					System.out.println("HOMER RECUPERA ALGUNOS PUNTOS DE VIDA AL COMERSE ALGUNAS ROSQUILLAS");
					vida=vida+2;
					}
			}
		if (vidaEnemigos>0){
			System.out.println("Los duendes se disponen a atacar");
			vida=vida-1;
			System.out.println("tu vida es "+vida);
			}
		}
		if (vidaEnemigos<=0){
			//para que el objeto solo salga una vez
			primeraDerrota=primeraDerrota+1;
			}
    // Si derrotamos a los elfos, y decidir si coger objeto o no
		if(vidaEnemigos<=0 && primeraDerrota==1){
			System.out.println("Los elfos enemigos han sido derrotados");
			Thread.sleep(500);
			System.out.println("Los enemigos sueltan un objeto deseas cojerlo Y/N (solo cabe un objeto en la bolsa)");		
			Thread.sleep(500);
			cogerObjeto=reader.readLine();
			if (cogerObjeto.equalsIgnoreCase("Y")){
					objeto=numeroAleatorio;
					}
			System.out.println("Ha aparecido un dragon");
			
				}
	

	//Aparizion de otro enemigo
    if (vidaEnemigos<=0 && primeraDerrotaDragon<1 && vida>0){
		if(primeraDerrota !=1){
			System.out.println("EL DRAGON PERSISTE");
			}
    	System.out.println("Vida enemigo:"+vidaDragon);
    	
    			
		System.out.println("+=======================+");
		System.out.println("| ATAQUE|ATAQUE ESPECIAL|");                 
		System.out.println("|=======================|");
		if (objeto<1){
			System.out.println("|DEFENSA|               |");
			System.out.println("+=======================+");
		}
		if (objeto==1){
			System.out.println("|DEFENSA|POCION         |");
			System.out.println("+=======================+");
		}
		if (objeto==2){
			System.out.println("|DEFENSA|POCION+        |");
			System.out.println("+=======================+");
		}
		if (objeto==3){
			System.out.println("|DEFENSA|Mata Dragones  |");
			System.out.println("+=======================+");
		}
		if (objeto==4){
			System.out.println("|DEFENSA|Mata Elfos     |");
			System.out.println("+=======================+");
		}
			
		if (objeto==5){
			System.out.println("|DEFENSA|Debilita Boss  |");
			System.out.println("+=======================+");
		}
			
		accion=reader.readLine();
		while(!(accion.equals("ATAQUE") || accion.equals("ataque") || accion.equals("defensa") || accion.equals("DEFENSA") || accion.equals("ATAQUE ESPECIAL") || accion.equals("ataque especial") || accion.equals("pocion") || accion.equals("POCION") || accion.equals("POCION+")|| accion.equals("pocion+") || accion.equals("Mata Dragones") || accion.equals("mata dragones") || accion.equals("Debilita Boss") || accion.equals("debilita boss")  || accion.equals("mata elfos") || accion.equals("Mata Elfos")   )){
			System.out.println("Accion no reconocida vulevela a introducir");
			accion=reader.readLine();
			}
		if (accion.equals("ATAQUE") || accion.equals("ataque")){
			vidaDragon=vidaDragon-1;
			if(personaje.equals("sonic")){
				System.out.println("sonic realiza un segundo golpe");
				Thread.sleep(500);
				vidaDragon=vidaDragon-1;
				}
			}
		if (accion.equals("DEFENSA") || accion.equals("defensa")){
			vida=vida+1;
			}
		if (accion.equalsIgnoreCase("ataque especial")){
			vidaDragon=vidaDragon-2;
			if (personaje.equalsIgnoreCase("homer")){
					System.out.println("HOMER ATACA LANZANDO ROSQUILLAS");
					System.out.println("HOMER RECUPERA ALGUNOS PUNTOS DE VIDA AL COMERSE ALGUNAS ROSQUILLAS");
					vida=vida+2;
					}
			if(personaje.equalsIgnoreCase("sayan")){
				System.out.println("Tu personaje lanza una bola de energia al dragon enemigo");
				Thread.sleep(700);
				System.out.println("Ha echo mucho daño");
				vidaDragon=vidaDragon-3;
				Thread.sleep(200);
				}
			}
		if (objeto==1 && accion.equalsIgnoreCase("pocion")){
			vida=vida+2;
			objeto=0;
			}
		if (objeto==2 && accion.equalsIgnoreCase("pocion+")){
			vida=vida+10;
			objeto=0;
			}
		if (objeto==3 && accion.equals("Mata Dragones ") || accion.equals("mata dragones")){
			vidaDragon=vidaDragon-3;
			objeto=0;
			}
		if (objeto==4 && accion.equals("Debilita boss ") || accion.equals("Debilita boss")){
			System.out.println("No te enfrentas a un boss");
			Thread.sleep(200);
			}
		if (objeto==5 && accion.equals("Mata Elfos ") || accion.equals("mata elfos")){
			System.out.println("No te enfrentas a un elfo");
			Thread.sleep(200);
			}
		if (vidaEnemigos<=0 && vida>0){
			System.out.println("El dragon se disponen a atacar");
			vida=vida-1;
			System.out.println("tu vida es "+vida);
			}
		}
		if (vidaDragon<=0){
			//para que el objeto solo salga una vez
			primeraDerrotaDragon=primeraDerrotaDragon+1;
			}
		// Si derrotamos al dragon  decidir si coger objeto o no
		if(vidaEnemigos<=0 && vidaDragon<=0 && primeraDerrotaDragon==1 ){
			System.out.println("El dragon enemigo ha sido derrotado");
				Thread.sleep(500);
				System.out.println("Los enemigos sueltan un objeto deseas cojerlo Y/N (solo cabe un objeto en la bolsa)");		
				Thread.sleep(500);
				cogerObjeto=reader.readLine();
				if (cogerObjeto.equalsIgnoreCase("Y")){
					objeto=numeroAleatorio;
					}
			System.out.println("Ha aparecido el BOSS");
		}
		//Ultimo enemigo
		//Aparicion 
		
		if (vidaEnemigos<=0 &&vidaDragon<=0 && vida>0){
			if(primeraDerrotaDragon !=1){
			System.out.println("EL BOSS PERSISTE");
			}
			
			System.out.println("vida enemigo:"+vidaBoss);
					
			System.out.println("+=======================+");
			System.out.println("| ATAQUE|ATAQUE ESPECIAL|");                 
			System.out.println("|=======================|");
			if (objeto<1){
				System.out.println("|DEFENSA|               |");
				System.out.println("+=======================+");
			}
			if (objeto==1){
				System.out.println("|DEFENSA|POCION         |");
				System.out.println("+=======================+");
			}
			if (objeto==2){
				System.out.println("|DEFENSA|POCION+        |");
				System.out.println("+=======================+");
			}
			if (objeto==3){
				System.out.println("|DEFENSA|Mata Dragones  |");
				System.out.println("+=======================+");
			}
			if (objeto==4){
				System.out.println("|DEFENSA|Mata Elfos     |");
				System.out.println("+=======================+");
			}
				
			if (objeto==5){
				System.out.println("|DEFENSA|Debilita Boss  |");
				System.out.println("+=======================+");
			}
				
			accion=reader.readLine();
			while(!(accion.equals("ATAQUE") || accion.equals("ataque") || accion.equals("defensa") || accion.equals("DEFENSA") || accion.equals("ATAQUE ESPECIAL") || accion.equals("ataque especial") || accion.equals("pocion") || accion.equals("POCION") || accion.equals("POCION+")|| accion.equals("pocion+") || accion.equals("Mata Dragones") || accion.equals("mata dragones") || accion.equals("Debilita Boss") || accion.equals("debilita boss")  || accion.equals("mata elfos") || accion.equals("Mata Elfos")   )){
				System.out.println("Accion no reconocida vulevela a introducir");
				accion=reader.readLine();
			}
			if (accion.equals("ATAQUE") || accion.equals("ataque")){
				vidaBoss=vidaBoss-2;
				if(personaje.equalsIgnoreCase("sonic")){
				System.out.println("sonic realiza un segundo golpe");
				Thread.sleep(500);
				vidaBoss=vidaBoss-1;
					}
				}
			if (accion.equals("DEFENSA") || accion.equals("defensa")){
				vida=vida+1;
				}
			if (accion.equalsIgnoreCase("ataque especial")){
				vidaBoss=vidaBoss-3;
				if (personaje.equalsIgnoreCase("homer")){
					System.out.println("HOMER ATACA LANZANDO ROSQUILLAS");
					System.out.println("HOMER RECUPERA ALGUNOS PUNTOS DE VIDA AL COMERSE ALGUNAS ROSQUILLAS");
					vida=vida+2;
					}
				if(personaje.equalsIgnoreCase("mago")){
					System.out.println("El mago hace crezer una flor que reduze el ritmo sanginio del enemigo");
					System.out.println("El enememigo se debilita mucho");
					vidaBoss=vidaBoss-4;
					Thread.sleep(1000);
					System.out.println("					                                                  ");
					System.out.println("                ...:::::::...        ...:::::::...                    ");
					System.out.println("             .:::::::::::::::::. .::::::::::::::::::.                 ");
					System.out.println("          .::::::::::::::::::::::::::::::::::::::::::::.              ");
					System.out.println("        .:::::::::::::::::::'.-=.-~, ':::::::::::::::::::.            ");
					System.out.println("      .:::::::::::::::::::' /{,_;--'},'::::::::::::::::::::.          ");
					System.out.println("     .:::::::::::::::::::: |  .=~`|//| :::::::::::::::::::::.         ");
					System.out.println("    .::::::::::::::::::::: | /   ; \\ | :::' __, '::::::::::::.        ");
					System.out.println("   .:::::::::::::::::::::' ||    | | | :' .' \\/\\  ::::::::::::.       ");
					System.out.println("  .:::::::::::::::::::::: |\\|    | | |\\  / \\ /_|  :::::::::::::.      ");
					System.out.println("  ::::::::::::::::::::::. \\ |  | /|'/ / | \\ /_ |  ::::::::::::::      ");
					System.out.println("  ::::::::::::::' ,_ '::: `\\ \\/|/ / /`.: \\ /__/  :::::::::::::::      ");
					System.out.println("  :::::::::::::  /\\/`'. ':. `\\ `./.'/\\ : /.--' .::::::::::::::::      ");
					System.out.println("  :::::::::::::  |_\\ / \\  ::. '. ,/|\\/| //  ''''':::::::::::::::      ");
					System.out.println("  :::::::::::::  | _\\ / | .::  | | \\ \\///  .::'-.  :::::::::::::      ");
					System.out.println("  ::::::::::::::  \\__\\ / .: .'/| |  `)`/__//_/_/_\\  ::::::::::::      ");
					System.out.println("  '::::::::::::::  '--.\\ : /\\/_| |} /.---. \\ \\ \\ /  :::::::::::'      ");
					System.out.println("   '::::::::::::''     \\\\ |\\/_/| | //`  . `'...-'  :::::::::::'       ");
					System.out.println("    ::::::::::  .---'.  \\\\/ /{| |//  .:::::....::::::::::::::        ");
					System.out.println("     ':::::::  /_\\_\\_\\\\__\\`(`  | '/  :::::::::::::::::::::::'         ");
					System.out.println("      '::::::  \\ / / / .---.\\  | |  :::::::::::::::::::::::'          ");
					System.out.println("       '::::::. '-..,'` .:.`\\\\ | |} ::::::::::::::::::::::'           ");
					System.out.println("         '::::::......:::::: \\\\| |  ::::::::::::::::::::'             ");
					System.out.println("          ':::::::::::::::::: \\` |  ::::::::::::::::::'               ");
					System.out.println("            '::::::::::::::::  | |  ::::::::::::::::'                 ");
					System.out.println("              ':::::::::::::: {| |  ::::::::::::::'                   ");
					System.out.println("                '::::::::::::  | |  ::::::::::::'                     ");
					System.out.println("                  '::::::::::  | |  ::::::::::'                       ");
					System.out.println("                    '::::::::  | |} ::::::::'                         ");
					System.out.println("                      '::::::  | |  ::::::'                           ");
					System.out.println("                       ':::::. |/  ::::::'                            ");
					System.out.println("                         ':::.....:::::'                              ");
					System.out.println("                           ':::::::::'                                ");
					System.out.println("                             ':::::'                                  ");
					System.out.println("                               ':'                                    ");

					
					}
				}
			if (objeto==1 && accion.equals("pocion") || accion.equals("POCION")){
				vida=vida+2;
				objeto=0;
				}
			if (objeto==2 && accion.equalsIgnoreCase("pocion+")){
				vida=vida+10;
				objeto=0;
				}
			if (objeto==3 && accion.equals("Mata Dragones ") || accion.equals("mata dragones")){
				System.out.println("no te enfrentas a un dragon");
				Thread.sleep(500);
				}
			if (objeto==4 && accion.equals("Debilita boss ") || accion.equals("Debilita boss")){
				vidaBoss=vidaBoss-5;
				objeto=0;
				}
			if (accion.equals("Mata Elfos ") || accion.equals("mata elfos")){
				System.out.println("No te enfrentas a un elfo");
				Thread.sleep(500);
				}
			
				System.out.println("El Boss se disponen a atacar");
				vida=vida-2;
				System.out.println("tu vida es "+vida);
				System.out.println("Vida Enemigo "+vidaBoss);
				Thread.sleep(500);
		if (vidaEnemigos<=0 &&vidaDragon<=0 && vidaBoss<=0 && vida>0){
			System.out.println("HAS DERROTADO A TODOS LOS ENEMIGOS!!!");
			Thread.sleep(500);
			System.out.println("Felicidades");
			Thread.sleep(1000);
			System.out.println("+----------------------------+");
			System.out.println("|                             |");
			System.out.println("|         VICTORIA            |");
			System.out.println("|                             |");
			System.out.println("|                             |");
			System.out.println("+-----------------------------+");
			break;
			
			}
	
			}
			
		}//cierra el for
		if (vida<=0){
			System.out.println("Has sido derrotado");
			Thread.sleep(1000);
			System.out.println("+-----------------------------+");
			System.out.println("|                             |");
			System.out.println("|         GAME OVER           |");
			System.out.println("|                             |");
			System.out.println("|                             |");
			System.out.println("+-----------------------------+");
			
			
			}
	}		
}	
	


