package labPolymorphism;

import java.util.ArrayList;

public class DogApp {
	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();

		Dog myDog = new Dog("Greyhound");
		actAsDog(myDog);

		SledDog mySledDog = new SledDog("Husky");
		actAsDog(mySledDog);

		CircusDog myCircusDog = new CircusDog("Terrier");
		actAsDog(myCircusDog);
		ServiceDog myServiceDog = new ServiceDog("Shitzu");
		actAsDog(myServiceDog);
		SeeingDog mySeeingDog = new SeeingDog("Golden Retriver");
		actAsDog(mySeeingDog);
		ComfortDog myComfortDog = new ComfortDog("Beagle");
		actAsDog(myComfortDog);
		dog.add(myDog);
		dog.add(myDog);
		dog.add(mySledDog);
		dog.add(myCircusDog);
		dog.add(myServiceDog);
		dog.add(mySeeingDog);
		dog.add(myComfortDog);
		System.out.println("Using an Array: ");
		System.out.println();
		for(int x = 0; x!=dog.size(); x++) {
			actAsDog(dog.get(x));
		}

	}

	private static void actAsDog(Dog d) {
		System.out.println(d);
	if(d instanceof CircusDog) {
		d.move();
	}
	if(d instanceof SledDog) {
		((SledDog)d).pullSled();
	}
	if(d instanceof ServiceDog) {
		((ServiceDog) d).service();
	}
	if(d instanceof SeeingDog) {
		((SeeingDog)d).see();
	}
	if(d instanceof ComfortDog) {
		((ComfortDog)d).comfort();
		((ComfortDog)d).lick();
	}
		
		
		d.communicate();
		d.move();
		System.out.println();
	}
}
