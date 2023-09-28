package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String initialDisplay(){
        return "<h1>Skills Tracker\n" +
                "        <h2>We have a few skills we would like to learn. Here is the list!\n" +
                "            <ol>\n" +
                "                <li>Java</li>\n" +
                "                <li>JavaScript</li>\n" +
                "                <li>Python</li>\n" +
                "            </ol>\n" +
                "        </h2>\n" +
                "    </h1>";
    }

    @GetMapping("/form")
    public String handleForm(){
        return "<form action='/form' method='post'>\n" +
                "    <label> Name:<br>" +
                "        <input type='text' name='name' /><br>" +
                "        My favorite language:<br> "+
                "        <select name='language1'> " +
                "            <option value='java'>Java</option>\n" +
                "            <option value='javascript'>JavaScript</option>\n" +
                "            <option value='python'>Python</option>\n" +
                "        </select><br>" +
                "        My second favorite language:<br>" +
                "        <select name='language2'>\n" +
                "            <option value='java'>Java</option>\n" +
                "            <option value='javascript'>JavaScript</option>\n" +
                "            <option value='python'>Python</option>\n" +
                "        </select><br>" +
                "        My third favorite language:<br>" +
                "        <select name='language3'>\n" +
                "            <option value='java'>Java</option>\n" +
                "            <option value='javascript'>JavaScript</option>\n" +
                "            <option value='python'>Python</option>\n" +
                "        </select><br>" +
                "    </label>\n" +
                "    <input type='submit' value='Submit'/>\n" +
                "</form>";
    }

    @PostMapping("/form")
    public String submitForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 +"</li>" +
                "<li>" + language2 +"</li>" +
                "<li>" + language3 +"</li>" +
                "</ol>";
    }
}
