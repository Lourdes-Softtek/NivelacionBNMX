package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"

    // http://localhost:8081/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    // http://localhost:8081/say-hello-html
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("        <html>\r\n" + //
                        "        <head>\r\n" + //
                        "            <title>My firts HTML Page</title>\r\n" + //
                        "        </head>\r\n" + //
                        "        <body>\r\n" + //
                        "            My first html page with body\r\n" + //
                        "        </body>\r\n" + //
                        "        </html>\r\n" + //
                        "");
        return sb.toString();
    }

        // http://localhost:8081/say-hello-jsp
        // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
        // /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
        @RequestMapping("say-hello-jsp")
        public String sayHelloJsp() {
            return "sayHello";
        }    
}
