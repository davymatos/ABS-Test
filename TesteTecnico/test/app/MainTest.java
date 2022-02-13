/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davym
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testsSuco(){
        Main main = new Main();
        //Arrange
        

        //Act
        String copoEsperado = main.tipoCopo("Suco de Uva");
        
        //Assert
        Assert.assertTrue("Copo de plástico", true);
    }
}
