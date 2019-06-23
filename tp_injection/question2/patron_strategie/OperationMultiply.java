package question2.patron_strategie;




/**
 * Write a description of class Multiple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int x, int y) {
      return x * y;
   }
}   /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   