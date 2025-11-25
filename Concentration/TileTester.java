/*
 * Activity 3.3.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
    Tile[][] gameboard = new Tile[3][4];

    for (int row = 0; row < gameboard.length; row++) {
        for (int col = 0; col < gameboard[row].length; col++) {
            int index = row * gameboard[row].length + col;
            gameboard[row][col] = new Tile(tileValues[index]);
        }
    }
  
    for (int row = 0; row < gameboard.length; row++) {
        for (int col = 0; col < gameboard[row].length; col++) {
            int index = row * gameboard[row].length + col;
        System.out.println(gameboard[row][col]);
    }
}
    
  }
}

