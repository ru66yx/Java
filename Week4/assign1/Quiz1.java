
/**
 * Write a description of class Quiz1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import comp102x.IO; 
public class Quiz1
{
   
  

  
        private int x;

        public Quiz1(int x) {
  
                x = 100;
        }

        public static void main(String[] args) {
  
                Quiz1 q1 = new Quiz1(10);
                IO.outputln(q1.x);
        }

}
