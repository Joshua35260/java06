public class Wilder {
   // attributes
  private String firstName;
  private int age;
  private boolean aware;

  // constructors
  public Wilder(String firstName) {
    this.firstName = firstName;
    this.age = 0;
    this.aware = false;
  }


  // getters //
  public String getFirstName() {
    return this.firstName;
  }
  public int getAge() {
    return this.age;
  }
  public boolean isAware() {
    return this.aware;
  }

  // setters //

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setAware(boolean aware) {
    this.aware = aware;
  }
  
  // instance method //
  public String whoAmI() {
    if (this.isAware()) {
      return "Je m'appelle " + this.getFirstName() + " et je suis aware";
    } else {
      return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
    }
  }






}
