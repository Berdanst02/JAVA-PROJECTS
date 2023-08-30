//create snowstorm using primitive shapes and OOP

Snowflake[] snowflakes;





void setup(){ //runs once
size(900,500);
noStroke();
background(0,0,0);
snowflakes = new Snowflake[100];
for(int i=0;i<snowflakes.length;i++){
snowflakes[i] = new Snowflake();
}
  

}

void draw(){ //loops at set fps
  background(0,0,0);
  
  
  
  
  
  for(Snowflake f : snowflakes){
  f.move();
  
  
  
  }


}
