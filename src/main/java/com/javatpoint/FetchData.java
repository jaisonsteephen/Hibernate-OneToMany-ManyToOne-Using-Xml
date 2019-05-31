package com.javatpoint;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 

public class FetchData {    
public static void main(String[] args) {    
        
      
    SessionFactory factory=HibernateUtil.getSessionFactory();  
    Session session=factory.openSession();  
        
    Query query= session.createQuery("from Question");    
    List<Question> list=query.list();    
        
    Iterator<Question> itr=list.iterator();    
    while(itr.hasNext()){    
        Question q=itr.next();    
        System.out.println("Question Name: "+q.getQname());    
            
        //printing answers    
        List<Answer> list2=q.getAnswers();    
        Iterator<Answer> itr2=list2.iterator();    
       while(itr2.hasNext())  
       {  
        Answer a=itr2.next();  
            System.out.println(a.getAnswername()+":"+a.getPostedBy());  
        }    
    }  
    session.close();    
    System.out.println("success");    
    }      
}    