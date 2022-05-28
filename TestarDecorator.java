
public class TestarDecorator {
	
	public static void main(String[] args) {

		Adicional p1 = new Acai();
		Adicional p2 = new Banana(p1);
		Adicional p3 = new Morango(p2);
		Adicional p4 = new LeiteCondensado(p3);

		System.out.println(p4.getDescricao() + "\n" + p4.custo());
	}
}


