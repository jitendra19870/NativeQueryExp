package com.nit.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.nit.util.HibernateUtil;

public class WithAddEntityFullLodaingtest2 {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			String sql1="select * from EMP_TABLE_DATA";
			NativeQuery query=session.createNativeQuery(sql1);
			List<Object[]> obs=query.list();
			for(Object[] ob:obs) {
				System.out.println(ob[0]+","+ob[1]+","+ob[2]+","+ob[3]);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
