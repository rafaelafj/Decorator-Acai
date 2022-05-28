
public class Acai implements Adicional {
	
	private String desc = "Açai";
	private float valorAcai = 15;
	
	@Override
	public String getDescricao() {
		return desc;
	}
	
	@Override
	public float custo() {
		return valorAcai;
	}

}
