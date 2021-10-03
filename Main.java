package patronDecorador;

public class Main {

	public static void main(String[] args) {
		SimpleEnemy enemigoDesnudo = new SimpleEnemy();
		ArmourDecorator enemigoConArmadura = new ArmourDecorator(enemigoDesnudo);
		HelmetDecortator enemigoConArmaduraYCaso = new HelmetDecortator(enemigoConArmadura);
		IronBootsDecorator enemigoConArmaduraCasoYBotasHierro = new IronBootsDecorator(enemigoConArmaduraYCaso);
				
		System.out.println("Daño: " + enemigoConArmaduraCasoYBotasHierro.coputeDamage(ReceiveAtack.DISPARO_CABEZA));
	}

}
