class Arreglos {
  public static void main(String[] args) {

    int a[] = new int[5];
    a[0] = 99;
    a[1] = 79;
    a[2] = 13;
    a[3] = 45;
    a[4] = 22;

    // generando una excepción
    //for (int v : a){
    //  System.out.println(v);
    //}
    //
    //System.out.println(a[5]);

    // generando otro tipode excepción
    // for (int i = 0; i < 6; i++ ){ comentado para utilizar la propiedad length
    for (int i = 0; i < a.length; i++ ){
      System.out.println(a[i]);
    }

    boolean b[] = new boolean [3];
    for (boolean v : b ){
        System.out.println(v);
    }
  }
}
