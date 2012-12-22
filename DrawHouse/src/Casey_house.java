import apcslib.*;
public class Casey_house {
public static void main(String[] args)
{
	SketchPad paper=new SketchPad(500,500);
	DrawingTool pen=new DrawingTool(paper);
	
	pen.turnRight(70);
	pen.forward(125);
	pen.turnRight(50);
	pen.forward(125);
	pen.turnRight(60);
	pen.forward(200);
	pen.turnRight(90);
	pen.forward(100);
	pen.turnRight(90);
	pen.forward(50);
	pen.turnLeft(90);
	pen.forward(20);
	pen.turnLeft(90);
	pen.forward(50);
	pen.turnLeft(90);
	pen.forward(20);
	pen.up();
	pen.backward(20);
	pen.down();
	pen.turnRight(180);
	pen.forward(100);
	pen.turnRight(90);
	pen.forward(220);
	
}
}