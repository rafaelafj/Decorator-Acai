
public class BaseDecorator implements Adicional {
	
	private Adicional wrapper;
	
	public BaseDecorator(Adicional adc) {
		this.wrapper = adc;
	}
	
	@Override
	public String getDescricao() {
		return wrapper.getDescricao();
	}
	
	@Override
	public float custo() {
		return wrapper.custo();
	}
	
}
