class CicloForEach {
  public static void main(String[] args) {

    int []a = new int []{1,2,3,4,5,6,7,8,9,10};
    String []nombres = new String [] {"Alvaro", "Beto", "Alexys", "Alejo1", "Alejo2"};

    for (int v : a ){
      System.out.println(v);
    }

    for (String nombre : nombres ) {
      System.out.println(nombre);
    }

  }
}
