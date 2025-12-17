
import java.awt.Color;
 
public class Editor4 {
    
public static void main (String[] args) {

String source = args[0];
		String target = args[1];
		int n = Integer.parseInt(args[2]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.read(target);
		   

        Color [][] gray = Runigram.grayScaled(sourceImage);

        Color [][] gray1 = Runigram.grayScaled(targetImage);
        
        
        
        Runigram.setCanvas(gray);
		Runigram.morph(gray, gray1, n);


}
 }