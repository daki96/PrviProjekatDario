package seven;
 // Ako bude public class Season onda mozemo kreirati bezbroj primjeraka godisnjih doba, a to ne zelimo pa zbog toga
// kreiramo enumiranu klasu enum Season koja nam dozvoljava da ogranicimo broj primjeraka
public enum Season {
 WINTER ("Zima"),
  SPRING ("Proljece"),
  SUMMER ("Ljeto"),
  AUTUMN ("Jesen")
  ;

  private String name;

 private Season (String name){ // Opet da se prisjetimo konstruktor od Enuma mora biti private

  this.name = name;
 }

  public String getName() {

  return name;
  }

  public void setName(String name) {
   this.name = name;
  }
 }
