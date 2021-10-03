package patronDecorador;

public class ArmourDecorator extends EnemyDecortator {

	public ArmourDecorator(Enemy enemyToDecorate) {
		super(enemyToDecorate);
	}

	@Override
	public int coputeDamage(ReceiveAtack receiveAtack) {
		int damage = 0;
		
		if(ReceiveAtack.DISPARO_TRONCO_SUPERIOR != receiveAtack) {
			damage = super.getDecortatorEnemy().coputeDamage(receiveAtack);
		}else {
			System.out.println("Auch, mi tronco superior!");
		}
		
		return damage;
	}

}
