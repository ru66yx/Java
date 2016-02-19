
public class PowerCalculator
{
    /**
     * Calculate the non-negative power of an integer number. If a negative power is input, the method returns 1.
     * 
     * @param number The number to take power.
     * @param power The power factor to be taken to.
     * @return The calculation result after taking power of the integer number.
     */
    public static long powerN(int number, int power) {
        
        // write your code after this line
        int result = 1;
        for (int i= 0;i<power;i++){
        if (power <= 0){
            result = 1;
        }
        
        
        else  result = result * number;
    }                  
        
        
        
        
        return result; 
    
}

public static int fact2(int n1, int n2) {  

    int t = 1; // initialize t to 1       
    for (int counter = n1; counter <= n2; counter++) {
        t = t * counter;
    }
    return t;
}

public static int fact3(int n1, int n2) {  

    int t = 1; // initialize t to 1       
    for (int counter = n2; counter > n1; counter--) {
        t = t * counter;
    }
    return t;
}

public static int q2(int[] array) {
  
    int index = 0;
  
    for (int i = 0; i < array.length; i++) {
        if (array[i] < array[index]) index = i;
    }
  
    return index;
  
}
}
