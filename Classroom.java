public class Classroom {
  public static void main(String[] args) {
    Wilder patrick = new Wilder("Patrick");
    patrick.setAge(58);
    patrick.setAware(false);
    System.out.println(patrick.whoAmI());

    Wilder francine = new Wilder("Francine");
    francine.setAge(88);
    francine.setAware(false);
    System.out.println(francine.whoAmI());

    Wilder jeanEude = new Wilder("Jean-Eude");
    jeanEude.setAge(18);
    jeanEude.setAware(true);
    System.out.println(jeanEude.whoAmI());
  }

  
}
