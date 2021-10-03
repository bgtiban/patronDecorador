package patronDecorador;

public class SimpleEnemy implements Enemy{

	@Override
	public int coputeDamage(ReceiveAtack receiveAtack) {
		System.out.println("Oh, me has matado!");
		return 100;
	}

}
