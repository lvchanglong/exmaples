package grailslm.lvchanglong;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("grailslm.lvchanglong.HelloWorld"); //root
        logger.debug("Hello World !!!");

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc); //可简单理解为，查看logback实时运行状态
    }
}
