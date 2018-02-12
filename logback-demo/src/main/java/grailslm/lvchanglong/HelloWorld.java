package grailslm.lvchanglong;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import jdk.net.SocketFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("grailslm.lvchanglong.HelloWorld");
        logger.info("Hello World!!!"); //默认输出方式：控制台（ConsolrAppender）;默认的门限等级：DEBUG（日志等级大于等于门限等级的情况下，输出；日志等级小于门限等级的情况下，禁止输出）

//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc); //简单理解，查看logback实时运行状态
    }
}
