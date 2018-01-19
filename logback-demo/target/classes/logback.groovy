import ch.qos.logback.core.*;
import ch.qos.logback.core.encoder.*;
import ch.qos.logback.core.read.*;
import ch.qos.logback.core.rolling.*;
import ch.qos.logback.core.status.*;
import ch.qos.logback.classic.net.*;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy
import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO

scan("60 seconds")

appender("FILE", FileAppender) {
    file = "myApp.log"
    append = true
    encoder(PatternLayoutEncoder) {
        pattern = "%date %level [%thread] %logger{10} [%file:%line] %message%n"
    }
}

appender("ROLLINGFILE", RollingFileAppender) {
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "logFile.%d{yyyy-MM-dd}.log"
        maxHistory = 30
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%-4relative [%thread] %-5level %logger{35} - %message%n"
    }
}

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%message%n"
    }
}

logger("grailslm.lvchanglong", INFO, ['ROLLINGFILE'], false)
logger("grailslm.lvchanglong.HelloWorld")

root(DEBUG, ["STDOUT", "FILE"])