package org.yangxin.config.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author yangxin
 * 2021/7/16 10:09
 */
@Data
@Component
public class GitConfig implements Serializable {

    private static final long serialVersionUID = -1990252285578905470L;

    @Value("${data.env}")
    private String env;

    @Value("${data.user.username}")
    private String username;

    @Value("${data.user.password}")
    private String password;
}
