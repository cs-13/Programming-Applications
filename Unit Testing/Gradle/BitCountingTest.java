import org.junit.Assert.assertEquals;
import org.junit.Test;


public class BitCountingTest {
	
		@Test
		public void test0(){
		 assertEquals(5, BitCounting.countBits(1234)); 
    	 assertEquals(1, BitCounting.countBits(4)); 
    	 assertEquals(3, BitCounting.countBits(7)); 
   		 assertEquals(2, BitCounting.countBits(9)); 
   		 assertEquals(2, BitCounting.countBits(10)); 
		}
		
		@Test
		public void test1(){
		 assertEquals(4, BitCounting.countBits(15)); 	
		}
		
		
		@Test
		public void test2(){
		assertEquals(2, BitCounting.countBits(3)); 
		}
		
		@Test
		public void test3(){
		assertEquals(2, BitCounting.countBits(6)); 
		}
		
}