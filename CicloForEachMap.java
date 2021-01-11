import java.util.Map;
import java.util.HashMap;

class CicloForEachMap {
  public static void main(String[] args) {

    Map <Integer, String> nombres = new HashMap<>();
    //nombres.put(key, value);
    nombres.put(1, "Alvaro");
    nombres.put(2, "Beto");
    nombres.put(3, "Alexys");
    nombres.put(4, "Mircha");
    nombres.put(5, "Alejo1");
    nombres.put(6, "Alejo2");

    // ahora hay que recorrer el mapa
    // nombres.foreach(action) // aquí se utiliza la expresión lambda utilizada en JavaScript
    // lambda es una función anónima
    nombres.forEach((id, name) -> {
      System.out.println("ID: " + id + " Nombre: " + name);
    });
  }
}
