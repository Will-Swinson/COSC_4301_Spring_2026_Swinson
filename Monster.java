public class Monster {
  private String name;
  private String type;

  public Monster(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getDescription() {
    return "Monster Name: " + name + "\n"
        +  "Monster Type: " + type + "\n"
        + name + " is a powerful " + type + " monster.";
  } 


}