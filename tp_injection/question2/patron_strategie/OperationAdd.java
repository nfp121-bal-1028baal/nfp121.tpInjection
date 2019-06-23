package question2.patron_strategie;


/**
 * Write a description of class add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int x, int y) {
      return x + y;
   }
}
    