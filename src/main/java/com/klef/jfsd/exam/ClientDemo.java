package com.klef.jfsd.exam;


	import org.hibernate.*;
	import org.hibernate.cfg.Configuration;

	public class ClientDemo {
	    public static void main(String[] args) {
	        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = null;

	        try {
	            transaction = session.beginTransaction();

	            // Insert Operation
	            Department dept1 = new Department("Computer Science", "Block A", "Dr. Smith");
	            Department dept2 = new Department("Mechanical Engineering", "Block B", "Dr. Johnson");

	            session.save(dept1);
	            session.save(dept2);

	            System.out.println("Departments inserted successfully!");

	            // Delete Operation using HQL with positional parameters
	            Query query = session.createQuery("delete from Department where deptId = ?1");
	            query.setParameter(1, dept1.getDeptId());

	            int result = query.executeUpdate();
	            System.out.println("Number of records deleted: " + result);

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	            sessionFactory.close();
	        }
	    }
	}

	

