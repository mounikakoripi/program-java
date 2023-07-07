import java.util.*;
class Task
  {
    private int id;
    private String name;
    private String description;
    private String datedue;
    private String status;
    public Task(int id,String name,String description,String datedue,String Status)
    {
      this.id=id;
      this.name=name;
      this.description=description;
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
 class Tasks
  {
 public  HashSet<Task> taskIds;
   public ArrayList<Task>tasks;
    public Tasks()
    {
      taskIds=new HashSet();
      tasks=new ArrayList();
      }
    public void addTask(Task task)
    {
   if(!taskIds.contains(task.getId()))
   {
        taskIds.add(task.getId());
          tasks.add(task);
        System.out.println("task added sucessfully");
         }
        else {
        System.out.println("task with same Id already exit:");
}
    }
    public void removeTask(int taskId)
    {
      Iterator<Task> iterator=tasks.iterator();
      while(iterator.hasNext())
        {
          Task task=iterator.next();
          if(task.getId()==taskId)
          {
            iterator.remove();
            tasks.remove(taskIds);
            System.out.println("task is removed");
            return;
             }
        }
      System.out.println("task is not found");
      }
    public void UpdateTaskStatus(int taskId,String status)
    {
      for(Task task:tasks)
        {
          if(task.getId()==taskId)
          {
            task.setStatus(status);
            System.out.println("task is update sucessfully:");
            return;
          }
        }
      System.out.println("task is not found:");
    }  
    public void displayAllTask()
    {
      System.out.println("task is display:");
      for(Task task:tasks)
        displayTask(task);
      return;
     }
    public void displayTasksByStatus(String status)
    {
      System.out.println(status+" tasks");
      for(Task task:tasks)
        {
          if(task.getStatus().equalsIgnoreCase(status))
          {
            displayTask(task);
          }
            
        }
    }
    public void displayTask(Task task)
    {
      System.out.println("ID is:"+task.getId());
      System.out.println("Name is:"+task.getName());
      System.out.println("Description is:"+task.getDescription());
      System.out.println("Date Due is:"+task.getDatedue());
      System.out.println("Status is:"+task.getStatus());
    }
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int r=0;
      while(r==0){
     Tasks t=new Tasks();
        System.out.println("\n1.addtask,\n2.remove task,\n3.updatestatus,\n4.dispalyalltask,\n5.displaystatus,\n6.dispaly task:");
        int option=sc.nextInt();
        switch(option)
        {
          case 1:
        System.out.println("****task details****");
      System.out.println("enter the task id:");
      int id=sc.nextInt();
        System.out.println("task name:");
        String name=sc.next();
        System.out.println("task description:");
        String description=sc.next();
            System.out.println("task datedue:");
            String datedue=sc.nextLine();
            System.out.println("task status:");
            String status=sc.nextLine();
            Task t1=new Task(id,name,description,datedue,status);
            t.addTask(t1);
            t.addTask(t1);
            t.addTask(t1);
            break;
          case 2:
            System.out.println("enter the task id:");
            int id2=sc.nextInt();
            t.removeTask(id2);
            break;
          case 3:
            System.out.println("enter the task id");
            int id1=sc.nextInt();
            System.out.println("enter the task status:");
            String status1=sc.nextLine();
            t.UpdateTaskStatus(id1, status1);
            break;
          case 4:
            t.displayAllTask();
            break;
          case 5:
            System.out.println("enter the task status:");
            String status2=sc.next();
            t.displayTasksByStatus(status2);
            break;
          case 6:
            t.displayTask(t1);
        }
        
      }
    }
    
  }