public class Moving{
  private int row;
  private int column;
  private int direction;
  public void move{
    if(direction == NORTH){
      row++;
    }
    else if(direction == SOUTH){
      row--;
    }
    else if(direction == EAST){
      column++;
    }
    else if(direction == WEST){
      column--;
    }
  }
}
