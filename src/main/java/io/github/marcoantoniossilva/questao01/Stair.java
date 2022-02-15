package io.github.marcoantoniossilva.questao01;

public class Stair {

  public String mountStair(int stepsCount) {
    StringBuilder stair = new StringBuilder();
    String asterisk = "*";
    String emptySpace = " ";

    for (int counterAsc = 1; counterAsc <= stepsCount; counterAsc++) {
      int numberOfEmptySpaces = stepsCount - counterAsc;
      String emptySpaces = emptySpace.repeat(numberOfEmptySpaces);
      String asterisks = asterisk.repeat(counterAsc);
      stair.append(emptySpaces).append(asterisks).append("\n");
    }
    return stair.toString();
  }
}
