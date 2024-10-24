import static org.junit.Assert.*;
import org.junit.Test;



public class Count8Test {
    
@Test
public void testCount1() {
//Test case
    assertEquals(1, Recurrsion.count8(8)); 

}
@Test
public void testCount2() {
//Test case
    assertEquals(2, Recurrsion.count8(88)); 

}
@Test
public void testCount3() {
//Test case
    assertEquals(2, Recurrsion.count8(81213128)); 

}
@Test
public void testCount4() {
//Test case
    assertEquals(5, Recurrsion.count8(818181818)); 

}
@Test
public void testCount5() {
//Test case
    assertEquals(0, Recurrsion.count8(0)); 

}
@Test
public void testCount6() {
    //Test case
        assertEquals(1, Recurrsion.countHi("hi")); 
    
    }
    @Test
    public void testCount7() {
        //Test case
            assertEquals(1, Recurrsion.countHi("hi")); 
        
        }
        @Test
        public void testCount8() {
            //Test case
                assertEquals(0, Recurrsion.countHi(null)); 
            
            }



}
