import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Conta {
    
	/**
	 * @author danilobarros
	 * @param arg1
	 * @param arg2
	 * @throws Throwable
	 */
	
	
	private int saldo;
	private int saque;
	
	@Given("^Um cliente especial com saldo atual de -(\\d+)")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable{
        saldo = arg1;
        System.out.println("Cliente especial criado com saldo inicial de: " + saldo + " reais");
        throw new PendingException();
    }
		
    @When("^For solicitado um saque no valor de -(\\d+) reais$")
    public void for_solicitado_um_saque_de_reais(int arg1) {
        saque = arg1;
        System.out.println("Cliente especial solicitou o saque de: " + saque + " reais");
        throw new PendingException();
    }

    @Then("^Deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_conta_para_reais(int arg1) throws Throwable{
    	saldo -= arg1;
        System.out.println("Cliente especial com saldo atualizado é de: " + saldo + " reais, deveria ir para: " + arg1);
        throw new PendingException();
    }
    @And("^Check more outcomes$")
    public void check_more_outcomes (int arg1) throws Throwable{
    	System.out.println("Cliente especial tem o saque atual de: " + saque + " reais");
    	System.out.println("Cliente especial tem o saldo atual de: " + saldo + " reais");
        throw new PendingException();
    }
    
    @Given("^Um cliente comum com saldo atual de -(\\d+) reais$")
    public void um_cliente_comum_com_saldo_atual_de_reais(int arg2) throws Throwable {
    	 saque = arg2;
         System.out.println("Cliente comum criado com o saldo de: " + saque + " reais");
         throw new PendingException();
    }

    @When("^Solicitar um saque de (\\d+) reais$")
    public void solicitar_um_saque_de_reais(int arg2) throws Throwable {
    	  saque = arg2;
          System.out.println("Cliente comum solicitou o saque de: " + saque + " reais");
          throw new PendingException();
    }

    @Then("^Nao deve efetuar o saque e deve retornar a mensagem de saldo insuficiente$")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_de_saldo_insuficiente(int arg2) throws Throwable {
        System.out.println("Cliente comum está com saldo insuficiente: ");
        throw new PendingException();
    }
    
}