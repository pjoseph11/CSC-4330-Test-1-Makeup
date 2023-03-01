public class Question16{
   public static void main(String[] args){
   String str = "/* Line one of comment\nline two of comment\nline three of comment */";
   System.out.println(str);
   if (str.startsWith("/*") && str.endsWith("*/")){
      System.out.println("True");
   }
   else{
      System.out.println("False");
   }
   }
}