// Nome: Jardel Nikolas Ferreira Mathias
public class Tamagotchi{
    private String nome;
    private int vida, peso, i;
    //Incializaçao dos atributos:
    public Tamagotchi(String nome){
        vida = 0;
        peso = 1;
        this.nome = nome;
        i = 5;
        }
    //Metodos de acesso get e set:  
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public String getNome(){
        return nome;
    }
    //Método sentirSono:
    //Através da variável "i", é possivel controlar quando o Tamagotchi fica 
    //acordado 5 vezes seguidas.
    public void sentirSono(){
        System.out.println("\nTamagotchi está com sono!");
        String opçao = Teclado.leString("\nDormir ou permanecer acordado?");
        if ("Dormir".equals(opçao)||"dormir".equals(opçao)){
            i = 5;
            System.out.println("\nTamagotchi dormiu e aumentou em 1 a vida.");
            vida++;
        }
        else if ("Permanecer acordado".equals(opçao)||"permanecer acordado".equals(opçao)){
            i--;
            System.out.println("\nTamagotchi permaneceu acordado!");
            if (i == 0){
                System.out.println("Tamagotchi não aguentou e desmaiou de sono!\nPor causa disso ele aumentou em 1 a vida.");
                vida++;
                i = 5;
            }
        }
        else{
            System.out.println("Opção inválida!");
        }
    }
    //Método sentirFome:
    //Atraves da variavel opçoes e possivel determinar o que o usuário pretende fazer.
    public void sentirFome(){
        System.out.println("\nTamagotchi está com fome!");
        String opçao = Teclado.leString("\nComer muito, comer pouco ou não comer?");
        if ("Comer muito".equals(opçao)||"comer muito".equals(opçao)){
            System.out.println("\nTamagotchi comeu muito e aumentou em 1kg e foi dormir!\nPor causa disso a vida dele aumentou em 1.");
            peso = peso + 5;
            vida++;
        }
        else if ("Comer pouco".equals(opçao)||"comer pouco".equals(opçao)){
            System.out.println("\nTamagotchi comeu pouco e aumentou 1kg!");
            peso++;
        }
        else if ("Não comer".equals(opçao)||"Nao comer".equals(opçao)||"não comer".equals(opçao)||"nao comer".equals(opçao)){
            peso = peso - 2;
            System.out.println("\nTamagotchi não comeu e por causa disso perdeu 2 kg!");
        }
        else {
            System.out.println("\nOpção inválida!");
        }
    }
    
    //Métodos ficarEntediado:
    //Aqui eu quebrei em três, pois caso o usuário decida caminhar eu 
    //posso instanciar em seguida o metodo sentirFome.
    public void ficarEntediado(){
        System.out.println("\nTamagotchi está entediado!");
    }
    public void caminhar(){
        System.out.println("\nTamagotchi caminho  10 minutos e por isso perdeu 1kg, agora ele precisa comer!");
        peso = peso - 1;
    }
    public void correr(){
        System.out.println("\nTamagotchi correu 10 min e emagreceu 4kg, por isso acabou comendo muito e ganhou 5 kg");
        peso = peso - 4;
        peso = peso + 5;
    }
}
