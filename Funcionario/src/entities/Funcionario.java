package entities;

public class Funcionario {
	
	public String cargo;
	public String nome;
	public double salario;
	
	public void verificaComissao(){
		
		if(cargo.equals ("gerente") && salario < 5000) {
			System.out.println(	salario = salario + (salario * 0.015));
			
		}
		if (cargo.equals("vendedor") && salario < 1500){
			System.out.println(	salario = salario + (salario * 0.02));
		}
		
	}

}

