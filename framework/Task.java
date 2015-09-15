package framework;/*
 * Created by bloodwi11 on 3/9/2015.
 */

public interface Task {
    abstract int priority();
    abstract boolean validate();
    abstract void execute();
}