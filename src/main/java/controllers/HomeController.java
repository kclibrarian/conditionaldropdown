package controllers;

import data.LanguageRepository;
import models.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("language")
public class HomeController {

    @Autowired
    private LanguageRepository languageRepository;
    private static List<Language> languages = new ArrayList<>();

    @GetMapping("")
    @ModelAttribute("languages") //vs model.addattribute?
    public List<Language> index(Model model) {
        List<Language> list = new ArrayList<Language>();
        list.add(new Language("English"));
        list.add(new Language("Spanish"));
        list.add(new Language("Arabic"));

        return list;
    }

    @GetMapping("add")
    public String displayLanguageEventForm(Model model) {
        model.addAttribute("title", "Language");

        model.addAttribute("language", new Language());
        return "add";
    }

    @PostMapping("add")
    public String processAddLanguageForm(@RequestParam String languageName) {
        languages.add(new Language(languageName));
        return "redirect:";
    }
    @PostMapping("add")
    public String addLanguageForm(@RequestParam String languageName, @RequestParam String languageCode) {
        languages.add(new Language(languageName));
        return "redirect:";
    }
}

