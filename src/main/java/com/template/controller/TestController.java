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

    @GetMapping("/UPDATE")
    public String update() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/restaurant")
    public String addRestaurant() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/GETALL")
    public String getAll() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/restaurant/query?city={city}")
    public String getByCity() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/restaurant/query?id={id}")
    public String getById() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/restaurant/{id}")
    public String delete() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

    @GetMapping("/restaurant/sort")
    public String sort() {
        log.info(String.format(CALL_ENDPOINT, "ping"));
        return "work - OK";
    }

}
