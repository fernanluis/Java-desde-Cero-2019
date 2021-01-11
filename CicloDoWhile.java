class CicloDoWhile{

  public static void main(String[] args) {

    // do do while
    // El código se ejecutará por lo menos una vez
    int i = 0;
    do {
      System.out.println(i);
      i++;
      if (i % 2 == 0){
        //break;
        continue; // aplicando continue en lugar de break
      }
      System.out.println("Estoy después del continue: " + i);
    } while (i < 10 );
  }
}
