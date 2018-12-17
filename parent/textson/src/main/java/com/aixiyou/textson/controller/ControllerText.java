package com.aixiyou.textson.controller;



import com.aixiyou.textson.pojo.Text;
import com.aixiyou.textson.service.DaoService;
import com.aixiyou.texttext.service.ServiceText;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerText {
    @Autowired
    private DaoService daoService;

    @RequestMapping("get")
    public String  getht(){
        return "first";
    }

    @RequestMapping("te")
    @ResponseBody
    public String ge(){
        Text text = new Text();
        text.setId(1);
        text.setName("121212");
        return JSON.toJSONString(text);
    }

    @RequestMapping("show")
    public String  getshow(){
        return "show";
    }
    @RequestMapping("/getget")
    public String getget(String name, String pwd, Model model){
        System.out.println(1);
        if (daoService.gettext(name,pwd) == null){
            model.addAttribute("cuo","cuo");
            return "first";
        }else {
            model.addAttribute("hao",daoService.gettext(name,pwd));
            return "show";
        }
    }
}
