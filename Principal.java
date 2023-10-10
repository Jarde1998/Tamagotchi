//Nome: Jardel Nikolas Ferreira Mathias

import java.util.Random;
public class Principal{
    
    public static void main(String[] args){
        System.out.println("\t|| JOGO DO TAMAGOTCHI ||");
        String nome = Teclado.leString("\nDigite um nome para seu Tamagotchi:");
        Tamagotchi tamagotchi = new Tamagotchi(nome);
        //while para que o programa repita até que haja uma parada:
        while (true){
            Random aleatorio = new Random();
            int desejo = aleatorio.nextInt(3);
            
            //Logicas de parada:
            if (tamagotchi.getVida() >= 15){
                System.out.println("\nSeu Tamagotchi ficou com 15 de vida e morreu!!");
                break;
            }
            if (tamagotchi.getPeso() <= 0){
                System.out.println("\nTamagotchi ficou com 0kg e morreu de desnutrição!");
                break;
            }
            else if (tamagotchi.getPeso() > 20){
                System.out.println("\nTamagotchi ultrapasou os 20kg e explodiu!");
                break;
            }
            
            //Status do Tamagotchi com as informações dele:
            System.out.println("\nINFORMAÇÕES DO TAMAGOTCHI");
            System.out.println("\nNome do Tamagotchi: "+tamagotchi.getNome());
            System.out.println("Vida do Tamagotchi: "+tamagotchi.getVida());
            System.out.println("Peso do Tamagotchi(kg): "+tamagotchi.getPeso());
            
            // Criei tres "int" que representam os metodos criados na classe Tamagotchi.
            int sentirSono = 0;
            int sentirFome = 1;
            int ficarEntediado = 2;
            
            //A variável "desejo" recebe o numero aleatorio e dependendo de qual for o número o prgrama
            //chama os métodos necessários.
            if (desejo == 0){
                tamagotchi.sentirSono();
            }
            else if (desejo == 1){
                tamagotchi.sentirFome();
            }
            else if (desejo == 2){
                tamagotchi.ficarEntediado();
                String opçao = Teclado.leString("Correr 10 minutos ou caminhar 10 minutos?");
                if ("Correr 10 minutos".equals(opçao)||"correr 10 minutos".equals(opçao)||"Correr".equals(opçao)||"correr".equals(opçao)){
                    tamagotchi.correr();
                }
                else if ("Caminhar 10 minutos".equals(opçao)||"caminhar 10 minutos".equals(opçao)||"Caminhar".equals(opçao)||"caminhar".equals(opçao)){
                    tamagotchi.caminhar();
                    tamagotchi.sentirFome();
                }
                else{
                    System.out.println("Opção inválida!");
                }
            }
            
        }
        
       
        
    }
    
}
