package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import models.Course;

public class DBContext {
	private static List<Course> courses;
	private static String rootPath;
	private static final DBContext INSTANCE = new DBContext(); 
	
	private DBContext() {
		this.initialize();
		rootPath = new File("src/data").getAbsolutePath();
	}
	
	private static void serialize(Object data, String fileName) {
		System.out.println(rootPath + "/" + fileName + ".txt");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rootPath + "/" + fileName + ".txt"))) {
			oos.writeObject(data);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static Object deserialize(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rootPath + fileName + ".txt"))) {
			Object data = ois.readObject();
			return data;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	public static void addCourse(Course newCourse) {
		DBContext.courses.add(newCourse);
	}
	
	public static void save() {
		DBContext.serialize(DBContext.courses, "courses");
	}
	
	public static void load() {
		// TODO: add logic
	}
	
	private void initialize() {
		courses = new ArrayList<>();
	}

	public List<Course> getCourses() {
		return courses;
	}

	public static DBContext getInstance() {
		return INSTANCE;
	}
}
