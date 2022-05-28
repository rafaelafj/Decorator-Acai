
public class LeiteCondensado extends BaseDecorator {
	
	public LeiteCondensado (Adicional adc) {
		super(adc);
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + "Leite Condensado";
	}
	
	@Override
	public float custo() {
		return super.custo() + 3.0f;
	}
	
}
