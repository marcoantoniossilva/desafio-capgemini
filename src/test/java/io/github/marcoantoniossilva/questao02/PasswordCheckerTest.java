package io.github.marcoantoniossilva.questao02;

import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {

  @Test
  public void check(){
    Password password = new Password();
    int allComplete = password.checkPassword("Marc0%");
    int expected = 0;

    Assert.assertEquals(expected,allComplete);

    int noLowerLetters = password.checkPassword("MARC0%");
    expected = 1;
    Assert.assertEquals(expected,noLowerLetters);

    int noUpperLetters = password.checkPassword("marc0%");
    expected = 1;
    Assert.assertEquals(expected,noUpperLetters);

    int noDigits = password.checkPassword("Marco%");
    expected = 1;
    Assert.assertEquals(expected,noDigits);

    int noSpecialCharacters = password.checkPassword("Marc0o");
    expected = 1;
    Assert.assertEquals(expected,noSpecialCharacters);

    int smallPassword = password.checkPassword("M4rc%");
    expected = 1;
    Assert.assertEquals(expected,smallPassword);

  }

}
