package datajpaco.compositekeymodel;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import datajpaco.compositeimpl.Composite;
import lombok.Data;
@Entity
@Data
@Table(name="Student_List")
/*
 * Combination of two or more PRIMERY KEY columns are called Composite key using hibernate
 * its a model class to implement the all primittives columns 
 * primery key related class is another class that is we need to keep serilizable and "Embedable" */
public class Student {
	/* this is we are embedding the id's from another class such as composite.class*/
	@EmbeddedId
	private Composite cd;
	private String stdName;
	private String stdCode;

}
