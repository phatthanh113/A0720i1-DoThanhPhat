package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class DictionaryController {
    static Map<String, String> dictionary = new HashMap();
    static {
        dictionary.put("dog", "con chó");
        dictionary.put("cat", "con mèo ");
        dictionary.put("egg", "quả trứng");
        dictionary.put("bird", "con chim");
        dictionary.put("tiger", "con hổ");
    }

    @GetMapping(value = "/search")
    public ModelAndView viewSearch() {
        return new ModelAndView("dictionary");
    }

    @PostMapping(value = "/search")
    public String search(@RequestParam String word, Model model) {
        String english = word.trim().toLowerCase();
        String vietnamese = dictionary.get(english);
        model.addAttribute("english", english);
        String result = vietnamese != null ? vietnamese : "không tìm thấy từ này" ;
        model.addAttribute("vietnamese",result);
        return  "dictionary";
    }
}
