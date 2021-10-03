package patronDecorador;

public class HelmetDecortator extends EnemyDecortator {

	public HelmetDecortator(Enemy enemyToDecorate) {
		super(enemyToDecorate);
	}

	@Override
	public int coputeDamage(ReceiveAtack receiveAtack) {
		int damage = 0;
		
		if(ReceiveAtack.DISPARO_CABEZA != receiveAtack) {
			damage = super.getDecortatorEnemy().coputeDamage(receiveAtack);
		}else {
			System.out.println("Llevo casco!");
		}
		
		return damage;
	}

}
