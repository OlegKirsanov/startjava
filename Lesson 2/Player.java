public class Player {
  private String name;
  private int number;
  private char guessResult;

  public void setName(String n){
    name = n;
  }

  public String getName(){
    return name;
  }

  public void setNumber(int n){
    number = n;
  }

  public int getNumber(){
    return number;
  }

  public char guess(int compNumber){
    if (number == compNumber){
      guessResult = '=';
      return guessResult;
    } else if (number > compNumber){
      guessResult = '>';
      return guessResult;
    } else if (number < compNumber){
      guessResult = '<';
      return guessResult;
    }
      return guessResult;
  }
}
