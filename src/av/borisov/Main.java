package av.borisov;

import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Создаём и сериализуем через класс SerializeMyClassToBePersisted "
				+ "объект [Profile: Gregory; Group: 759]\n"
				+ "класса MyClassToBePersisted в файл \"object\"...\n");
		SerializeMyClassToBePersisted.serialize("Gregory", "759", new FileOutputStream("object"));
		
		System.out.println("Десериализуем объект из файла \"object\"...");
		MyClassToBePersisted object = DeserializeMyClassToBePersisted.deserialize(new FileInputStream("object"));
		System.out.print("Восстановленный объект: ");
		System.out.print(object);
	}
}