class CicloFor {
  public static void main(String[] args) {

//    int i = 0; // scope por fuera del ciclo
//    for (; i < 10;){
//      System.out.println(i);
//      i++; // quitando el incremento de la estructura del for

      for (int i = 0; i < 10; i++){
        System.out.println(i);
        //if(i == 5){
            //break;
        if (i % 2 == 0){
            continue;
        }
        // Imagine que aquí hace otro proceso muy largo
        System.out.println("Trabajando muy duro: " + i);
    }
  }
}
