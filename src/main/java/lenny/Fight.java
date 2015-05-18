package lenny;

// THIS FILE IS GENERATED.  DO NOT EDIT.

import lenny.base.Base;

public class Fight extends Base {
    public final static String face = "(ง'̀-'́)ง";

    public static String makeYay(String message) {
        if (message == null || message.equals("")) {
            return "\\" + face + "/";
        } else {
            return "\\" + face + "/ " + message;
        }
    }

    public static String makeFlex(String message) {
        if (message == null || message.equals("")) {
            return "ᕦ" + face + "ᕤ";
        } else {
            return "ᕦ" + face + "ᕤ " + message;
        }
    }

    public static String makeShrug(String message) {
        if (message == null || message.equals("")) {
            return "¯\\_" + face + "_/¯";
        } else {
            return "¯\\_" + face + "_/¯ " + message;
        }
    }

    private static String makeMessage(String message) {
        return face + " " + message;
    }

    public static void println() {
        System.out.println(face);
    }

    public static void println(String message) {
        System.out.println(makeMessage(message));
    }

    public static void lenny() { println(); }
    public static void lenny(String message) { println(message); }

    public static void yay() { System.out.println(makeYay("")); }
    public static void yay(String message) { System.out.println(makeYay(message)); }

    public static void flex() { System.out.println(makeFlex("")); }
    public static void flex(String message) { System.out.println(makeFlex(message)); }

    public static void shrug() { System.out.println(makeShrug("")); }
    public static void shrug(String message) { System.out.println(makeShrug(message)); }

    public static void info() { logger.info(face); }
    public static void info(String message) { logger.info(makeMessage(message)); }
    public static void infoYay() { logger.info(makeYay("")); }
    public static void infoYay(String message) { logger.info(makeYay(message)); }
    public static void infoFlex() { logger.info(makeFlex("")); }
    public static void infoFlex(String message) { logger.info(makeFlex(message)); }
    public static void infoShrug() { logger.info(makeShrug("")); }
    public static void infoShrug(String message) { logger.info(makeShrug(message)); }

    public static void warn() { logger.warn(face); }
    public static void warn(String message) { logger.warn(makeMessage(message)); }
    public static void warnYay() { logger.warn(makeYay("")); }
    public static void warnYay(String message) { logger.warn(makeYay(message)); }
    public static void warnFlex() { logger.warn(makeFlex("")); }
    public static void warnFlex(String message) { logger.warn(makeFlex(message)); }
    public static void warnShrug() { logger.warn(makeShrug("")); }
    public static void warnShrug(String message) { logger.warn(makeShrug(message)); }

    public static void debug() { logger.debug(face); }
    public static void debug(String message) { logger.debug(makeMessage(message)); }
    public static void debugYay() { logger.debug(makeYay("")); }
    public static void debugYay(String message) { logger.debug(makeYay(message)); }
    public static void debugFlex() { logger.debug(makeFlex("")); }
    public static void debugFlex(String message) { logger.debug(makeFlex(message)); }
    public static void debugShrug() { logger.debug(makeShrug("")); }
    public static void debugShrug(String message) { logger.debug(makeShrug(message)); }

    public static void error() { logger.error(face); }
    public static void error(String message) { logger.error(makeMessage(message)); }
    public static void errorYay() { logger.error(makeYay("")); }
    public static void errorYay(String message) { logger.error(makeYay(message)); }
    public static void errorFlex() { logger.error(makeFlex("")); }
    public static void errorFlex(String message) { logger.error(makeFlex(message)); }
    public static void errorShrug() { logger.error(makeShrug("")); }
    public static void errorShrug(String message) { logger.error(makeShrug(message)); }

    public static void trace() { logger.trace(face); }
    public static void trace(String message) { logger.trace(makeMessage(message)); }
    public static void traceYay() { logger.trace(makeYay("")); }
    public static void traceYay(String message) { logger.trace(makeYay(message)); }
    public static void traceFlex() { logger.trace(makeFlex("")); }
    public static void traceFlex(String message) { logger.trace(makeFlex(message)); }
    public static void traceShrug() { logger.trace(makeShrug("")); }
    public static void traceShrug(String message) { logger.trace(makeShrug(message)); }
}

