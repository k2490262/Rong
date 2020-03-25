package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVo;

public class CustomerManager {
	
	// ��ü �������� �ʰ� ����ϱ� ���� static Ű���� ���
	private static SqlSessionFactory factory;
	
	// ��ü���� �����ϵ��� �ϱ� ���� static ����� �̿��ؼ� factory �ʱ�ȭ ���� �߰�
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			
			// SqlSessionFactoryBuilder�� �޼ҵ� �� build �޼ҵ忡 reader�� �̿��ؼ� factory �ʱ�ȭ
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<CustomerVo> listAll(HashMap map) {
		// mapping ������ sql�� ������
		SqlSession session = factory.openSession();
		List<CustomerVo> list = session.selectList("customer.selectAll", map);
		// mapping ������ id�� �������� �� ����� list�� ���� 
		
		session.close();
		return list;
	}
	
	public static CustomerVo getCustomer(int custid) {
		SqlSession session = factory.openSession();
		CustomerVo cv = session.selectOne("customer.selectCustomer", custid);
		session.close();
		return cv;
	}
	
	public static int insertCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("customer.insert", c);
		session.commit();
		session.close();
		return re;
	}
	
    public static int deleteCustomer(int custid) {
        int re = -1;
        SqlSession session = factory.openSession(true);
        re = session.delete("customer.delete", custid);
//      session.commit();
        session.close();
        return re;
    }
    
    public static int update(CustomerVo c) {
        int re = -1;
        SqlSession session = factory.openSession(true);
        re = session.update("customer.update", c);
        session.close();
        return re;
    }
}
