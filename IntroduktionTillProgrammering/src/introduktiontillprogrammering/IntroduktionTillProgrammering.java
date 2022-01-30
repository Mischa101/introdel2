
package introduktiontillprogrammering;
import java.io.*;


public class IntroduktionTillProgrammering {


    public static void main(String[] args)
            throws IOException
    {
     
        System.out.println("Hello, lets get down to buisness");
      
        ReadInWriteOut run = new ReadInWriteOut(); 
       
        run.Reader();
      
    }
    public static class ReadInWriteOut{
     BufferedReader reader;
     String newLine;
        String UserText;
        Counter one;
        public ReadInWriteOut(){
         this.reader = new BufferedReader (
        new InputStreamReader (System.in)); 
     this.newLine = "";
        this.UserText = "";
        this.one = new Counter();       
       
        
        
    }
        public void Reader()throws IOException{
            
            while(!newLine.contains("stop")){
            newLine = reader.readLine();
            if(!newLine.contains ("stop")){
                UserText = UserText+newLine;
                this.one.IncreaseCount();
                this.one.Increasehar(newLine.length());
            }
        }
            System.out.print(one.rowCount);
            System.out.println(" rader" );
            System.out.print(one.textLength);
            System.out.println(" tecken");
        }
    }
    public static class Counter{
        int textLength;
        int rowCount;
        public Counter(){
            this.textLength = 0;
            this.rowCount = 0;
        }
        public void IncreaseCount(){
            rowCount++;
        }
        public void Increasehar(int length){
        textLength = textLength+length;    
        }
        public int getRow(){
            return rowCount;
        }
        public int getChar(){
            return textLength;
        }
    }
}

