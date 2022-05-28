
public class Morango extends BaseDecorator{
	
	public Morango(Adicional adc) {
		super(adc);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + "Morango";
	}
	
	@Override
	public float custo() {
		return super.custo() + 4.0f;
	}
	
}
