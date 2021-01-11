class Condicionales {
    public static void main(String[] args) {
    // if (condición){
    //    verdadera
    // }
        int edad = 15;

        if (edad >= 0 && edad < 18) {
		        System.out.println("Estas en la niñez");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Estas en la adultez");
        } else if (edad > 65) {
            System.out.println("Estas en la vejez");
        } else {
           System.out.println("Edad errada.");
        }
	   System.out.println("El proceso ha finalizado!"); // para indicar el proceso ha finalizado
    }
 }
