import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FooTest {
  @Test
  public void testFooFunct() {

    Foo.FooFunct("1");
    assertEquals(Foo.FooFunct("1"), 1);

    assertEquals(Foo.FooFunct("2"), 2);
    assertEquals(Foo.FooFunct("-1"), 5);
    assertEquals(Foo.FooFunct("Hellooooooooooo"), 5);
  }
}
