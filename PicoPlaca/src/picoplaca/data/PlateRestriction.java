/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.data;

import java.sql.Time;

/**
 *
 * @author Conexus Business
 */
public interface PlateRestriction  {
  public boolean validate(String plate, String Date, Time time ) throws Exception;
  
 
  
}
