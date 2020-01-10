package ir.maktab.config;

import org.apache.log4j.Logger;

public class Lof4J {


        final static Logger logger = Logger.getLogger(MyApp.class);

        private Lof4J() {

        }

        public static Logger getLogger() {
            return logger;
        }

    }

