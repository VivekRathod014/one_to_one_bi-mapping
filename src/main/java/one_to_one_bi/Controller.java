package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vivek");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		CarRegistration carRegistration = new CarRegistration();
		carRegistration.setColor("White");
		carRegistration.setModel("Maruti");
		carRegistration.setRegistrationNo("123456");
		
		Car car = new Car();
		car.setName("Mercesdes");
		car.setBrand("Jaguar");
		
		entityTransaction.begin();
		entityManager.persist(carRegistration);
		entityManager.persist(car);
		entityTransaction.commit();
		
	}

}
