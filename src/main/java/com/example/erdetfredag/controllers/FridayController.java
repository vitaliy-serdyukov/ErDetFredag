package com.example.erdetfredag.controllers;
import com.example.erdetfredag.services.DayWeekCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FridayController {
  @GetMapping("/isthisfriday")
  public String showResult() {
    DayWeekCalculator calculator = new DayWeekCalculator();
    if (calculator.calculateDayOfWeek() == 5) {
      return "Yes!!! Today is Friday";
    } else {
      return "No, unfortunatelly it is not Friday yet ... :(";
    }
  }


 @GetMapping("/weekdaynumber")
  public String showDayNumber() {
   DayWeekCalculator calculator = new DayWeekCalculator();

      return "today is day of the week number " + calculator.calculateDayOfWeek() +  " and the date is " +
          calculator.getToday();

    }


}
