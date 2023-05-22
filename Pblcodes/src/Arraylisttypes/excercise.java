package Arraylisttypes;

import java.util.*;

class CustomizeArray<O> extends ArrayList<O> {
	public boolean add(O e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("only int float double");
		}

	}

}

public class exercise {

	public static void main(String[] args) {
		ArrayList<Object> list = new CustomizeArray<>();
		try {
		list.add(90);
		list.add(34.88F);
		list.add(34.55D);
		list.add("tf");
		System.out.println(list);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
