package io.github.marcoantoniossilva.questao02;

import io.github.marcoantoniossilva.questao01.Stair;
import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

  @Test
  public void testCheckPassword(){
    Password password = new Password();
    int addCharacters = password.checkPassword("Marc0%");
    Assert.assertEquals(0,addCharacters);
  }

}
