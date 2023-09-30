package JIRA;

import java.util.ArrayList;

public class User {
  
// atributes

private String name;
private ArrayList<Task> taskList;
private ArrayList<Sprint> sprintList;

// initialising with arugment constructor
public User(String name) {
    this.name = name;
    taskList = new ArrayList<>();
    sprintList = new ArrayList<>();
}

// create task: Task
public Task createTask(TaskType taskType){
  Task task=new Task(); 
  task.setTaskType(taskType);
  task.setUser(this);
  taskList.add(task);
  return task ;
}
public Task createTask(String subtract){
    Task task = new Task();
    task.setTaskType(TaskType.STORY);
    task.setUser(this);
    task.setSubtract(subtract);
    taskList.add(task);
    return task;
}

//create sprint: 
public Sprint createSprint(int begin, int end, String name){
    Sprint sprint = new Sprint(begin, end, name);
        sprintList.add(sprint);
        return sprint;
}

//removeFromSprint
public boolean removeFromSprint(Sprint sprint, Task task) {
    if(sprintList.contains(sprint)) {
        ArrayList<Task> tasks = sprint.getTasks();
        if(tasks.contains(task)) {
            sprint.eraseTask(task);
        }
        return  true;
    }
    return false;
}

//add to sprint
public boolean addToSprint(Sprint sprint, Task task) {
    if(sprintList.contains(sprint)) {
        sprint.addTask(task);
        return  true;
    }
    return false;
}

//print all tasks

//change status
public boolean changeStatus(Task task, TaskStatus taskStatus) {
    for(Task t: taskList)
    {
        if(t.getId() == task.getId())
        {
            t.setTaskStatus(taskStatus);
            return true;
        }
    }
    return false;
}



}
