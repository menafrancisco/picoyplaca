/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.data;

import java.sql.Time;
import static java.sql.Types.TIME;

/**
 *
 * @author Conexus Business
 */
public class Calendar {
    
  
  private int mondayRestriction[]; 
  private int tuesdayRestriction[]; 
  private int wendsdayRestriction[]; 
  private int thursdayRestriction[]; 
  private int fridayRestriction[]; 
  private int saturdayRestriction[]; 
  private int sundayRestriction[]; 
  
  private Time hourBegin1;
  private Time hourEnd1;
  
   private Time hourBegin2;
  private Time hourEnd2;

  public int[] getMondayRestriction() {
    return mondayRestriction;
  }

  public void setMondayRestriction(int[] mondayRestriction) {
    this.mondayRestriction = mondayRestriction;
  }

  public int[] getTuesdayRestriction() {
    return tuesdayRestriction;
  }

  public void setTuesdayRestriction(int[] tuesdayRestriction) {
    this.tuesdayRestriction = tuesdayRestriction;
  }

  public int[] getWendsdayRestriction() {
    return wendsdayRestriction;
  }

  public void setWendsdayRestriction(int[] wendsdayRestriction) {
    this.wendsdayRestriction = wendsdayRestriction;
  }

  public int[] getThursdayRestriction() {
    return thursdayRestriction;
  }

  public void setThursdayRestriction(int[] thursdayRestriction) {
    this.thursdayRestriction = thursdayRestriction;
  }

  public int[] getFridayRestriction() {
    return fridayRestriction;
  }

  public void setFridayRestriction(int[] fridayRestriction) {
    this.fridayRestriction = fridayRestriction;
  }

  public int[] getSaturdayRestriction() {
    return saturdayRestriction;
  }

  public void setSaturdayRestriction(int[] saturdayRestriction) {
    this.saturdayRestriction = saturdayRestriction;
  }

  public int[] getSundayRestriction() {
    return sundayRestriction;
  }

  public void setSundayRestriction(int[] sundayRestriction) {
    this.sundayRestriction = sundayRestriction;
  }

  public Time getHourBegin1() {
    return hourBegin1;
  }

  public void setHourBegin1(Time hourBegin1) {
    this.hourBegin1 = hourBegin1;
  }

  public Time getHourEnd1() {
    return hourEnd1;
  }

  public void setHourEnd1(Time hourEnd1) {
    this.hourEnd1 = hourEnd1;
  }

  public Time getHourBegin2() {
    return hourBegin2;
  }

  public void setHourBegin2(Time hourBegin2) {
    this.hourBegin2 = hourBegin2;
  }

  public Time getHourEnd2() {
    return hourEnd2;
  }

  public void setHourEnd2(Time hourEnd2) {
    this.hourEnd2 = hourEnd2;
  }


  
  
}
