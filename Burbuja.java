class Burbuja {
  public static void main(String[] args) {

    // Declaración del arreglo
    int a[] = new int [10];

    // Poblado del arreglo con números aleatorios
    for(int i = 0; i < a.length; i++){
        a[i] = (int)(Math.random() * 99); // aplicando casting
// Math.random genera un número float entre 0.0 y 0.9999999999
    }
    // Mostrar el arreglo por consola
    for( int v : a){
      System.out.println(v);
    }
  }
}
