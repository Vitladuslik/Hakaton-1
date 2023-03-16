package com.template.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private static final String CALL_ENDPOINT = "call endpoint : %s ";

    @GetMapping("/ping")
    public String ping() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/POST")
    public String post() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/PUT")
    public String put() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/GETALL")
    public String getAll() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/GET")
    public String get() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/DELETE")
    public String delete() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/SORT")
    public String sort() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

}
