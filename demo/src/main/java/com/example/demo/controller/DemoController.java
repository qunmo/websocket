package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author wsq
 *
 */
@RestController
public class DemoController {

	/*
	 * @GetMapping("index") public ResponseEntity<String> index(){ return
	 * ResponseEntity.ok("请求成功"); }
	 */

    @GetMapping("login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
    @GetMapping("siliao")
    public ModelAndView siliao(){
        return new ModelAndView("siliao");
    }
    @GetMapping("qunliao")
    public ModelAndView page(){
        return new ModelAndView("qunliao");
    }
	/*
	 * @RequestMapping("/push/{toUserId}") public ResponseEntity<String>
	 * pushToWeb(String message, @PathVariable String toUserId) throws IOException {
	 * WebSocketServer.sendInfo(message,toUserId); return
	 * ResponseEntity.ok("MSG SEND SUCCESS"); }
	 */
}
