
/**
 * Write a description of class Yeet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
import java.net.URL;
public class Yeet
{

    public Yeet()
    { 
        Scanner input=new Scanner(System.in);
        try{
            URL url = new URL("http://lordbyng.net/compsci/quiz%20responses.csv");
            input=new Scanner(url.openStream());}
        catch(IOException ex){
            System.out.println("Yikes");
        }
        ArrayList<String> d=new ArrayList<String>();
        while(input.hasNext()){
            d.add(input.nextLine());}
            String[] s=d.get(1).split(",");
            for(int a=2;a<d.size()-2;a++){
                String[] C=d.get(a).split(",");
            int outOf=0;
            for(int b=1;b<C.length-1;b++){
            if(C[b].equals(s[b])){outOf++;}
            }
            System.out.println(C[0]+" "+outOf+"/8");
            }
    }

}

