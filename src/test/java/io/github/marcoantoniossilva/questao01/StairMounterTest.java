package io.github.marcoantoniossilva.questao01;

import org.junit.Assert;
import org.junit.Test;

public class StairMounterTest {

  @Test
  public void mount() {
    Stair stair = new Stair();
    int steps = 6;
    String expected = "     *\n" +
        "    **\n" +
        "   ***\n" +
        "  ****\n" +
        " *****\n" +
        "******\n";

    String mountedStair = stair.mountStair(steps);
    Assert.assertEquals(expected, mountedStair);

    steps = 2;
    expected = " *\n" +
        "**\n";

    mountedStair = stair.mountStair(steps);
    Assert.assertEquals(expected, mountedStair);

    steps = 4;
    expected = "   *\n" +
        "  **\n" +
        " ***\n" +
        "****\n";

    mountedStair = stair.mountStair(steps);
    Assert.assertEquals(expected, mountedStair);

    steps = 5;
    expected = "    *\n" +
        "  **\n" +
        " ***\n" +
        " ****\n";

    mountedStair = stair.mountStair(steps);
    Assert.assertNotEquals(expected, mountedStair);
  }

}
