package desafio;

public class Stair {

  public String mountStair(int stepsCount) {
    String stair = "";
    String asterisk = "*";
    String emptySpace = " ";

    for (int counterAsc = 1; counterAsc <= stepsCount; counterAsc++) {
      int numberOfEmptySpaces = stepsCount - counterAsc;
      String emptySpaces = emptySpace.repeat(numberOfEmptySpaces);
      String asterisks = asterisk.repeat(counterAsc);
      stair += emptySpaces.concat(asterisks) + "\n";
    }
    return stair;
  }
}
