package JIRA;

import java.util.ArrayList;

public class Task {
private static int uniqueId=1;
   private int id;
   private String subtract;
   private ArrayList<SubTask> subTaskList;
   private User user;
   TaskType taskType;
   TaskStatus taskStatus;

   public Task(){
    this.id = uniqueId++;
    this.taskStatus = TaskStatus.OPEN;
    this.subTaskList = new ArrayList<>();
   }

public int getId() {
    return id;
}

public void setSubtract(String subtract) {
    this.subtract = subtract;
}

public void setUser(User user) {
    this.user = user;
}

public void setTaskType(TaskType taskType) {
    this.taskType = taskType;
}

public void setTaskStatus(TaskStatus taskStatus) {
    this.taskStatus = taskStatus;
}




}
