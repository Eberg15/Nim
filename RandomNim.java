// Ezra Berg Nim
public class RandomNim // creates a public class known as RandomNim
{
  public RandomNim(int startnum){ // I dont know what this does but it makes the code compile
  }
  public int play(int pieces) // this creates the play
  {
    if((pieces-1)%3 == 0) // you lose if this is true so you can return any number
      return 2;
    else if ((pieces-2)%3 == 0) // if this is true, the robot will return 1
      return 1;
    else
      return 2; // the catchall, if none of the others are true.
    
  }
}
