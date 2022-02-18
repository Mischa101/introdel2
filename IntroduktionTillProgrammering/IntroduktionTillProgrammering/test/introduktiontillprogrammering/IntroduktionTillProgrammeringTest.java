/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package introduktiontillprogrammering;

import introduktiontillprogrammering.IntroduktionTillProgrammering.Counter;
import introduktiontillprogrammering.IntroduktionTillProgrammering.ReadInWriteOut;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uza_8
 */
public class IntroduktionTillProgrammeringTest {
    
    public IntroduktionTillProgrammeringTest() {
    }

    /**
     * Test of main method, of class IntroduktionTillProgrammering.
     */
    @Test
    public void testMain() throws Exception {
    }
    @Test
    public void testCounter(){
        Counter a = new Counter();
        int expectednum = 0;
        String expectedstring = "";
        assertEquals(expectednum,a.rowCount);
        assertEquals(expectednum,a.textLength);
        assertEquals(expectedstring,a.LastRow);
        assertEquals(expectedstring,a.text);
    }
    @Test
    public void testIncreaseCount(){
        Counter a = new Counter();
        int expected = 1;
        a.IncreaseCount();
        assertEquals(expected,a.rowCount);
    }
    @Test
    public void testIncreasehar(){
        Counter a = new Counter();        
        int expected = 5;
        a.Increasehar(5);
        assertEquals(expected,a.textLength);
    }
    @Test
    public void testCheckforstopwhenonlystop(){
        Counter a = new Counter();
        Counter b = new Counter();
        int expecteda = 0;
        int expectedb = 1;
        a.LastRow = "stop";
        b.LastRow = "now stop";
        a.Checkforstop();
        b.Checkforstop();
        assertEquals(expecteda,a.rowCount);
        assertEquals(expectedb,b.rowCount);
    }
    @Test
    public void testCountWords(){
        Counter a = new Counter();        
        int expected = 5;
        a.text = " example text with five words";
        assertEquals(expected,a.CountWords());
    }
    @Test
    public void testLongWords(){
        Counter a = new Counter();        
        String expected = "Honorificabilitudinitatibus";
        a.text = "the longest word will be: Honorificabilitudinitatibus";
        assertEquals(expected,a.LongWord());
    }
    @Test
    public void testReadInWriteOut(){
        ReadInWriteOut a=new ReadInWriteOut();
        //BufferedReader expectedreader= new BufferedReader (new InputStreamReader (System.in));
        String expectednewLine= "";
        String expectedUserText= "";
        //Counter expectedcounter= new Counter();
        //assertEquals(expectedreader,a.reader);
        assertEquals(expectednewLine,a.newLine);
        assertEquals(expectedUserText,a.UserText);
        //assertEquals(expectedcounter,a.one);
    }
   
}
