package datajpaco.repo;

import java.awt.Composite;

import org.springframework.data.jpa.repository.JpaRepository;

import datajpaco.compositekeymodel.Student;

public interface Datajpacompositekey extends JpaRepository<Student,Composite>  {

}
