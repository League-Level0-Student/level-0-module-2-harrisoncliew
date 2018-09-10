// 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x = 240;
    int y = 210;
    int e = 200;
    
    
    void setup() {
      //1. set the size of your sketch
      size(500,500);
    
    }
    
    void draw() {
      //2. set the background color of your sketch
      background(250,8,16);
      //3. draw an ellipse. Make sure it fits in the window.
      ellipse(x,y,e,e);
      fill(#000000);
      //5. use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance;
      //6b. use the getDistance method to initialize your varible
      distance = getDistance(x,y,e,e);
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
      print(distance);
    
      
      //8a. make an if statement to check if the distance variable
      if(distance<=e){
        x = 349;
        y = 276;
      }

      //   is within the size of the ellipse
      
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
    }
    