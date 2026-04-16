package com.library;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    @Test
    public void testNoFine() {
        double fine = App.calculateFine(10);
        assertEquals(0.0, fine, 0.001);
    }
    @Test
    public void testNoFineAtLimit() {
        double fine = App.calculateFine(14);
        assertEquals(0.0, fine, 0.001);
    }
    @Test
    public void testFineOneExtraDay() {
        double fine = App.calculateFine(15);
        assertEquals(2.0, fine, 0.001);
    }
    @Test
    public void testFineFiveExtraDays() {
        double fine = App.calculateFine(19);
        assertEquals(10.0, fine, 0.001);
    }
    @Test
    public void testStatusOnTime() {
        String status = App.getBorrowingStatus(7);
        assertEquals("ON TIME", status);
    }
  
}
