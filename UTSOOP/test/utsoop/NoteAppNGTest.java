/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package utsoop;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author LAB F
 */
public class NoteAppNGTest {
    
    public NoteAppNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
