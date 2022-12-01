import java.io.*;
import java.util.Scanner;
public class workpok 
{

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		File pokemon;
		Scanner entrada;
	
		try 
		{
			
			pokemon = new File("Pokemon.txt");
			entrada = new Scanner(pokemon);
			
			int pos=0;
			int conta=0;
		
			
			while(entrada.hasNextLine())
			{
				conta++;
				System.out.println(entrada.nextLine());
			}
			
			String[] nome = new String[conta];
			int[] candels = new int[conta];
			String[] evolui =  new String[conta];
			
			System.out.println(conta);
			
			while(entrada.hasNextLine())
			{
				System.out.println("TESTE");
				String[] txtSeparado= entrada.nextLine().split(";");
				
				nome[pos] = txtSeparado[0];
				candels[pos]= Integer.parseInt(txtSeparado[1]);
				evolui[pos]= txtSeparado[2];
				
				pos++;
				
			}
			
			for(int i=0;i<nome.length;i++)
			{
				System.out.println(nome[i]);
			}
			
			entrada.close();
			ler.close();
		
		}
		catch (IOException e) 
		{
			System.out.println("ERRO");
		}
		

		
	}
	
	

}
