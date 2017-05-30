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
public class restrictionAprovedQuito2016 implements PlateRestriction {

  Calendar c;

  public restrictionAprovedQuito2016() {
    c = new Calendar();

    int array1[] = {1, 2};
    c.setMondayRestriction(array1);
    int array2[] = {3, 4};
    c.setTuesdayRestriction(array2);
    int array3[] = {5, 6};
    c.setWendsdayRestriction(array3);
    int array4[] = {7, 8};
    c.setThursdayRestriction(array4);
    int array5[] = {9, 0};
    c.setFridayRestriction(array5);
    c.setSaturdayRestriction(null);
    c.setSundayRestriction(null);

    c.setHourBegin1(new Time(7, 0, 0));
    c.setHourEnd1(new Time(9, 30, 0));
    c.setHourBegin2(new Time(16, 0, 0));
    c.setHourEnd2(new Time(19, 30, 0));

  }

  @Override
  public boolean validate(String plate, String date, Time time) throws Exception {
    int lastdigit = Integer.parseInt(plate.substring(plate.length() - 1));

    int numberDay = getNumberDay(date);
    if (numberDay < 0) {
      throw new Exception("The day is not correct!");
    }

    int array[]=null;
        
    switch (numberDay) {
      case 0:
        array=c.getMondayRestriction();
        break;
      case 1:
        array=c.getTuesdayRestriction();
        break;
      case 2:
        array=c.getWendsdayRestriction();
        break;
      case 3:
        array=c.getThursdayRestriction();
        break;
      case 4:
        array=c.getFridayRestriction();
        break;
      case 5:
        array=c.getSaturdayRestriction();
        break;
      case 6:
        array=c.getSundayRestriction();
        break;
          

    }
    
    boolean flag=false;
    
    for (int i = 0; i < array.length-1; i++) {
      if(lastdigit==array[i])
        flag=true;        
    }
    
    if(flag){

      if(time.after(c.getHourBegin1()) && time.before(c.getHourEnd1())  ){
//        System.out.println("Esta en el primer rango de restriccion");
        return true;
      }
      
      if(time.after(c.getHourBegin2()) && time.before(c.getHourEnd2())  ){
//        System.out.println("Esta en el segundo rango de restriccion");
        return true;
      }      
      
    }

    return false;
  }

  public int getNumberDay(String day) {

    if (day.equals("monday")) {
      return 0;
    }
    if (day.equals("tuesday")) {
      return 1;
    }
    if (day.equals("wednesday")) {
      return 2;
    }
    if (day.equals( "thursday")) {
      return 3;
    }
    if (day.equals("friday")) {
      return 4;
    }
    if (day.equals("saturday")) {
      return 5;
    }
    if (day.equals("sunday")) {
      return 6;
    }

    return -1;
  }

}
