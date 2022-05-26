import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
		@Test
		public void testAdd() {
			//Arrange
			int a = 10;
			int b = 2;
			
			//Act
			Calculator cal = new Calculator();
			int actualadd = cal.add(a, b); 
			

			//Assert	 
			int expected= 12;
			assertEquals (expected, actualadd);
			
			}
		@Test
		public void testSubtract() {
			//Arrange
			int a = 10;
			int b = 2;
			
			//Act
			Calculator cal = new Calculator();
			int actualsub = cal.sub(a, b);
			
            //Assert
			int expected = 8;
			assertEquals (expected, actualsub);
			
		}
		@Test 
		public void testMutiple() {
			//Arrange
			int a = 10;
			int b = 2;
			
			//Act
			Calculator cal = new Calculator();
			int actualmul = cal.mul(a, b);
			
			//Assert
			int expectedmul = 20;
			assertEquals (expectedmul, actualmul);
		}
		@Test 
		public void testDivide() {
			//Arrange
			int a = 10;
			int b = 2;
			
			//Act
			Calculator cal = new Calculator();
			int actualdiv = cal.div(a, b);
			
			//Assert
			int expected= 5;
			assertEquals (expected, actualdiv);
			
			
		}
		

	}


