package controllers.time;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
@RequestMapping("time")
public class TimeController {
    @GetMapping("/")
    public String getTimeForm() {
        return "time/index";
    }
    @GetMapping("/worldclock")
    public String getTimeZone(@RequestParam(required = false,defaultValue = "Asia/Ho_Chi_Minh") String city, Model model) {
        Date date = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        // Calculate the current time in the specified city
        long locale_time = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        // Reset the date by locale_time
        date.setTime(locale_time);
        // Set the data sent to the view
        model.addAttribute("city", city);
        model.addAttribute("date", date);
        return "time/index";
    }
}
