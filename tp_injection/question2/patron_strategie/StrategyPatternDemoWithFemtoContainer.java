package question2.patron_strategie;

import container.Factory;
import container.ApplicationContext;

/**
 * Write a description of class demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class StrategyPatternDemoWithFemtoContainer {
   public static void main(String[] args) throws Exception{
      ApplicationContext ctx = Factory.createApplicationContext("./question1/patron_strategie/README.TXT");
      Context context = ctx.getBean("context1");
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = ctx.getBean("context2");
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 	
      context =  ctx.getBean("context3");
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   