package com.example.demo.used;

import org.springframework.stereotype.Component;

/**
 * 아침 인사하기
 */

public class EveningGreet implements Greet {

    @Override
    public String greeting() {
        return "안녕히 주무세요.";
    }
}