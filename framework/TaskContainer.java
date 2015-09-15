package framework;
/*
 * Created by bloodwi11 on 3/9/2015.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskContainer implements Comparator<AbstractTask> {


    private List<AbstractTask> taskList = new ArrayList<AbstractTask>();


    public void submit(final AbstractTask... tasks) {
        for (AbstractTask abstractTask : tasks) {
            if (!taskList.contains(abstractTask)) {
                taskList.add(abstractTask);
            }
        }
        Collections.sort(taskList, this);
    }


    public void remove(Class<AbstractTask> abstractTask) {
        if (taskList.contains(abstractTask)) {
            taskList.remove(abstractTask);
        }
    }


    public void clearTasks() {
        taskList.clear();
    }


    public int getTaskCount() {
        return taskList.size();
    }


    @Override
    public int compare(AbstractTask o1, AbstractTask o2) {
        return o2.priority() - o1.priority();
    }


    public AbstractTask getValidTask() {
        for (AbstractTask abstractTask : taskList) {
            if (abstractTask.validate()) {
                return abstractTask;
            }
        }
        return null;
    }
}
