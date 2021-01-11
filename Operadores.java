class Operadores{
  public static void main(String ...args) { // firma del método main

    //Asignación =
//    int a = 2; // declaramos la variable con asignación de valor

//    int b; // declaración de la variable
//    b = 2; // asignación del valor a la variable declarada

    //Preincremento
//      int a = 0;
//      ++a;

    //Postincremento
//      int b = 0;
//      b++;

    // pre vs post
//        int a = 3;
//        int b = 2;
        // comenzamos con el Preincremento
//        int c = a * ++b;

        // Ahora el postincremento
          int c = a * b++;

    // operadores aritméticos
    // + - * /
    // jerarquía
    // Operador . (POO), operador ()
    // Primero * / (con prioridad de izquierda a derecha)
    // Segundo + - (con prioridad de izquierda a derecha)

    int o = 3 + 3 * 3 - 3;
    int o = (3 + 3) * 3 - 3;
  }
}
