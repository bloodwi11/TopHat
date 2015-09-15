package framework;/*
 * Created by bloodwi11 on 3/9/2015.
 */

public abstract class AbstractTask implements Task {
    private static boolean debug;

    public static boolean getDebug() {
        return debug;
    }
    public static void setDebug(boolean debug) {
        AbstractTask.debug = debug;
    }

    //TODO
    //This i think is basically TaskControl, Will need to do some testing though.
}
