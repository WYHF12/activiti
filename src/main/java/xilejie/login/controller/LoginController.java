package xilejie.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {
//    @Resource(name = "sayWordsService")
//    private SayWordsService sayWordsService;

    @GetMapping("/doLogin")
    @ResponseBody
    public Map<String,String> doLogin(){
        Map<String,String> res = new HashMap<>();
        res.put("success","true");
//        String words = sayWordsService.doSayWords("hello!");
//        res.put("words",words);
        return res;
    }
}
