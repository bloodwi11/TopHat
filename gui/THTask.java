package gui;/*
 * Created by bloodwi11 on 3/9/2015.
 */

public class THTask {
    String job;
    int target;
    int location;
    int disposal;
    int disposalOption;
    int goal;
    int quota;

    public THTask() {
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getJob() {
        return job;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    public int getTarget() {
        return target;
    }

    public void setLocation(int location) {
        this.location = location;
    }
    public int getLocation() {
        return location;
    }

    public void setDisposal(int disposal) {
        this.disposal = disposal;
    }
    public int getDisposal() {
        return disposal;
    }

    public void setDisposalOption(int disposalOption) {
        this.disposalOption = disposalOption;
    }
    public int getDisposalOption() {
        return disposalOption;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
    public int getGoal() {
        return goal;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
    public int getQuota() {
        return quota;
    }
}
