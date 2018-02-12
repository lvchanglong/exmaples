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

logger("grailslm.lvchanglong", INFO, ['ROLLINGFILE', 'STDOUT'], false)
logger("grailslm.lvchanglong.HelloWorld", INFO)

root(DEBUG, ["FILE"])