package entidades;

public class PessoaJuridica extends Pessoa {
	
	private int numFuncionario;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	
	@Override
	public double calculoImposto() {
		double imp=0.0;
		if(numFuncionario<=10) {
			imp=getRendaAnual()*0.16;
		}else if(numFuncionario>10){
			imp=getRendaAnual()*0.14;
		}
		return imp;
	}

	
}
