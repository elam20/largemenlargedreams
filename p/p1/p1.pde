import Ball;

Ball[] balls;

void setup()
{
    size(600, 600);
    balls = new Ball[1];
    //balls = new Ball[25];
    for(int i = 0 ; i < balls.length; i++)
      balls[i] = new Ball();
     balls[0].state = Ball.DEAD;
}

void draw()
{
    background(0);
    
    for(int i = 0 ; i < balls.length ; i++){
        balls[i].draw();
        balls[i].process();
    }
}

void mouseClicked()
{
    background(100);
}
