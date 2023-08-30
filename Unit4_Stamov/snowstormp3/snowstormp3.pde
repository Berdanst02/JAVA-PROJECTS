// create a snow storm using primitive shapes and OOP

Snowflake[] snowflakes;
int frameRate = 1;
void setup(){  // runs once
  size(400, 400);
  noStroke();
  background(0,0,0);  
  snowflakes = new Snowflake[1000];
  for( int i = 0; i < snowflakes.length; i++){
    snowflakes[i] = new Snowflake();
  }
}


void draw(){  // loops at the set fps
  background(0, 0, 0);
  for(Snowflake f : snowflakes){
    f.move();
    frameRate(10 * frameRate);
  }
  
  
}



void mousePressed(){
  frameRate*=50;
  
  
}

void mouseReleased(){
frameRate =1;

}
