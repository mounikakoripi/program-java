import java.util.*;
class Task
  {
    private int id;
    private String name;
    private String description;
    private String datedue;
    private String status;
    public Task(int id,String name,String description,String datedue,String status)
    {
      this.id=id;
      this.name=name;
      this. description=description;
      this.datedue=datedue;
      this.status=status;
       }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDatedue() {
		return datedue;
	}
	public void setDatedue(String datedue) {
		this.datedue = datedue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
  }
class TaskManager
  {
    public HashSet<Integer> taskIds;
    public ArrayList<Task>tasks;
    public TaskManager()
    {
      taskIds=new  HashSet<>();
      tasks=new ArrayList<>();
    }
    public void addTask(Task task)
      if(!taskIds.contains(task.getId())){
        taskIds.add(task.getId());
          tasks.add(task);
        System.out.println("task added sucessfully");
      }
      else{
        System.out.println("task with same id already exit:");
      }
    }
    public void removeTask(int taskId)
    {
      Iterator<Task> iterator=tasks.iterator();
      while(iterator.hasNext()){
        Task task=iterator.next();
        if(task.getId()==taskId)
        {
          iterator.remove();
          taskIds.remove(taskId);
          System.out.println(" Task remove sucessfully");
          return;
        }
      }
     System.out.println("Task not found");
      }
    public void updateTaskStatus(int taskId,String status)
    {
      for(Task task:tasks){
        if(task.getId()==taskId)
        {
          task.setStatus(status);
          System.out.println("Task status update sucessfully:");
          return;
        }
      }
      System.out.println("Task not found:");
    }
    public void displayAllTasks()
    {
      System.out.println("All Tasks is:");
      for(Task task:tasks){
        displayTask(task);
      }
     }
    public void displayTasksByStauts(String status)
            {
              System.out.println(status + "Task:");
              for(Task task:tasks)
                {
                if(task.getStatus().equalsIgnoreCase(status))
                {
                  displayTask(task);
                }
                }
            }
    public void displayTask(Task t)
    {
      System.out.println("Id is:"+t.getId());
      System.out.println("Name is:"+t.getName());
      System.out.println("Description is :"+t.getDescription());
      System.out.println("Datedue is:"+t.getDatedue());
      System.out.println("Status is:"+t.getStatus());
      System.out.println();
      return;
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      TaskManager tm=new TaskManager();
      int r=0;
      while(r==0)
        {
          System.out.println("*****task management*****");
System.out.println("\n1.AddTask,\n2.RemoveTask,\n3.UpdateTaskStatus,\n4.DiplayAllTask,\n5.DisplayTaskStatus,\n6.DisplayTask");
          System.out.println("enter the choose");
          int choose=sc.nextInt();
          switch(choose)
            {
              case 1:
                System.out.println("Task Id is:");
                int id=sc.nextInt();
                System.out.println("Task Name is:");
                String name =sc.next();
                System.out.println("Task Description is:");
                String description=sc.next();
                System.out.println("Task DateDue is:");
                String datedue=sc.next();
                System.out.println("Task Status is:");
                String status=sc.next();
                Task t1=new Task(id,name,description,datedue,status);
                tm.addTask(t1);
                tm.addTask(t1);
                tm.addTask(t1);
                break;
              case 2:
                System.out.println("enter task id:");
                int Id1=sc.nextInt();
                tm.removeTask(Id1);
                break;
             case 3:
                System.out.println("enter the task id:");
                int id2=sc.nextInt();
                System.out.println("enter the task status:");
                String status1=sc.next();
               tm.updateTaskStatus(id2,status1);
                break;
             case 4:
                tm.displayAllTasks();
                break;
              case 5:
                System.out.println("enter the task status:");
                String status2=sc.next();
                tm.displayTasksByStauts(status2);
                break;
              //case 6:
             //  tm.displayTask(task);
               // break;

        }
                 }
        
    }
    }
    
  