
package org.launchcode.skillstracker.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping(value="")
//    @RequestMapping(value = "displaySkills", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String displaySkills() {

        String html = "<h1>Skills Tracker </h1>" +
                "<h2>Some subtitle goes here </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;


    }

    @GetMapping(value = "form")
    @ResponseBody
    public String displayFormSkills(){
        String html="<form method='post'>" +
                "Name:<br><input type = 'text' name = 'name'/>" +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>";
        return html;
    }
    @PostMapping(value = "form")
    @ResponseBody
    public String namePage(@RequestParam String name){
        String html = "<h1> "+name+"</h1>";
        return html;

    }

}
