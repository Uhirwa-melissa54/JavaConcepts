import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("rca");
        Matcher m=p.matches("rca");
        boolean res=m.find();
        System.out.println(res);
        //there is other way but i did not write that because of teacher was rushing.................
        System.out.println(Pattern.matches("[amn]", 'a'));//it means any character that matches

         Pattern p1=Pattern.compile("\\d+");
        Matcher m1=p.matcher("123gghthth897");//this returns false
        while(m1.find()){
            System.out.println(m.group());//it will return 123 and 897
        }
         Pattern p2Pattern=Pattern.compile("^L\\w+\\d+$");
        Matcher m2=p.matcher("Larisse123");

    }
}