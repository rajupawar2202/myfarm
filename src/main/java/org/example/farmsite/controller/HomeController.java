package org.example.farmsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ResourcePatternResolver resourcePatternResolver;

    @GetMapping("/")
    public String index(Model model) {
        List<String> images = new ArrayList<>();
        try {
            Resource[] resources = resourcePatternResolver.getResources("classpath:/static/*.jpg");
            for (Resource resource : resources) {
                String filename = resource.getFilename();
                images.add("/" + filename);
            }
            images.sort(String::compareTo);
        } catch (IOException e) {
            // Log error or handle appropriately
            e.printStackTrace();
        }
        model.addAttribute("images", images);
        return "index";
    }

    @GetMapping("/photos")
    public String photos(Model model) {
        List<String> images = new ArrayList<>();
        try {
            Resource[] resources = resourcePatternResolver.getResources("classpath:/static/*.jpg");
            for (Resource resource : resources) {
                String filename = resource.getFilename();
                images.add("/" + filename);
            }
            images.sort(String::compareTo);
        } catch (IOException e) {
            // Log error or handle appropriately
            e.printStackTrace();
        }
        model.addAttribute("images", images);
        return "photos";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        List<String> images = new ArrayList<>();
        try {
            Resource[] resources = resourcePatternResolver.getResources("classpath:/static/*.jpg");
            for (Resource resource : resources) {
                String filename = resource.getFilename();
                images.add("/" + filename);
            }
            images.sort(String::compareTo);
        } catch (IOException e) {
            // Log error or handle appropriately
            e.printStackTrace();
        }
        model.addAttribute("images", images);

        return "contact";
    }
}
