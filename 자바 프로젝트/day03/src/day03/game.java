package day03;

class job
{
	int hp;
	int mp;
	void attacked() {};
}

class warrior extends job
{
	void attacked()
	{
		--hp;
	}
	
	void attacked(int i)
	{
		hp -= i;
	}
}

public class game
{

	public static void main(String[] args)
	{
		System.out.print(1);
	}

}