package cn.sx.Main.controller;


import cn.sx.Main.annotation.MultiRequestBody;
import cn.sx.Main.domain.Dog;
import cn.sx.Main.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Controller Demo
 *
 * @author Wangyang Liu
 * @date 2018/08/27
 */
@Controller
@RequestMapping("/xhr/test")
public class DemoController {


  @RequestMapping("/testStr")
  @ResponseBody
  public String multiRequestBodyDemo1(@MultiRequestBody String test1, @MultiRequestBody String test2) {

    System.out.println(test1 + "-->" + test2);
    return "";
  }

  @RequestMapping("/testChar")
  @ResponseBody
  public String multiRequestBodyDemo1(@MultiRequestBody char id) {

    System.out.println(id);
    return "";
  }

  @RequestMapping("/demo")
  @ResponseBody
  public String multiRequestBodyDemo1(@MultiRequestBody Dog dog, @MultiRequestBody User user) {
    System.out.println(dog.toString() + user.toString());
    return dog.toString() + ";" + user.toString();
  }


  @RequestMapping("/demo2")
  @ResponseBody
  public String multiRequestBodyDemo2(@MultiRequestBody("dog") Dog dog, @MultiRequestBody User user) {
    System.out.println(dog.toString() + user.toString());
    return dog.toString() + ";" + user.toString();
  }

  @RequestMapping("/demo3")
  @ResponseBody
  public String multiRequestBodyDemo3(@MultiRequestBody("dog") Dog dog, @MultiRequestBody("user") User user) {
    System.out.println(dog.toString() + user.toString());
    return dog.toString() + ";" + user.toString();
  }

  @RequestMapping("/demo4")
  @ResponseBody
  public String multiRequestBodyDemo4(@MultiRequestBody("dog") Dog dog, @MultiRequestBody Integer age) {
    System.out.println(dog.toString() + age.toString());
    return dog.toString() + ";age属性为：" + age.toString();
  }


  @RequestMapping("/demo5")
  @ResponseBody
  public String multiRequestBodyDemo5(@MultiRequestBody("color") String color, @MultiRequestBody("age") Integer age) {
    return "color=" + color + "; age=" + age;
  }

  @RequestMapping("/demo6")
  @ResponseBody
  public String multiRequestBodyDemo6(@MultiRequestBody("dog") Dog dog, @MultiRequestBody Integer age) {
    System.out.println(dog.toString() + age.toString());
    return dog.toString() + ";age属性为：" + age.toString();
  }


  @RequestMapping("/demo7")
  @ResponseBody
  public String multiRequestBodyDemo7(@MultiRequestBody(required = false) Dog dog, @MultiRequestBody("age") Integer age) {
    return "dog=" + dog + "; age=" + age;
  }


  @RequestMapping("/demo10")
  @ResponseBody
  public String multiRequestBodyDemo10(@MultiRequestBody(parseAllFields = false, required = false) Dog dog) {
    return dog.toString();
  }

  @RequestMapping("/demo99")
  @ResponseBody
  public String multiRequestBodyDemo99(@MultiRequestBody(parseAllFields = false, required = false) Character demo) {
    return demo.toString();
  }

  @RequestMapping("/testList")
  @ResponseBody
  public String multiRequestBodyDemo1(@MultiRequestBody List test, @MultiRequestBody String str) {

    return test.toString() + str;
  }
}
