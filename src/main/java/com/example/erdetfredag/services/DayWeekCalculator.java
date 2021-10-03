package com.example.erdetfredag.services;

import java.time.LocalDate;

public class DayWeekCalculator {

  private final LocalDate today = LocalDate.now();
  private final int q = getDay(); // day of the month
  private final int m = getMonth(); // month number
  private final int j = getCentury(); // amount of centuries (completed)
  private final int k = getYearOfCentury(); // year of the current century
  private final int tempVar = calculateTempVar(); // temporary variable
  private final int dayOfTheWeek = calculateDayOfWeek(); // temporary variable

  public LocalDate getToday() {
    return today;
  }


  public int getDay(){
    return today.getDayOfMonth();}

  public int getMonth (){
    return today.getMonthValue();}

  public int getCentury (){
    return (today.getYear() / 100);
  }

  public int getYearOfCentury (){
    return (today.getYear() % 100);}

  public int calculateTempVar(){
    return (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
  }

  public int calculateDayOfWeek(){return ((tempVar + 5) % 7) + 1;
  }
}


