package com.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.nit.model.Employee;
import com.nit.util.HibernateUtil;

public class WithoutAddEntityFullLodaingtest {

	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			String sql2 = "select * from EMP_TABLE_DATA";
			NativeQuery query = session.createNativeQuery(sql2);
			query.addEntity(Employee.class);
			List<Employee> emps = query.list();
			emps.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
