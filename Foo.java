public class Foo {

  public static int FooFunct (String input) {
    int answer = 0;

    switch(input) {
      case "1":
      answer += 1;
      //break; Force this simple bug.
      case "2": 
      answer += 2;
      break;
      default:
      answer += 5;
    }

    return answer;
  }
}
