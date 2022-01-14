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
public class HomeController<LanguageForm> {

    @Autowired
    private LanguageRepository languageRepository;
    private String languages;
    private static List<String> convertedLanguages = new ArrayList<>();
    static {
        convertedLanguages.add("English");
        convertedLanguages.add("German");
    }

    @GetMapping("/languages")
    public Set<String> index(Model model) {
        List<String> convertedLanguages = Arrays.asList(languages.split(",", -1));


        return (Set<String>) convertedLanguages;
    }

    @PostMapping("/languages")
    private String submitLanguage(@ModelAttribute("languageForm") LanguageForm languageForm, Model model) {
        model.addAttribute("data", languageForm.toString());

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

