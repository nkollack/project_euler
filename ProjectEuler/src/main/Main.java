package main;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		executeAll();

		System.out.println("Complete");
	}
	
	private static Question instantiate(String name, int i) {
		try {
			Class<?> qClass = Class.forName("questions." + name);
			return (Question) qClass.getDeclaredConstructor(int.class).newInstance(i);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
	
	private static void executeAll() {
		ArrayList<String> questions = populateQuestions();
		
		for(int i = 0; i < questions.size(); i++) {
			instantiate(questions.get(i), i+1).execute();
		}
	}
}
