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
        String copoEsperado = main.tipoCopo("SUCO DE UVA");
        
        //Assert
        Assert.assertTrue("Copo de plástico", true);
    }

    @Test
    public void testsSucoF(){
        Main main = new Main();
        //Arrange
        
        //Act
        String copoEsperado = main.tipoCopo("SUCO DE UVA");
        
        //Assert
        Assert.assertFalse("Copo de papel", false);
    }
    @Test
    public void testsRefri(){
        Main main = new Main();
        //Arrange
        
        //Act
        String copoEsperado = main.tipoCopo("COCA-COLA");
        
        //Assert
        Assert.assertTrue("Copo de papel", true);
    }
    @Test
    public void testsRefriF(){
        Main main = new Main();
        //Arrange
        
        //Act
        String copoEsperado = main.tipoCopo("COCA-COLA");
        
        //Assert
        Assert.assertFalse("Copo de plástico", false);
    }
    @Test
    public void testsTampaDeli(){
        Main main = new Main();
        //Arrange
        
        //Act
        String tampaEsperada = main.tipoTampa("Delivery");
        
        //Assert
        Assert.assertTrue("Tampa Take Out", true);
    }
    @Test
    public void testsTampaDeliF(){
        Main main = new Main();
        //Arrange
        
        //Act
        String tampaEsperada = main.tipoTampa("Delivery");
        
        //Assert
        Assert.assertFalse("Tampa Eat In", false);
    }
    @Test
    public void testsTampaRest(){
        Main main = new Main();
        //Arrange
        
        //Act
        String tampaEsperada = main.tipoTampa("Comer no Restaurante");
        
        //Assert
        Assert.assertTrue("Tampa Eat In", true);
    }
    @Test
    public void testsTampaRestF(){
        Main main = new Main();
        //Arrange
        
        //Act
        String tampaEsperada = main.tipoTampa("Comer no Restaurante");
        
        //Assert
        Assert.assertFalse("Tampa Take Out", false);
    }
}
