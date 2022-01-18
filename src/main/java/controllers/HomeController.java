package controllers;

import data.LanguageRepository;
import models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping("language")
public class HomeController {

    @Autowired
    private LanguageRepository languageRepository;
    private String languages;

    private static List<String> languageList;
    static {
        languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("German");
    }

    @GetMapping("")
    private String getLanguageForm(Model model, List<String> languageList) {
        model.addAttribute("languageList", languageList);
        return "languageform";
    }

    @PostMapping("")
    private String submitLanguage(@ModelAttribute("language") Language language, Model model) {
        model.addAttribute("data", language.toString());
        return "success";
    }

//    @GetMapping("add")
//    public String displayLanguageEventForm(Model model) {
//        model.addAttribute("languages", languages);
//        return "add";
//    }
//
//    @PostMapping("/addlanguages")
//    public String addLanguage(@RequestParam String language, Model model) {
//
//        return "addlanguages";
//    }
//
//    @PostMapping("add")
//    public String processAddLanguageForm(@RequestParam String languageName) {
//        languages.add(new Language(languageName));
//        return "redirect:";
//    }
//    @PostMapping("add")
//    public String addLanguageForm(@RequestParam String languageName, @RequestParam String languageCode) {
//        languages.add(new Language(languageName));
//        return "redirect:";
//    }
}

