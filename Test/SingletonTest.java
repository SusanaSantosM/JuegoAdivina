import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class SingletonTest {
  @Test
  @DisplayName("comprobar Instance")

  public void comprobarInstance(){
    Juego dato1 = Juego.getInstance();
    Juego dato2 = Juego.getInstance();
    Assertions.assertEquals(dato1,dato2);
  }

}
