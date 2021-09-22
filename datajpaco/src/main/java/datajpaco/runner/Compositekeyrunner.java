package datajpaco.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import datajpaco.compositeimpl.Composite;
import datajpaco.compositekeymodel.Student;
import datajpaco.repo.Datajpacompositekey;
@Component
public class Compositekeyrunner implements CommandLineRunner{

	@Autowired
	Datajpacompositekey repo;
	
	@Override
	public void run(String... args) throws Exception {

		/*process of setting and saving the data primery related*/
	     Composite co=new Composite();
	     co.setStdId(1);
	     co.setStdLid(2);
	     
	     /*Process of getting the data from primerykey--Embeddable class and saving the data 
	      * of primery key and setting the data for model class and saving the data*/
	     Student std=new Student();
	     std.setCd(co);//saving the data of primery key class
	    
	     std.setStdCode("Dev");
	     std.setStdName("RamiT");
	     repo.save(std);//saving the data of model class
	     
	     
	}

}
