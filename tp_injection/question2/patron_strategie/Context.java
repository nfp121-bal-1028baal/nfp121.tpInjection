package question2.patron_strategie;


/**
 * Write a description of class context here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }
   public Context(){}
   public void setStrategy(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int x, int y){
      return strategy.doOperation(x, y);
   }
}
 /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
  