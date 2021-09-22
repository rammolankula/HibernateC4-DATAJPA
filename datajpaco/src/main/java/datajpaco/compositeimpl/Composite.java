package datajpaco.compositeimpl;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
/* This is the class for implementation primery keys and using embededable concept */
public class Composite implements Serializable {
	
	private Integer stdId;
	private Integer stdLid;
	

}
