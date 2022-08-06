package main;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import Questions.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> questions = populateQuestions();
		
		for(int i = 0; i < questions.size(); i++) {
			instantiate(questions.get(i)).execute();
		}

		System.out.println("Complete");
	}
	
	private static Question instantiate(String name) {
		try {
			Class<?> qClass = Class.forName("Questions." + name);
			return (Question) qClass.getDeclaredConstructor().newInstance();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private static ArrayList<String> populateQuestions() {
		ArrayList<String> questions = new ArrayList<String>();
		File folder = new File("./src/Questions/");
		File[] files = folder.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isFile()) {
				questions.add(files[i].getName().replaceFirst("[.][^.]+$", ""));
			}
		}
		return questions;
	}
}
