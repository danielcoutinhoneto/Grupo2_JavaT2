package cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {
	
	public ArrayList<Usuario> usuarios;
	public ArrayList<Sessao> sessoes;
	public ArrayList<Amizade> amizades;
	
	Programa(){
		this.usuarios = new ArrayList<>();
		this.sessoes = new ArrayList<>();
		this.amizades = new ArrayList<>();
	}
	
	public void	CriaUsuario() {
		Scanner scanner = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        
        usuarios.add(usuario);
       //FALTA VALIDAÇÃO DOS USUÁRIOS
        
	}
	

    public void RemoverUsuario() {
    	Scanner scanner = new Scanner(System.in);
    	 System.out.print("Digite seu nome: ");
         String nome = scanner.nextLine();
         
         System.out.print("Digite sua senha: ");
         String senha = scanner.nextLine();
         
         for(int i = 0; i < usuarios.size(); i++)
         {
             Usuario p = usuarios.get(i);

             if(p.getNome().equals(nome) && p.getSenha().equals(senha))
             {
                 // Encontrou uma pessoa cadastrada com nome "Pedro".

                 // Remove.
                 usuarios.remove(p);

                 // Sai do loop.
                 break;
             }
         }
         
         
    }
    
    public void Logar() {
    	
    	Scanner scanner = new Scanner(System.in);
   	 	System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        for(int i = 0; i < usuarios.size(); i++)
        {
            Usuario p = usuarios.get(i);

            if(p.getNome().equals(nome) && p.getSenha().equals(senha))
            {
                Sessao sessao = new Sessao(this.usuarios, this.amizades);
                System.out.println("Logou");    	
                //sessao.menu();
                this.sessoes.add(sessao);
                break;
            }
        }
    	

         
    }
    
    public static void main(String[] args) {
    	
    Programa programa = new Programa()
;
    
    programa.CriaUsuario();
    programa.Logar();

    for (Usuario x : programa.usuarios) {
    	System.out.println(x.getNome() + x.getEmail());    	
    }

    
    }

}
