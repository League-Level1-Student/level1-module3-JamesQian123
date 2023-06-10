package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    int x;
    int y;
    Car tesla;
    Car honda;
    Car bmw;
    
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    	tesla =  new Car(300,100,150,200);
    	honda = new Car(400,500,100,150);
    	bmw = new Car(490,294,281,128);
    }

    @Override
    public void draw() {
    	background(103,197,245);
    	fill(64,184,53);
    	ellipse(x,y,50,50);
    	if(x == 800 && y == 600) {
    		x = 800;
    		y = 600;
    	}
    	tesla.display();
    	honda.display();
    	bmw.display();
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            	
            {
            	y+=1;
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
            	y-=1;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	x+=1;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
            	x-=1;
                //Frog X position goes left
            }
        }
    }
    public class Car {
    	int x;
    	int y;
    	int size;
    	int speed;
    	public Car(int x, int y, int size, int speed) {
    		 this.x = x;
    		 this.y = y;
    		 this.size = size;
    		 this.speed = speed;
    	}
    	void display(){
    	    fill(0,255,0);
    	    rect(x , y,  size, 50);
    	  }
    	

    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
