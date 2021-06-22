package com.work;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    protected static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    protected static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    protected static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    protected static final Logger loggerError = LoggerFactory.getLogger("logger.error");

//    loggerDebug.debug("create user default : " + 12235);
//
//        for (int i = 0; i < 50; i++ ){
//        loggerError.error("User is young : " + 151121);
//        loggerWarn.error("User is young : " + "sdf");
//        loggerWarn.warn("Created user : " + i);
//    }

}
