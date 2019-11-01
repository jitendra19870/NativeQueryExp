package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.nit.util.HibernateUtil;

public class NonSelectQueryTest {

	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String sql = "update EMP_TABLE_DATA set ename=:a,email=:b,esal=:c where eid=:d";
			NativeQuery query = session.createNativeQuery(sql);
			query.setParameter("a", "Ajeet");
			query.setParameter("b", "jitu54@gamil.com");
			query.setParameter("c", 50000.5);
			query.setParameter("d", 3);
			int count = query.executeUpdate();
			tx.commit();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
