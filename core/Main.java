package core;
/*
 * Created by bloodwi11 on 3/9/2015.
 */

import framework.Task;
import framework.TaskContainer;
import gui.StartPanel;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import tasks.FindTool;

@ScriptManifest(author="Bloodwi11",
        category= Category.MINING,
        name="TopHat",
        version=0.01,
        description="Mining with style.")
public class Main extends AbstractScript {

    private static TaskContainer taskContainer = new TaskContainer();
    public static double version = 0.01;

    public static TaskContainer getTaskContainer() {
        return taskContainer;
    }

    public void onStart() {
        //Use This to Add Each Task, The Priority will sort them all out Afterwards.
        StartPanel.setVersion(getManifest().version());
        log("Adding Tasks");
        getTaskContainer().submit(new FindTool());
    }

    public int onLoop() {
        Task task = getTaskContainer().getValidTask();
        if(task != null) {
            task.execute();
        }
        return 50;
    }
}