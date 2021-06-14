package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun, sun2;
    private boolean TerreFixe;

    
   
 
    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(-15);
        sun2.moveVertical(-10);
        sun2.changeSize(60);
        sun2.makeVisible();
    }

   
    public void setBlackAndWhite() {
        if (wall != null) 
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            sun2.changeColor("black");
        }
    }

    public void setColor() {
        if (wall != null) 
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("blue");
            sun2.changeColor("yellow");
        }
    }
   
    public void seCoucher(){
        if(!TerreFixe){
            TerreFixe = true;
            sun.slowMoveVertical(250);
        }
    }
    
  
    public void seLever(){
        if(TerreFixe){
            TerreFixe = false;
            sun.slowMoveVertical(-250);
        }
    }


}
