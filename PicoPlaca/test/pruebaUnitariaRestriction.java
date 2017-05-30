/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import picoplaca.data.auto;
import picoplaca.data.restrictionAprovedQuito2016;

/**
 *
 * @author Conexus Business
 */
public class pruebaUnitariaRestriction {

  public pruebaUnitariaRestriction() {
  }
  
  auto a;

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
    a= new auto();
    a.setCalendarRestriction(new restrictionAprovedQuito2016());
  }

  @After
  public void tearDown() {
  }

  // TODO add test methods here.
  // The methods must be annotated with annotation @Test. For example:
  //
  @Test
  public void testValidate() throws Exception {
    boolean esperado= false;
    boolean resultado = a.validate("ABC-10", "monday", new Time(8,0,0));
    assertEquals(esperado, resultado);
  }
  
  @Test
  public void testValidatePlate() throws Exception {
    boolean esperado= false;
    boolean resultado = a.validateFormatPlate("ABC-10");
    assertEquals(esperado, resultado);
  }
  
  @Test
  public void testValidateDay() throws Exception {
    boolean esperado= false;
    boolean resultado = a.validateFormatDay("mondayy");
    assertEquals(esperado, resultado);
  }
  
  @Test
  public void testValidatHour() throws Exception {
    boolean esperado= true;
    boolean resultado = a.validateFormatHour("8:00");
    assertEquals(esperado, resultado);
  }
  
  
  
}
