
public class Banana extends BaseDecorator {
	
	public Banana (Adicional adc) {
		super (adc);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + "Banana";
	}
	
	@Override
	public float custo() {
		return super.custo() + 2.0f;
	}
}
