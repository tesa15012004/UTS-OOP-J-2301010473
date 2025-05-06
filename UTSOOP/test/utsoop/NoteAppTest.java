/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package utsoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LAB F
 */
public class NoteAppTest {
    
    public NoteAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of tambahCatatan method, of class NoteApp.
     */
    @Test
    public void testTambahCatatan() {
        System.out.println("tambahCatatan");
        String catatan = "";
        NoteApp instance = new NoteApp();
        instance.tambahCatatan(catatan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tampilkanCatatan method, of class NoteApp.
     */
    @Test
    public void testTampilkanCatatan() {
        System.out.println("tampilkanCatatan");
        NoteApp instance = new NoteApp();
        instance.tampilkanCatatan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ubahCatatan method, of class NoteApp.
     */
    @Test
    public void testUbahCatatan() {
        System.out.println("ubahCatatan");
        int index = 0;
        String catatanBaru = "";
        NoteApp instance = new NoteApp();
        instance.ubahCatatan(index, catatanBaru);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hapusCatatan method, of class NoteApp.
     */
    @Test
    public void testHapusCatatan() {
        System.out.println("hapusCatatan");
        int index = 0;
        NoteApp instance = new NoteApp();
        instance.hapusCatatan(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
