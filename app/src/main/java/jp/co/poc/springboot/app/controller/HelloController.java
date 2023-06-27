package jp.co.poc.springboot.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 動作確認用コントローラ
 */
@RestController
public class HelloController {
    /**
     * 画面に文字を表示します
     * @return 文字
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
