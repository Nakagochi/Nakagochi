package labInterface;

public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void launch() {
		System.out.printf("Running until take-off%n");
		
	}

	@Override
	public void land() {
		System.out.printf("Gliding to a land%n");
		
	}
}
