package mouseinput;
 
import processing.core.PApplet;
 
public class MouseINput extends PApplet 
{
    float boxX = 350;
    float boxY = 250;
    int width = 100;
    int height = 100;
     
    boolean insideBox = false;
    boolean changeColor = false;
     
    int[] rgb = {105, 20, 155};
 
    public void setup() 
    {
        size(800, 600);
    }
 
    public void draw() 
    {
        background(0, 0, 0);
        changeTheColor();
         
        if(mouseX > boxX && mouseX < boxX + width 
                && mouseY > boxY && mouseY < boxY + height){
            insideBox = true;
        }
        else{
            insideBox = false;
        }
        fill(rgb[0], rgb[1], rgb[2]);
        rect(boxX, boxY, width, height);
    }
     
    public void mouseDragged()
    {
        if(insideBox)
        {
            boxX = mouseX - width/2;
            boxY = mouseY - height/2;
        }
    }
     
    public void mousePressed()
    {
        changeColor = true;
    }
     
    public void mouseReleased()
    {
        changeColor = false;
    }
     
    public void changeTheColor()
    {
        if(changeColor)
        {
            for(int i = 0; i < 3; i ++)
            {
                if(rgb[i] < 255)
                {
                    rgb[i] += 1;
                }
                else
                {
                    rgb[i] = 0;
                }
             
            }
        }
    }
}
