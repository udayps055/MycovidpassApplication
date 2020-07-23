package com.covid.Mycovidpass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/register")
    public String getregister(Model model) {
        model.addAttribute("register", new d1());
        return "register";
    }
    @PostMapping("/register")
    public String registeruser(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
                               @RequestParam("email") String email, @RequestParam("password") String password,
                               @RequestParam("cpassword") String cpassword, @RequestParam("pnumber") Long pnumber,
                               HttpServletRequest req) {
        if (!password.equals(cpassword)) {
            return "redirect:/result";
        }
        else {
            d2 n = new d2();
            n.setFname(fname);
            n.setLname(lname);
            n.setEmail(email);
            n.setPassword(password);
            n.setPnumber(pnumber);
            userRepo.save(n);
            return "redirect:/login";
        }
    }

    @GetMapping("/login")
    public String getlogin(Model model) {
        model.addAttribute("login", new d3());
        return "login";
    }
    @PostMapping("/login")
    public String getlogin(@RequestParam("pnumber") String pnumber,
                           @RequestParam("password") String password, HttpServletRequest req) {

        d2 obj = userRepo.findById(Long.parseLong(pnumber));
        if (obj.getPassword().equals(password)) {
            return "redirect:/main";
        }
        else {
            return "redirect:/login";
        }
        /*System.out.println(obj.getPassword().equals(password));
        System.out.println(password + ' ' + pnumber);
        return "redirect:/main";*/
    }
    @GetMapping("/result")
    public String getres(Model model) {
        return "result";
    }

    @PostMapping("/result")
    public String rediuse(HttpServletRequest req) {
        return "redirect:/register";
    }

    @GetMapping("/main")
    public String getmain(Model model) {
        model.addAttribute("main", new d4());
        return "main";
    }

    @PostMapping("/main")
    @ResponseBody
    public String getdets(@RequestParam("source") String source,
                          @RequestParam("destination") String destination, HttpServletRequest req) {
        System.out.println(source + ' ' + destination);
        return "OK";
    }
}