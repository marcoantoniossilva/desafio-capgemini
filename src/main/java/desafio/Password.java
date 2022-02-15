package desafio;

public class Password {

  private static final int MIN_NUM_CHAR = 6;

  public int checkPassword(String password) {
    int addCharacters = 0;
    String upperLetters = "(.*)[A-Z](.*)";
    String lowerLetters = "(.*)[a-z](.*)";
    String specialCharacters = "(.*)[!@#$%^&*()+-](.*)";
    String digits = "(.*)[0-9](.*)";

    if (!password.matches(upperLetters))
      addCharacters++; // Não encontrou nenhuma letra maiúscula

    if (!password.matches(lowerLetters))
      addCharacters++; // Não encontrou nenhuma letra minúscula

    if (!password.matches(specialCharacters))
      addCharacters++; // Não encontrou nenhum digíto

    if (!password.matches(digits))
      addCharacters++; // Não encontrou nenhum caractere especial

    return Math.max(MIN_NUM_CHAR - password.length(), addCharacters);
  }
}
