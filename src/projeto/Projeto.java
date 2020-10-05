package projeto;

public class Projeto {

    public static void main(String[] args) {
        
        TeladeCadastro formularioCadastro = new TeladeCadastro();
        Pessoa cliente = new Pessoa(formularioCadastro.nome, 
                formularioCadastro.email, "12345", formularioCadastro.cpf, 1, 
                formularioCadastro.endereco, formularioCadastro.cidade, 1);
        
    }
    
}
