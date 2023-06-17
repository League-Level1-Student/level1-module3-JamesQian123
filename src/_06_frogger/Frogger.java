package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    int frogX = 400;
    int frogY=600;
    Car tesla;
    Car honda;
    Car bmw;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
      
      
       
//       public void draw() {
//           background(back);
//           image (carLeft,250,360);
//           image (carRight,250, 210);
//           image (frog, 300, 530);
//       }
        
    
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    	tesla =  new Car(300,100,100,5);
    	honda = new Car(400,500,100,5);
    	bmw = new Car(490,242,100,5);
    	back = loadImage("/Users/league/git/level1-module3-JamesQian123/src/_06_frogger/froggerBackground.png");
    	back.resize(800, 600);
    	
    	
        carLeft = loadImage("/Users/league/git/level1-module3-JamesQian123/src/_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("/Users/league/git/level1-module3-JamesQian123/src/_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("/Users/league/git/level1-module3-JamesQian123/src/_06_frogger/frog.png");
        frog.resize(75,75);
    }

    @Override
    public void draw() {
    	 background(back);
    	fill(64,184,53);
    	ellipse(frogX,frogY,50,50);
    	
    	//if(frogX == 800 && frogY == 600) {
    		//frogX = 800;
    		//frogY = 600;
    	//}
    	tesla.display();
    	honda.display();
    	bmw.display();
    	tesla.moveLeft();
    	tesla.display();
    	honda.moveRight();
    	honda.display();
    	bmw.moveLeft();
    	bmw.display();
    	if(intersects(tesla)||intersects(honda)||intersects(bmw)) {
    		frogX = 400;
    		frogY = 600;
    		
    	}
    	
    }
    boolean intersects(Car car) {
  		 if ((frogY > car.getY() && frogY < car.getY()+50) &&
  		                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
  		   return true;
  		  }
  		 else  {
  		  return false;
  		 }
  }
    	
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            	
            {
            	frogY-=10;
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
            	frogY+=10;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	frogX+=10;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
            	frogX-=10;
                //Frog X position goes left
            }
        }
    }
    public class Car {
    	private int x;
    	private int y;
    	private int size;
    	private int speed;
    	public Car(int x, int y, int size, int speed) {
    		 this.x = x;
    		 this.y = y;
    		 this.size = size;
    		 this.speed = speed;
    	}
    	void display(){
    		image (carLeft,x,y);
           
    	  }
    	void moveLeft() {
    		x-=speed;
    		if(x < -size) {
    			x = WIDTH;
    			
    		}
    
    	}
    	void moveRight() {
    		x+=speed;
    		if(x > WIDTH) {
    			x = -size;
    			
    		}
    	}
    	public int getX() {
    		return x;
    	}
    	public int getY() {
    		return y;
    	}
    	public int getSize() {
    		return size;
    	}
    	
    	
    }
   
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
