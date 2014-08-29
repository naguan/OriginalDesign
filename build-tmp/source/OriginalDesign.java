import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

float z = 255;
float x = 255;
float c = 255;
float num = 0;
float mx = 150;
float my = 150;
boolean disco = false;
boolean circle = false;
boolean square = false;

public void setup()
{
  background(0);
  size(300, 300);
}
public void draw()
{
  if (circle == true)
  {
    circle1();
  } 
  else if (square == true)
  {
    square1();
  }
}
public void circle1()
{

  noStroke();
  fill(z, x, c);
  ellipse(mx, my, 100, 100);  
  if (disco == true)
  {  
    z = random(256);
    x = random(256);
    c = random(256);
  }
}

public void square1()
{
  {
    noStroke();
    fill(z, x, c);
    rect(mx-50, my-50, 100, 100);
    if (disco == true)
    {  
      z = random(256);
      x = random(256);
      c = random(256);
    }
  }
}
public void keyPressed()
{
  if (key == 'z')
  {
    z = random(256);
  }
  if (key == 'x')
  {
    x = random(256);
  }
  if (key == 'c')
  {
    c = random(256);
  }
  if (key == 'd')
  {
    disco = true;
  }
  if (key == 's')
  {
    disco = false;
  }
  if (key == 'a')
  {
    circle = true;
  }
  if (key == 'q')
  {
    square = true;
  }
}
public void mouseDragged()
{
  mx=mouseX;
  my=mouseY;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
