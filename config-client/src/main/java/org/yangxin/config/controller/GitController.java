package org.yangxin.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yangxin.config.config.GitConfig;

/**
 * @author yangxin
 * 2021/7/16 10:07
 */
@RestController
public class GitController {

    private final GitConfig gitConfig;

    @Autowired
    public GitController(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    @GetMapping("/show")
    public Object show() {
        return gitConfig;
    }
}
