import java.util.*;
public class Arrays {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>ref=new ArrayList<Integer>();
        ArrayList<String>str=new ArrayList<String>();
        while(!sc.hasNextInt()){
            String checker=sc.next();
            if(!checker.equals("End"))
            {
                str.add(checker);
            }
            else{
                break;
            }
        }
        while(sc.hasNextInt()){
            ref.add(sc.nextInt());
            }
            System.out.println(ref+"REF");
            System.out.println(str+"String");
    }   
}
