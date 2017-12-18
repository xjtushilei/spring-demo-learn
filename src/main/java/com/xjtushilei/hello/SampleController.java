package com.xjtushilei.hello;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.autoconfigure.*;

@RequestMapping("/1")
@RestController// 标记为：restful
public class SampleController {

    @RequestMapping("/1")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    List<String> getUserCustomers(@PathVariable String user) {
        List<String> result = new ArrayList<String>();
        result.add("123");
        result.add(user);
        return result;
    }

    @RequestMapping("/zeroException")
    public int zeroException() {

        return 100 / 0;

    }

    /**
     * 本控制器里的异常处理
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public @ResponseBody
    String defaultErrorHandler(HttpServletRequest req, Exception e) {
        System.out.println("本地异常优先处理");
        return e.toString();
    }
}