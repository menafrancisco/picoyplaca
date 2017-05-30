/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import picoplaca.data.auto;
import picoplaca.data.restrictionAprovedQuito2016;

/**
 *
 * @author Conexus Business
 */
public class PicoPlaca {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    Scanner read = new Scanner(System.in);
    auto a = new auto();
    a.setCalendarRestriction(new restrictionAprovedQuito2016());

    System.out.println("Enter your car plate:");
    String plate = read.next();
    while (!a.validateFormatPlate(plate)) {
      System.out.println("The format plate is not correct, enter this again");
      plate = read.next();
    }

    System.out.println("Enter the day of the week you want to analyze Ex: monday, tuesday, .... :");
    String day = read.next();
    while (!a.validateFormatDay(day)) {
      System.out.println("The format of the day of the week is not correct, enter this again");
      day = read.next();

    }

    System.out.println("Enter the hour to analiza Ex: 9:00, 17:45 :");
    String hour = read.next();
    while (!a.validateFormatHour(hour)) {
      System.out.println("The format hour is not correct, enter this again");
      hour = read.next();

    }
    Time t= a.convertStringToTime(hour);
    
    try {
      if (a.validate(plate, day, t)) {
        System.out.println("The plate has restriction");
      } else {
        System.out.println("The plate has no restriction");
      }
    } catch (Exception ex) {
      System.out.println(ex.fillInStackTrace());
      Logger.getLogger(PicoPlaca.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

}
