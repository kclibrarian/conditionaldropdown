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
    private static List<Language> languages = new ArrayList<>();


    @GetMapping("")
    public Set<String> index(Model model) {
        Set<String> languages = Arrays.stream(Locale.getISOLanguages())
                .map(Locale::new)
                .map(Locale::getDisplayLanguage)
                .collect(Collectors.toCollection(TreeSet::new));
//        model.addAttribute("language", languageRepository.findAll());

        return languages;
    }

    @GetMapping("add")
    public String displayLanguageEventForm(Model model) {
        model.addAttribute("languages", languages);
        return "add";
    }

    @PostMapping("add")
    public String processAddLanguageForm(@RequestParam String languageName) {
        languages.add(new Language(languageName));
        return "redirect:";
    }
//    @PostMapping("add")
//    public String addLanguageForm(@RequestParam String languageName, @RequestParam String languageCode) {
//        languages.add(new Language(languageName));
//        return "redirect:";
//    }
}

