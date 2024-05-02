package io.github.azirzsk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangshukun
 * @since 2024/5/1
 */
public class DeployDemo {

    private static final Logger logger = LoggerFactory.getLogger(DeployDemo.class);

    private String name;

    public DeployDemo(String name) {
        logger.info("DeployDemo init with name: {}", name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
