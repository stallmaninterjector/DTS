import apcslib.*;
public class Spiral {
public static void main(String[] args)
{
	SketchPad paper=new SketchPad(500,500);
	DrawingTool pen=new DrawingTool(paper);
int count=1;
while (count <= 9000) {
	pen.forward(count);
	pen.turnRight(90);
	count+=7;
}
}
}
