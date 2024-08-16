/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   

  /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */
   //Creamos una funcion JavaEscribir_asc que reciba 3 int y devuelva String 
   public static String Escribir_asc (int num_1, int num_2, int num_3){
      try {
         //Declaramos e inicializamos las variables
         int num_mayor = 0, num_medio=0, num_menor=0;
         String orden = ""; 
      
         //Utilizamos if si hay al menos 2 números iguales 
         if (num_1 == num_2 || num_2 == num_3 || num_3==num_1){
            return "Error: La función no considera números iguales";
         }
         //Else if evaluamos el orden de los numeros 
         else if (num_1 > num_2 && num_1 > num_3) {
            num_mayor = num_1;
            if (num_2 > num_3) {
               num_medio = num_2;
               num_menor = num_3;
            } 
            else {
                num_medio = num_3;
                num_menor = num_2;
            }
        } 
        else if (num_2 > num_1 && num_2 > num_3) {
            num_mayor = num_2;
            if (num_1 > num_3) {
                num_medio = num_1;
                num_menor = num_3;
            } 
            else {
                num_medio = num_3;
                num_menor = num_1;
            }
        } 
        else {
            num_mayor = num_3;
            if (num_1 > num_2) {
                num_medio = num_1;
                num_menor = num_2;
            } 
            else {
                num_medio = num_2;
                num_menor = num_1;
            }
        }
      return orden;
         
      }
      catch (Exception e) {
      
         return "Error: La función no considera números iguales";
      }
   }
    
   
   
   //Evaluamos numero_mayor - numero_medio - numero_menor 
   //Retornamos Orden


   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */

    //Crear la función que devuelva un byte Obtener_cifras que recibe un numero entre 0 y 50000 (int)
    public static byte Obtener_cifras (int numero){
      try {
         //Inicializa la variable del numero de cifras del numero ingresado 
         byte numero_de_cifras = 0;

         //Declaramos las constantes
         final int lim_inferior_numero = 0, lim_superior_numero = 50000;
         
         //Crear un if para cuando *no* está en el rango que devuelva 0 
         if (lim_inferior_numero>=numero || numero>=lim_superior_numero)
            return 0;
            //Si está en el rango se utiliza la operación correspondiente
            /*Se pueden usar rangos, sin embargo utilizaría muchos if y no es práctico en caso de que se 
             *cambie el limite superior del número, como .lenght ayuda a contar los caracteres, entonces
             convertimos el int (numero) a string con string.valueOf () y después lo casteamos a byte para poder
             retornarlo 
            */
            else {
               numero_de_cifras= (byte) String.valueOf(numero).length();
               return numero_de_cifras;
               }
         }
          
      //Catch devuelve -1 para errores inesperados
      catch (Exception e) {
         return -1;
         }
   }
    
    /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */
    // Construir la funcion Clasificar_char que reciba un char y devuelva un string 
    public static String Clasificar_char (char caracter){
      try {
         // Inicializar las variables 
         String Tipo_de_Caracter ="";
         /* Realizar un if si es alfabetico un else if si es numerico y un else si es especial
         Para esto utilizaremos Character.isLetter() y Character.isDigit()*/ 
         if (Character.isLetter(caracter)){
            Tipo_de_Caracter = "ES LETRA";
            }
         else if (Character.isDigit(caracter)){
            Tipo_de_Caracter = "ES NUMERO";
         }
         else{
            Tipo_de_Caracter = "ESPECIAL";
         }
      return  Tipo_de_Caracter;
      } 
      // En caso de que haya un error inesperado,  "Ocurrió un error inesperado".
      catch (Exception e) {
         return "Ocurrió un error inesperado";
      }
    }
    
    
    



   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */
    public static String Hallar_division_exacta (int num_1, int num_2){
      try {
         //Declaramos variables y constantes
         String resultado = "";

         //Validamos que ambos numeros sean mayores que 0 
         if (num_1<=0 || num_2<=0){
            resultado = "NO SE ADMITE CERO O NEGATIVOS";
            }
         
         //Retornamos División exacta cuando no hay residuo
         else if (num_1%num_2 == 0){
            resultado = "DIVISION EXACTA";
            }

         //Retornamos división no exacta cuando hay residuo en la división 
         else if (num_1%num_2 != 0){
            resultado = "DIVISION NO EXACTA";
            } 
         //Retornamos el resultado 
         return  resultado;
         }
      

      catch (Exception e) {
         return "Ocurrió un error inesperado";
         }
   }

   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */
    //Construir una función Consultar_hab que reciba byte numero de camas  y en un String si desea VE o AA, devuelve un string
    public static String Consultar_hab(byte numero_camas, String condiciones) {
      try {
          // Inicializamos la variable de habitaciones_disponibles 
          String habitaciones_disponibles = ""; 
  
          // If el string no es VE o AA o el número no está entre 1-3 entonces devuelve Datos no válidos 
          if ((!condiciones.equals("VE") && !condiciones.equals("AA")) || numero_camas < 1 || numero_camas > 3) {
            return "DATOS NO VÁLIDOS";
            } 

            else {
              // Realizamos un condicional para cuando necesitan AA o VE
              switch (condiciones) {
                  case "AA":
                      switch (numero_camas) {
                          // Si es AA y numero_camas = 2 devuelve 101|301
                          case 2:
                              habitaciones_disponibles = "101|301";
                              break;
                          // Si es AA y numero_camas = 3 devuelve 301 
                          case 3:
                              habitaciones_disponibles = "201";
                              break;
                           }
                      break;
  
                  case "VE":
                      switch (numero_camas) {
                          // Si es VE y numero_camas = 2 
                          case 1:
                              habitaciones_disponibles = "102";
                              break;
                          // Si es VE y numero_camas = 3  
                          case 2:
                              habitaciones_disponibles = "202";
                              break;
                           }
                      break;
  
                  default:
                      return "Ocurrió un error inesperado";
               }
            }
  
         return habitaciones_disponibles;
  
      } catch (Exception e) {
          return "Ocurrió un error inesperado";
      }
  }
    
    
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */
    //Creamos la funcion que devuelva string y reciba 3 boolean 
   public static String Obtener_obs (boolean plato_1, boolean plato_2, boolean plato_3){
      try {
         //Inicializamos las variables y declaramos las constantes
         String Obsequio = "";
         final String obsequioplato_1="POSTRE", obsequioplato_1_2 ="BEBIDA", obsequioplato_1_2_3 = "BEBIDA Y POSTRE";
         //Con ayuda del condicional if, hacemos los respectivos escenarios para lo que escoja el cliente 
         //En el escenario 1 el cliente solicita el plato 1 y le dan postre
         if (plato_1==true && plato_2==false && plato_3==false){
            Obsequio = obsequioplato_1;
            }
         //En el escenario 2 el cliente selecciona el 1 y 2 y le dan bebida
         else if (plato_1==true && plato_2==true && plato_3==false){
            Obsequio = obsequioplato_1_2;
            }
          //El cliente seleccion el plato 1 y 2 y 3 y le dan postre y bebida 
         else if (plato_1==true && plato_2==true && plato_3==true){
            Obsequio = obsequioplato_1_2_3;
            }
         //Sino (los 3 son falsos) se devuelve plato no válido 
         else if (plato_1==false && plato_2==false && plato_3==false){
            Obsequio = "PLATOS NO VÁLIDOS";
            }
         return Obsequio;
         }
        
      //Si hay un error inesperado
      catch (Exception e) {
         return "Ocurrió un error inesperado";
         }
   }

    /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */
    public static String Conocer_invitacion (String color_bola){
      try {
         //Declaramos las variables 
         String invitacion = ""; 
         final String invitacionverde = "Invita a las cervezas", invitacionazul = "Invita a la pizza",
         invitacionrojo = "Invita al postre", invitacion_amarillo = "Paga el parqueadero de todos",
         invitacion_blanco_negro = "Vaya y disfrute";
         //Realizamos un switch para comparar la variable color con cada una de las opciones 
         switch (color_bola){
            case "verde" :
               invitacion =  invitacionverde;
               break;
            case "azul" :
               invitacion = invitacionazul;
               break;
            case "rojo" :
               invitacion = invitacionrojo;
               break;
            case "amarillo" :
               invitacion = invitacion_amarillo;
               break;
            case "blanco" :
               invitacion = invitacion_blanco_negro;
               break;   
            case "negro":
               invitacion = invitacion_blanco_negro;
               break;
            default:
               return "Error en el color";
            }
         return invitacion;
      } 

      catch (Exception e) {
         return "Ocurrió un error inesperado";
         }
   
    }

   }
