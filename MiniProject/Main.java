import java.util.Scanner;
import java.util.*;
class Patient
  {
    private static int  nextId=1;
    private int id;
    private String name;
    private int age;
    private String aadharnumber;
    private String contactnumber;
    private String city;
    private String address;
    private String dateofadimission;
    private String GuardianName;
    private String Guardianaddress;
    private boolean recovered;
    public Patient(String name,int age,String aadharnumber,String contactnumber,String city,String address,String dateofadmission,String GuardianName,String Guardianaddress)
    {
      this.id=nextId++;
      this.name=name;
      this.age=age;
      this.aadharnumber=aadharnumber;
      this.contactnumber=contactnumber;
      this.city=city;
      this.address=address;
      this.dateofadimission=dateofadmission;
      this.GuardianName=GuardianName;
      this.Guardianaddress=Guardianaddress;
      this.recovered=false;
    }
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Patient.nextId = nextId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAadharNumber() {
		return aadharnumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharnumber = aadharNumber;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateofadimission() {
		return dateofadimission;
	}
	public void setDateofadimission(String dateofadimission) {
		this.dateofadimission = dateofadimission;
	}
	public String getGuardianName() {
		return GuardianName;
	}
	public void setGuardianName(String guardianName) {
		GuardianName = guardianName;
	}
	public String getGuardianaddress() {
		return Guardianaddress;
	}
	public void setGuardianaddress(String guardianaddress) {
		Guardianaddress = guardianaddress;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
  }
class Hospital
  {
    private HashMap<Integer,Patient>patients;
    public Hospital()
    {
         patients =new HashMap<>();

    }
    public void addPatient(Patient patient)
    {
      patients.put(patient.getId(),patient);
      System.out.println(" patient Added sucessfully");
      }
    public Patient getPatientById(int id)
    {
      return patients.get(id);
    }

    public void allPatientsDetails(){
    boolean check=patients.isEmpty();
    if(check==false){
    Set keys=patients.keySet();
    for(Object obj:keys){
      Integer p1=(Integer)obj;
      Patient p=patients.get(p1);
      System.out.println();
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAadharNumber());
      System.out.println("Patient Mobile Number: "+p.getContactnumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateofadimission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianaddress());
       }
    }
    else{
      System.out.println("Collection Empty");
    }
  }
    public void searchWithId(int id)
    {
   Patient p=patients.get(id);
    if(p!=null)
    {
      System.out.println();
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAadharNumber());
      System.out.println("Patient Mobile Number: "+p.getContactnumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateofadimission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianaddress());
    }
      
  else{
      System.out.println("With this Id:"+id+" There is no Patient");
    }
  }
    public List<Patient> getpatientsByCity(String city)
    {
     ArrayList<Patient> a=new ArrayList<Patient>();
      for(Patient patient:patients.values())
        {
          if(patient.getCity().equalsIgnoreCase(city))
          {
            a.add(patient);
          }
       }
      return a;
    }
    public List<Patient> getpatientsByAgeGroup(int minAge,int maxAge)
    {
      ArrayList<Patient> al=new ArrayList<Patient>();
      for(Patient patient:patients.values())
        {
          if(patient.getAge() >= minAge && patient.getAge() <= maxAge)
          {
            al.add(patient);
          }
        }
      return al;
    }
    public void searchWithName(String name)
    {
      int c=0;
     for(Patient p:patients.values())
       {
         if(p.getName().equalsIgnoreCase(name))
           {
           System.out.println();
        System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAadharNumber());
      System.out.println("Patient Mobile Number: "+p.getContactnumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateofadimission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianaddress());
           }
       }
       }
    public void dischargePatient(int id){
    Patient p=patients.get(id);
    if(p!=null){
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAadharNumber());
        System.out.println("Patient Mobile Number: "+p.getContactnumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateofadimission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianaddress());
    }
    else{
      System.out.println("Id Not found");
     }
  }
    public  void deletePatient(int id)
    {
      Patient p=patients.remove(id);
      if(p!=null)
      {
        System.out.println();
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAadharNumber());
        System.out.println("Patient Mobile Number: "+p.getContactnumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateofadimission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianaddress());
    }
    else{
      System.out.println("Id Not found");
     }
      }
    }
  

class Main
  {
    public static void main(String []args)
    {
      Hospital hospital=new Hospital();
     Scanner sc=new Scanner(System.in);
       int r=0;
    
    while(r==0){
      System.out.println();
      //System.out.println("****Welcome to Arogya Hospital Managment System****");
      System.out.println("****Welcome to Arogya Hospital Managment System****");
      System.out.println("1.Add New Patient\n2.List of Patients\n3.Search Patient With Unique ID\n4.Search Patient With name\n5.Filtering Patients\n6.Discharge Patient\n7.Delete Patient\nSelect One Option");
      int choice=sc.nextInt();
    switch(choice){
        case 1:
       System.out.println("patient details");
      System.out.println("----------------");
    System.out.println(" patient Name:");
        sc.nextLine();
      String name=sc.next();
      System.out.println(" patient age:");
      int age=sc.nextInt();
      System.out.println(" patient aadharnumber:");
      String aadharnumber=sc.next();
      System.out.println(" patient contactnumber:");
      String contactnumber=sc.next();
      System.out.println(" Pateint city:");
      String city=sc.next();
      System.out.println(" patient address:");
     String address=sc.next();
      System.out.println(" patient dateofadimission:");
      String dateofadimission=sc.next();
      System.out.println(" patient GuardianName:");
      String GuardianName=sc.next();
      System.out.println(" patient GuardianAddress:");
      String Guardianaddress=sc.next();
 Patient p1=new Patient(name,age,aadharnumber,contactnumber,city,address,dateofadimission,GuardianName, Guardianaddress) ;
       
    
     /* Patient p1=new Patient("moun",28,"706251810150","7729052148","ongole","xyz area",new Date(),"sita","ong");
      Patient p2=new Patient("sadhvi",27,"62314512321","9989714521","tenali","rrnagar",new Date(),"puri","kdk");*/
     hospital.addPatient(p1);
        hospital.addPatient(p1);
    // hospital.addPatient(p1);
        break;
      case 2:
     hospital.allPatientsDetails();
        break;
      case 3:
        System.out.println("enter the patient id");
        int id=sc.nextInt();
        hospital.searchWithId(id);
        break;
      case 4:
         System.out.println("enter the name of the patient:");
        String name1=sc.next();
        hospital.searchWithName(name1);
        break;
      case 5:
        System.out.println("1.withcity\n2.with age\n select one option");
        int choose=sc.nextInt();
        switch(choose){
          case 1:
            System.out.println("enter the city");
        String City=sc.next();
      hospital.getpatientsByCity("city");
        break;
      case 2:
     System.out.println("enter the min age:");
      int minAge=sc.nextInt();
      System.out.println("enter the max age");
      int maxAge=sc.nextInt();
       hospital.getpatientsByAgeGroup(minAge,maxAge);
        break;
        }
      case 6:
        System.out.println("enter the patient id to discharge:");
        int id1=sc.nextInt();
        hospital.dischargePatient(id1);
        break;
      case 7:
        System.out.println("enter the patient id to delete:");
        int id2=sc.nextInt();
        hospital.deletePatient(id2);
        break;
        
     
  }
  } 
  }
  }
  
  