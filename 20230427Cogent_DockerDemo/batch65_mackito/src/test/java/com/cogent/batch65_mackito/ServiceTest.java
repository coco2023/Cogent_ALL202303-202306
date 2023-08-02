package com.cogent.batch65_mackito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@Ignore("")
@ExtendWith(MockitoExtension.class)                         
class ServiceTest {

    @Mock      //used to create clone object or Mock Object
    Database databaseMock; // cloned Object or Mock                                

   // @Ignore
    @Test
    public void testQuery()  {
    	System.out.println("Hi im there");
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);  //  when and then
        Service t  = new Service(databaseMock);             
        boolean check = t.query("Guangjian");                
        //assertTrue(check);
        assertEquals(check, true);
    }
    

    
    
    // @AfterAll methods must have a void return type, must not be private, and must be static by default.
    @AfterAll
    public static void afterMethod() {
    	System.out.println("After all the test cases");
    }
    
    
    @BeforeAll
    public static void beforeMethod() {
    	System.out.println("before all the test cases");
    }
    
    
    @Test
    public void hi() {
    	System.out.println("test case 2");
    }
    
    
}

