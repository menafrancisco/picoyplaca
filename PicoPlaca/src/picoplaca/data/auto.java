/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.data;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author Conexus Business
 */
public class auto {

  private String model;
  private user owner;
  private String plate;

  private PlateRestriction plateRestriction;

  public auto() {
  }

  public boolean validate(String plate, String date, Time time) throws Exception {

    if (plateRestriction == null) {
      throw new Exception("The object is not initialize (type of restriction) ");
    }
    return plateRestriction.validate(plate, date, time);
  }

  public boolean validateFormatPlate(String plate) {
    String plateRegexp = "^([A-Z]{3}-\\d{3,4})$";
    return (Pattern.matches(plateRegexp, plate));

  }

  public boolean validateFormatDay(String day) {
    String dayRegexp = "\\b(monday|tuesday|wednesday|thursday|friday|saturday|sunday)\\b";
    return (Pattern.matches(dayRegexp, day));

  }

  public boolean validateFormatHour(String hour) {
    String hourRegexp = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
    return (Pattern.matches(hourRegexp, hour));

  }
  
  public Time convertStringToTime(String hour){
    DateFormat df = new SimpleDateFormat("hh:mm");
    Date apptDay = null;
    try {
      apptDay = (Date) df.parse(hour);
    } catch (ParseException e) {
      System.out.println("Please enter a valid date! Format is hh:mm");
    }
    
    return new Time(apptDay.getTime());
  }

  public void setCalendarRestriction(PlateRestriction rs) {
    plateRestriction = rs;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public user getOwner() {
    return owner;
  }

  public void setOwner(user owner) {
    this.owner = owner;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

}
