import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        
        int x;    // 1st Number
        int y;     //  2nd Number
        int Answer;  // Result of multiplication

        // Ask student to input scores for exam, lab and nomework
        IO.output("Enter an integer, x: ");
        x = IO.inputInteger( );
        IO.output("Enter an integer, y: ");
        y = IO.inputInteger( );
        
        
        // Computer final grade as the weighted sum of exam, lab and homework scores
	    Answer = x * y;
        
        
        // Output the final grade
        IO.outputln("Answer = " + Answer);  
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
       double width;    // 1st Number
       double height;     //  2nd Number
       double Answer;  // Result of calculation

        // Ask for inputs
        IO.output("Enter the width of the triangle: ");
        width = IO.inputDouble( );
        IO.output("Enter the height of the triangle: ");
        height = IO.inputDouble( );
        
        
        // Compute Area
	    Answer = 0.5 * width * height;
        
        
        // Output area
        IO.outputln("The triangle area = " + Answer);  
        
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
      
        
       double a;    // 1st Number
       double b;    //  2nd Number
       double c;    //  3rd Number
       double Answer1;  // Result of calculation
       double Answer2;  // Result of calculatio
       
      
       // Ask for inputs 
       IO.output("Enter a: ");
       a = IO.inputDouble( );
       IO.output("Enter b: ");
       b = IO.inputDouble( );
       IO.output("Enter c: ");
       c = IO.inputDouble( );

      // Compute solution
      Answer1 =  (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
      Answer2 =  (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
      
      // Ouput solution
      IO.outputln("First solution for x = " + Answer1);
      IO.outputln("Second solution for x = " + Answer2);
        
    }
}
