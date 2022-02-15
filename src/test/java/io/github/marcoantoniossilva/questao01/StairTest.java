package io.github.marcoantoniossilva.questao01;

import org.junit.Assert;
import org.junit.Test;

public class StairTest {

  @Test
  public void testMountStair(){
    Stair stair = new Stair();
    String mountedStair = stair.mountStair(6);
    Assert.assertEquals(
        "     *\n" +
        "    **\n" +
        "   ***\n" +
        "  ****\n" +
        " *****\n" +
        "******\n",mountedStair);
  }

}
