package labSerialization;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
	static String filename = "Demo.ser";
    public static void main(String[] args) {
        ListVsSetDemo2 demo = new ListVsSetDemo2(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW),
        		new ColoredSquare(14, Color.RED),
                new ColoredSquare(16, Color.BLUE),
                new ColoredSquare(14, Color.RED),
                new ColoredSquare(18, Color.YELLOW));

        testDemo(demo);
        
        serialize(demo,filename);
        ListVsSetDemo2 demo2 = deSerialize(filename);
        
        testDemo(demo2);

    };

    private static void testDemo(ListVsSetDemo2 demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
		System.out.println(demo.getSetElements());

	}

	private static void serialize(ListVsSetDemo2 demo, String filename) {
    	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(filename)))){
    		out.writeObject(demo);
    	} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("IO error");
		}
    	
    }
	private static ListVsSetDemo2 deSerialize( String filename) {
    	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(filename)))){
    		return(ListVsSetDemo2) in.readObject();
    	} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("IO error");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Class not found");
		}
		return null;
    	
    }
	
}
