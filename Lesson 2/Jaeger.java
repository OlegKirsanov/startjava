public class Jaeger {
  private String modelName;
  private String mark;
  private String origin;
  private float height;
  private float weight;
  private int speed;
  private int strength;

  public Jaeger(String j1, String j2, String j3, float j4, float j5, int j6, int j7){
    modelName = j1;
    mark = j2;
    origin = j3;
    height = j4;
    weight = j5;
    speed = j6;
    strength = j7;
  }

  public void showSpecs(){
    System.out.println("Характеристики: модель " + modelName + ", " + "версия " + mark + ", " + "пр-во " + origin + ", " + "высота " + height + ", " + "вес " + weight + ", " + "скорость " + speed + ", " + "сила " + strength + ".");
  }

  public void loadArm () {
    System.out.println("Заряжает оружие");
  }

  public void usePowerMove () {
    System.out.println("Наносит коронный удар");
  }

  public void useMissile () {
    System.out.println("Выпускает ракету");
  }

  public void killKaiju () {
    System.out.println("Убивает Кайдзю");
  }
}
