/*
   holds a bunch of colors
   for convenience
*/

import java.util.ArrayList;
import java.nio.FloatBuffer;

public class Colors {

   private static ArrayList<Triple> standardColors = init();

   private static ArrayList<Triple> init() {
      ArrayList<Triple> colors = new ArrayList<Triple>();

      colors.add( new Triple( 1, 0, 0 ) );  // 0 = red
      colors.add( new Triple( 0, 1, 0 ) );  // 1 = green
      colors.add( new Triple( 0, 0, 1 ) );  // 2 = blue
      colors.add( new Triple( 1, 1, 0 ) );  // 3 = yellow
      colors.add( new Triple( 1, 0, 1 ) );  // 4 = magenta
      colors.add( new Triple( 0, 1, 1 ) );  // 5 = cyan
      colors.add( new Triple( 1, 0.5, 0 ) );  // 6 = orange
      colors.add( new Triple( 1, 0, 0.5 ) );  
      colors.add( new Triple( 0, 1, 0.5 ) );  
      colors.add( new Triple( 0.5, 1, 0 ) );  
      colors.add( new Triple( 0.5, 0, 1 ) );  
      colors.add( new Triple( 0, 0.5, 1 ) );  

      colors.add( new Triple( .51, 1.0, 0.92 ) );  // 12= pale green

      return colors;
   }

   public static void sendData( int k, FloatBuffer buffer ) {
       standardColors.get(k).sendData( buffer );
   }

}
