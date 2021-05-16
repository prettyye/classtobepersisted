package av.borisov;

import java.io.*;

/**
 * A class with two String fields that implements Serializable interface.
 * <p>For serialization and deserialization use corresponding static methods of
 * SerializeMyClassToBePersisted and DeserializeMyClassToBePersisted classes.
 * @author 	Alexander Borisov
 * @see		{@link SerializeMyClassToBePersisted}
 * @see		{@link DeserializeMyClassToBePersisted}
 */
public class MyClassToBePersisted implements Serializable {
	/**
	 * This field is part of the {@linkplain Serializable serialization mechanism} defined 
	 * by the <cite>Java Object Serialization Specification</cite>.
	 */
	@Serial
	private static final long serialVersionUID = -8834651720919018338L;
	
	private String profile;
	private String group;
	
	/**
	 * A constructor that initializes class field with the specified parameters.
	 * @param profile	a String to initialize profile field with
	 * @param group		a String to initialize group field with
	 */
	public MyClassToBePersisted(String profile, String group) {
		this.profile = profile;
		this.group = group;
	}
	
	/**
	 * Returns a string reprsentation of the object in the format of
	 * <i>"[Profile: (profile); Group: (group)]"</i>
	 */
	@Override
	public String toString() {
		return "[Profile: "+profile+"; Group: "+group+"]";
	}
}
