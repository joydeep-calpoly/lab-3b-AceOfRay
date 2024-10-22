package lab_3b_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import lab_3b.Database;
import lab_3b.Service;

public class ServiceTests {
    
    @Test
    void getDatabaseIDTest() {
        Database mockDB = Mockito.mock(Database.class);
        Mockito.when(mockDB.getUniqueId()).thenReturn(123);
        Service s = new Service(mockDB);
        assertEquals("Using database with id: 123", s.getDatabaseID());
        
    }
}
