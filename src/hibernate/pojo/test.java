package hibernate.pojo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		  SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  Session s = sf.openSession();
		  s.beginTransaction();
		  
		  /*       Ôö
		  product p=new product();
		  p.setName("asdf");
		  p.setPrice("9999.9");
		  s.save(p);*/
		  
		  
		  
		  
		  /*      É¾
		  String hsql="delete from product p where p.id=?";
		  Query q = s.createQuery(hsql);
		  q.setInteger(0, 10);
		  q.executeUpdate() ; */
		  
		  /*      ¸Ä           */
		  String hsql="update product p set p.price=9999.9  where p.id=?";
		  Query q = s.createQuery(hsql);
		  q.setInteger(0, 9);
		  q.executeUpdate() ; 
		  
		  
		  /*       ²é
		   String hsql="from product";
		  Query q = s.createQuery(hsql);
		  List<product> p=q.list();
		  for(product pp:p){
			  System.out.println("id="+pp.id+" name="+pp.name+" price="+pp.price);
		  }*/
		  
		  
		  s.getTransaction().commit();
		  s.close();
	        sf.close();
	}

}
