package entidades;

public class PessoaFisica extends Pessoa{
	
	private double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double calculoImposto() {
		double imp=0;
		if(getRendaAnual()<2000) {
			imp = getRendaAnual()*0.15;
			imp-=gastosSaude;
		}else if(getRendaAnual()>=2000){
			imp = getRendaAnual()*0.25;
			imp-=gastosSaude;
		}
		return imp;
	}

	

	
}
