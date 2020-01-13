package com.bit.exam01;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Triangle t = new Triangle(10, 10, 20, 30);
		Cylinder cy = new Cylinder(20, 20, 5, 20);
		Cube cu = new Cube(30, 30, 10, 10, 10);
		
		// ������ ��ü���� ȣ���� �޼ҵ�� �����ϴ�.
		// �׷��� t�� �ﰢ���� �׸���, cy�� ������� �׸���, cu�� ������ü�� �׸���.
		// �̿� ���� ��ü���� �� �޼����� �����ϳ� ��ü���� �ϴ� ���� �ٸ� ���� '������'�̶� �Ѵ�.
		/*
		 ������ : ��ü���� �� �޽����� �����ѵ�(ȣ���ϴ� �޽����� �����ѵ�) ��ü���� ���۹��(�ϴ� ��)�� �ٸ�
		 ��Ӱ� �������̵��� ������ ����
		 */
		
		t.draw();
		cy.draw();
		cu.draw();
		
		// Shape[] arr = new Shape[100];
		
//		ArrayList<Shape> arr = new ArrayList<Shape>();
//		
//		arr.add(new Circle(10, 10, 50));
//		arr.add(new Cube(10, 120, 50, 50, 50));
//		arr.add(new Cylinder(10, 200, 50, 200));
//		
//		for (Shape p : arr) {
//			System.out.println(p);
//			if (p instanceof TwoDimShape) {
//				((TwoDimShape)p).calcArea();
//				System.out.println("������ ���� : " + ((TwoDimShape)p).getArea());
//			} else if (p instanceof ThreeDimShape) {
//				((ThreeDimShape)p).getVolume();
//				System.out.println("������ ü�� : " + ((ThreeDimShape)p).getVolume());
//			}
//		}
	}
}
