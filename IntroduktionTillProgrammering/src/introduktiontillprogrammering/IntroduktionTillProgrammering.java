
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
         reader = new BufferedReader (
        new InputStreamReader (System.in)); 
     newLine = "";
        UserText = "";
        one = new Counter();       
       
        
        
    }
        public void Reader()throws IOException{
            
            while(!newLine.contains("stop")){
            newLine = reader.readLine();
            if(!newLine.contains ("stop")){
                UserText = UserText+" "+newLine;
                
                one.IncreaseCount();
                one.Increasehar(newLine.length());
            }
        }
            one.text = UserText;
            one.LastRow = newLine;
            
          one.Checkforstop();
            System.out.print(one.rowCount);
            System.out.println(" rader" );
            System.out.print(one.textLength);
            System.out.println(" tecken");
            System.out.print(one.CountWords());
            System.out.println(" ord");
            System.out.print(one.LongWord());
            System.out.println(" är det längsta ordet");
            System.out.println(one.text);
        }
    }
    public static class Counter{
        int textLength;
        int rowCount;
       String text;
       String LastRow;
        public Counter(){
            textLength = 0;
            rowCount = 0;
            text = "";
            LastRow = "";
        }
        public void IncreaseCount(){
            rowCount++;
        }
        public void Increasehar(int length){
        textLength = textLength+length;    
        }
        public void Checkforstop(){
            for (int i=0; i < LastRow.length(); i++){
                if (LastRow.charAt(i)=='s'){
                    if (LastRow.charAt(i+1)=='t'){
                        if (LastRow.charAt(i+2)=='o'){
                            if (LastRow.charAt(i+3)=='p'){
                                String last=LastRow.substring(0,i);
                                text=text+" "+last;
                                textLength=textLength+last.length();
                                if (i!=0){
                                    rowCount++;
                                }
                            }
                        }
                    }
                }
            }
        }
        public int CountWords(){
            int wordCount=0;
            for (int i=0;i < text.length(); i++){
                if (text.charAt(i)==' '){
                    wordCount++;
                }
            }
            
            return wordCount;
        }
        public int getRow(){
            return rowCount;
        }
        public String LongWord(){
            String longWord="";
           String [] words = text.split(" ");
           for(int i=0; i < words.length;i++){
               if(words[i].length()>= longWord.length()){
                   longWord = words[i];
                   
               }
           }
            
            return longWord;
        }
        
        public int getChar(){
            return textLength;
        }
    }
}

