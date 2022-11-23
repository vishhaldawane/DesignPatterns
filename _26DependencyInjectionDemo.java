
public class _26DependencyInjectionDemo {
	public static void main(String[] args) {
		
		ServiceB sb = new ServiceB();
		ClientA ca = new ClientA(sb);
		ca.doSomething();
		
		System.out.println("--------");
		
		Service s = new ServiceE();	
		Client c = new ClientB(s);	
		c.doSomething();
		
		
		
	}
}

 class ClientA {
    ServiceB service;
    
    ClientA(ServiceB sb) {
    	this.service = sb;
    }
    public void doSomething() {    
        String info = service.getInfo();
    }
}
  class ServiceB {
	  public String getInfo() {
	  		return "ServiceB info";
	  }
  }
  
  /*
   * 
   * @Service
   * class EmailService {
   * 		void sendMail();
   *  }
   * 
   * @Component
   * class Consumer {
   * 
   * 	@Autowired
   * 	EmailService es;
   * 
   * 		void send() {
   * 			es.sendMail();	
   * 		}
   * }
   * 
   * @Controller
   * class Process
   * {
   * 	@Autowired
   * 	Consumer cons;
   * 
   * 		void doProcess()
   * 		{
   * 			cons.send();
   * 		}
   * }
   * 
   */
  

	 

interface Service {
    String getInfo();
}

class ServiceC implements Service {
 
    @Override
    public String getInfo() {
        return "ServiceC's Info";
    }
}

class ServiceD implements Service {
 
    @Override
    public String getInfo() {
        return "ServiceD's Info";
    }
}
 
class ServiceE implements Service {
 
    @Override
    public String getInfo() {
        return "ServiceE's Info";
    }
}


interface Client {
    void doSomething();
}
 
class ClientB implements Client {
     
    Service service;
     
    public ClientB(Service service) { //or via setClientB
        this.service = service;
    }
 
    @Override
    public void doSomething() {
         
        String info = service.getInfo();
         
    }
}


/*
Service service = new ServiceB();
Service service = read xml and load the object 
Client client = new ClientA(service);
client.doSomething();

Container container = XmlPathLoader("abc.xml");
Service serv = container.getBean("s");


@Repository
class Service {

}
*/
 