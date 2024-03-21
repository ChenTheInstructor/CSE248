package p2_other_assertions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import p2.Cat;

public class TesCat {

		@Test
		void testCats() {
			Cat c1 = new Cat("A", 1);
			Cat c2 = new Cat("A", 1);
			Cat c3 = null;
			assertEquals(c1,c2);
//			assertNotSame(c1, c2);
//			assertNotNull(c1);
//			assertNull(c3);
//			
//			char[] expected = {'h', 'e', 'l', 'l', 'o'};
//			char[] actual = "hello".toCharArray();
//			assertArrayEquals(expected, actual);
//			assertTrue(3 < 4);
//			assertFalse(3 > 4);
			
//			assertAll(
//					"heading",
//					() -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
//					() -> assertEquals("java", "Java".toLowerCase()),
//					() -> assertNull(c3)
//					);
		}
}
