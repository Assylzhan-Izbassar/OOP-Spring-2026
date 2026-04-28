package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entity.models.Course;
import entity.models.Enrollment;
import entity.models.User;

public class DBContext {
	private static final DBContext INSTANCE = new DBContext();
	private static String path;
	
	private static List<Course> courses;
	private static List<User> users; 
	private static List<Enrollment> enrollments;
	
	private DBContext() {
		courses = new ArrayList<Course>();
		users = new ArrayList<User>();
		enrollments = new ArrayList<Enrollment>();
		
		path = new File("src/data").getAbsolutePath();
		
		User admin = new User("admin", "1234");
		users.add(admin);
		save();
	}

	public static DBContext getInstance() {
		return INSTANCE;
	}
	
	public static void serialize(Object obj, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(path + "/" + fileName + ".txt"))) {
			oos.writeObject(obj);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}	
	}
	
	public static Object deserialize(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(path + "/" + fileName + ".txt"))) {
			Object o = ois.readObject();
			return o;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	public static boolean save() {
		DBContext.serialize(users, "users");
		return true;
	}
	
	public static boolean load() {
		// several times
		return true;
	}

	public static String getPath() {
		return path;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public List<User> getUsers() {
		return users;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}
}
