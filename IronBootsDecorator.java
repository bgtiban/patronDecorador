package patronDecorador;

public class IronBootsDecorator extends EnemyDecortator {

	public IronBootsDecorator(Enemy enemyToDecorate) {
		super(enemyToDecorate);
	}

	@Override
	public int coputeDamage(ReceiveAtack receiveAtack) {
		int damage = 0;
		
		if(ReceiveAtack.DISPARO_TRONCO_INFERIOR != receiveAtack) {
			super.getDecortatorEnemy().coputeDamage(receiveAtack);
		}else {
			System.out.println("Auch, mis piernas!");
		}
		
		return damage;
	}

}
