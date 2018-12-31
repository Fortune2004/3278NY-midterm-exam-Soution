package parser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	public String firstName;
	public String lastName;
	public String score;
	public String id;

	public Student(){}

	public Student(String firstName, String lastName, String score, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString(){
		return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
	}

}
