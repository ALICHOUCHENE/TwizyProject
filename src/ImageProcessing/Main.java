package ImageProcessing;

import java.util.List;
import java.util.Vector;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import org.opencv.core.MatOfInt4;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;


/*
 * Main class
 * We can use it to make sure opencv is installed correctly
 * for the time being
 */

public class Main {
    public static void main( String[] args ) {
    	
      
      System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
      Vector<Mat> panels= Utilities.SignPanels();
      

      /*Mat img = Utilities.readImage("Images/ref90.jpg");
      Utilities.GreyMode(img);
      Utilities.BGRMode(img);
      Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
      System.out.println("mat = " + mat.dump());
      */
      Mat testFile = Utilities.readImage("Images/p12.png");
      //Mat ref = Utilities.readImage("Images/ref70.jpg");
      Utilities.imShow("test file", testFile);
      Mat hsvimage=Utilities.RGB2HSV(testFile);
      //HighGui.imshow("hsv 110km/h", hsvimage);
     List<MatOfPoint> listeContours = Utilities.detectContours(hsvimage);
     Mat objetrond = null;
		
		  for (MatOfPoint contour: listeContours ){
		  objetrond=Utilities.DetectForm(testFile,contour); if (objetrond!= null) {
		  Utilities.imShow("contour rond", objetrond);
		  Utilities.Match(objetrond,panels); }
		  
		  
		  }
		 
      Utilities.Match(testFile,panels);
      //HighGui.waitKey(0);
      //float x=Utilities.Matching(objetrond,ref);
      //System.out.println(x);
      //Utilities.imShow("contour rond", objetrond);
      //Mat image = Utilities.readImage("Images/ref90.jpg");
      //Utilities.imShow("pannel 90", image);
      //Mat BW=Utilities.turnBW(image);
      //Utilities.imShow("pannel 90", BW);
      //Mat binary=Utilities.turnBinary(BW);
     // System.out.println( "mat = \n" + binary);
      //float result=Utilities.Matching2(ref, ref);
     // System.out.println( "match = \n" + result);

      
      
   }
}
