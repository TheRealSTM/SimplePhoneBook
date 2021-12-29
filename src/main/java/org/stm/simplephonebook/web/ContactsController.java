package org.stm.simplephonebook.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.stm.simplephonebook.model.Contact;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/contacts")
public class ContactsController {
    @PostMapping
    public String processContact(@Valid Contact contact, Errors errors) {
        if (errors.hasErrors()) {
            return "addContact";
        }

        log.info("New contact was received: {}", contact);

        return "redirect:/";
    }

    @GetMapping("/add")
    public String addContact(Model model) {
        model.addAttribute("contact", new Contact());
        return "addContact";
    }

}
