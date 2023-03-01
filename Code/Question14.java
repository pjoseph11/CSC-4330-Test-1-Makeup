import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question14 {
   public static void main(String[] args) {
   try {
         Scanner scanner = new Scanner(new File("Q14phrases.txt"));
         // scanner to read in lines from a text files
			while (scanner.hasNextLine()) {
				String floatTerm = scanner.nextLine();
            System.out.println(floatTerm);
            System.out.println(floatLit(floatTerm));
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}   
   }
   //regex to match float types
   public static boolean floatLit(String floatTerm){
      String status;
	   String strID = "^(aa|bb|(ab|ba)(aa|bb)*(ba|ab))*(b|(ab|ba)(bb|aa)*a)[cd]*$";
		Pattern patID = Pattern.compile(strID);
	   Matcher matcherID = patID.matcher(floatTerm);
	   boolean matchFoundID = matcherID.find(); 
	   if(matchFoundID) {
         return true;
	   } else{
         return false;
      }
   }
}
