package p5_mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Mockito_Test {
	
@Mock
Database database;

	@Test
	void testGetUser() {
		when(database.getUser(1)).thenReturn(new User("John Doe"));
		UserService service = new UserService(database);
		User user = service.getUser(1);
		assertEquals("John Doe", user.getName());
		
	}

}
