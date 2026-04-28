package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import models.Course;

public class DBContext {
	private final static DBContext INSTANCE = new DBContext();
	private static String rootPath;
	private static List<Course> courses;
	
	{
		rootPath = new File("src/data").getAbsolutePath();
	}
	
	private DBContext() {
		courses = new ArrayList<>();
		load();
	}
	
	public static void addCourse(Course newCourse) {
		courses.add(newCourse);
	}
	
	private static boolean serializer(Object data, String fileName) {
		String filePath = rootPath + "/" + fileName + ".txt";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
			oos.writeObject(data);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
	
	private static Object deserialize(String fileName) {
		String filePath = rootPath + "/" + fileName + ".txt";
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			Object data = ois.readObject();
			return data;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	public static boolean save() {
		return serializer(courses, "courses");
	}
	
	@SuppressWarnings("unchecked")
	public static void load() {
		courses = (List<Course>) deserialize("courses");
	}

	public static DBContext getInstance() {
		return INSTANCE;
	}

	public static List<Course> getCourses() {
		return courses;
	}
}
