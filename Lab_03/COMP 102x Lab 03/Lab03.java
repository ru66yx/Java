import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
     // Please write your code after this line
         
    Canvas canvas = new Canvas();
    ColorImage image = new ColorImage();
    canvas.add(image, 0, 0);
        
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
    Canvas canvas = new Canvas();
    ColorImage image1 = new ColorImage();
    canvas.add(image1, 0, 0);
    ColorImage image2 = new ColorImage();
    //Canvas canvas2 = new Canvas();
    canvas.add(image2,450,450);
    
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
   
        
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
