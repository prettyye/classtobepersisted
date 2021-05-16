package av.borisov;

import java.io.*;

/**
 * A class that performs deserialization of MyClassToBePersisted objects.
 * @author 	Alexander Borisov
 * @see		{@link MyClassToBePersisted}
 * @see		{@link SerializeMyClassToBePersisted}
 */
public class DeserializeMyClassToBePersisted {
	private DeserializeMyClassToBePersisted() {}
	/**
	 * Deserializes a MyClassToBePersisted object from the specified InputStream.
	 * <p>This method can be accessed only in a static way.
	 * @param in 						the InputStream to deserialize a MyClassToBePersisted object from.
	 * @return 							The deserialized MyClassToBePersistedObject.
	 * @throws IOException				Any exception thrown by the underlying InputStream.
	 * @throws ClassNotFoundException	If the class of an object cannot be found.
	 * @see 							{@link MyClassToBePersisted}
	 */
	public static MyClassToBePersisted deserialize(InputStream in) throws IOException, ClassNotFoundException {
		ObjectInputStream s = new ObjectInputStream(in);
		return (MyClassToBePersisted) s.readObject();
	}
}
