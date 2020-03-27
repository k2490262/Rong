package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class DBManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static List<GoodsVo> listAll() {
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}

	public static int insertBook(GoodsVo g) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("goods.insert", g);
		session.commit();
		session.close();
		return re;
	}
}
