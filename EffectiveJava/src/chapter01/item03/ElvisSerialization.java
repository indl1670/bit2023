package chapter01.item03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ElvisSerialization {

	public static void main(String[] args) {
		// 직렬화를 통해 객체 정보 저장
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
			out.writeObject(Elvis.INSTANCE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 역직렬화를 통해 저장된 객체 읽어옴
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
			Elvis elvis3 = (Elvis) in.readObject();
			System.out.println(elvis3 == elvis3.INSTANCE); // false
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
