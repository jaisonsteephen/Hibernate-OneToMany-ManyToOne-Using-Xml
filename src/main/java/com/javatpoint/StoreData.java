package com.javatpoint;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StoreData {
	public static void main(String[] args) {    
	     

	    SessionFactory factory=HibernateUtil.getSessionFactory(); 
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();    
	        
	    Question question1=new Question();
	    Question question2=new Question(); 
	    Answer q1Anser1=new Answer();
	    Answer q1Answer2=new Answer();   
	    Answer q2Answer1=new Answer();
	    Answer q2Answer2=new Answer(); 
	      
	    q1Anser1.setAnswername("Java is a programming language");    
	    q1Anser1.setPostedBy("Ravi"); 
	    q1Anser1.setQuestion(question1);
	        
	     
	    q1Answer2.setAnswername("Java is a platform");    
	    q1Answer2.setPostedBy("Sudhir");  
	    q1Answer2.setQuestion(question1);
	        
	        
	    q2Answer1.setAnswername("Servlet is an Interface");    
	    q2Answer1.setPostedBy("Jai");    
	    q2Answer1.setQuestion(question2);    
	       
	    q2Answer2.setAnswername("Servlet is an API");    
	    q2Answer2.setPostedBy("Arun"); 
	    q2Answer2.setQuestion(question2);
	        
	    ArrayList<Answer> q1Ansers=new ArrayList<Answer>();    
	    q1Ansers.add(q1Anser1);    
	    q1Ansers.add(q1Answer2);    
	        
	    ArrayList<Answer> q2Answers=new ArrayList<Answer>();    
	    q2Answers.add(q2Answer1);    
	    q2Answers.add(q2Answer2);    
	        
	        
	    question1.setQname("What is Java?");    
	    question1.setAnswers(q1Ansers);    
	        
	       
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(q2Answers);    
	        
	    session.persist(question1);    
	    session.persist(question2);    
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	}    
}
