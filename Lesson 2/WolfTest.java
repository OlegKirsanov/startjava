class WolfTest {
  public static void main (String[] args) {
    Wolf wolfOne = new Wolf();
    wolfOne.setSex("кобель");
    wolfOne.setNickName("Волчок");
    wolfOne.setWeight(12);
    wolfOne.setAge(9);
    wolfOne.setColour("серый");

    System.out.println("Пол: " + wolfOne.getSex());
    System.out.println("Кличка: " + wolfOne.getNickName());
    System.out.println("Вес: " + wolfOne.getWeight());
    System.out.println("Возраст: " + wolfOne.getAge());
    System.out.println("Окрас: " + wolfOne.getColour());

    wolfOne.go();
    wolfOne.sit();
    wolfOne.run();
    wolfOne.howl();
    wolfOne.hunt();

  }
}

public class Wolf {
  private String sex;
  private String nickName;
  private int weight;
  private int age;
  private String colour;

  public String getSex () {
    return sex;
  }

  public void setSex (String s) {
    sex = s;
  }

  public String getNickName () {
    return nickName;
  }

  public void setNickName (String n) {
    nickName = n;
  }

  public int getWeight () {
    return weight;
  }

  public void setWeight (int w) {
    weight = w;
  }

  public int getAge () {
    return age;
  }

  public void setAge (int a) {
    if (a > 8) {
      System.out.println("Некорректный возраст");
    } else {
    age = a;
    }
  }

  public String getColour () {
    return colour;
  }

  public void setColour (String c) {
    colour = c;
  }

  public void go () {
    System.out.println("Волк идёт");
  }

  public void sit () {
    System.out.println("Волк сидит");
  }

  public void run () {
    System.out.println("Волк бежит");
  }

  public void howl () {
    System.out.println("Волк воет");
  }

  public void hunt () {
    System.out.println("Волк охотится");
  }

}
