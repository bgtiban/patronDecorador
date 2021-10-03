package patronDecorador;

public abstract class EnemyDecortator implements Enemy {
	
	private Enemy decoratedEnemy; 
	
	public EnemyDecortator(Enemy enemyToDecorate) {
		this.decoratedEnemy = enemyToDecorate;
	}

	public Enemy getDecortatorEnemy() {
		return decoratedEnemy;
	}

}
