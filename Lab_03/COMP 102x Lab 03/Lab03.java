import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
     // Please write your code after this line
         
    Canvas canvas = new Canvas(400,400);
    ColorImage image = new ColorImage();
    System.out.println(image.getWidth());
    System.out.println(image.getHeight());
    canvas.add(image, 0, 0);
    
        
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
    Canvas canvas = new Canvas(800,400);
    ColorImage image = new ColorImage();
    canvas.add(image, 0, 0);
    ColorImage image2 = new ColorImage();
    System.out.println(image2.getWidth());
    System.out.println(image2.getHeight());
    canvas.add(image2,400,0);
    
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
   ColorImage image = new ColorImage();
   ColorImage image2 = new ColorImage(); 
   ColorImage image3 = image.add(image2); 
   Canvas canvas = new Canvas(1220,400);
   canvas.add(image, 0, 0);  
   canvas.add(image2,410,0);
   canvas.add(image3,820,0);
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
  ColorImage image = new ColorImage();
  ColorImage image2 = new ColorImage(); 
  ColorImage image3 = image.multiply(image2); 
  Canvas canvas = new Canvas(1220,400);
  canvas.add(image, 0, 0);  
  canvas.add(image2,410,0);
  canvas.add(image3,820,0);
        
        
        
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
