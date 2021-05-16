package av.borisov;

import java.io.*;

/**
 * A class that performs serialization of MyClassToBePersisted objects.
 * @author 	Alexander Borisov
 * @see		{@link MyClassToBePersisted}
 * @see		{@link DeserializeMyClassToBePersisted}
 */
public class SerializeMyClassToBePersisted {
	private SerializeMyClassToBePersisted() {}
	/**
	 * Creates a MyClassToBePersisted object and serializes it into the specified OutputStream.
	 * <p>This method can be accessed only in a static way.
	 * @param profile 		a String to pass into MyClassToBePersisted() constructor
	 * @param group 		a String to pass into MyClassToBePersisted() constructor
	 * @param out 			the OutputStream to serialize a MyClassToBePersisted object into
	 * @throws IOException 	Any exception thrown by the underlying OutputStream.
	 * @see 				{@link MyClassToBePersisted}
	 * @see 				{@link MyClassToBePersisted#MyClassToBePersisted(String, String)}
	 */
	public static void serialize(String profile, String group, OutputStream out) throws IOException {
		MyClassToBePersisted o = new MyClassToBePersisted(profile, group);
		ObjectOutputStream s = new ObjectOutputStream(out);
		s.writeObject(o);
	}
}
