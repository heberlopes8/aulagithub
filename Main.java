//Atividade 1: Classe Livro com Encapsulamento 
//Crie uma classe Livro com as seguintes caracteristicas;
//Atributo privado:
//titulo(String)
//autor (String)
// ano Publicação(int)
//quantidadePaginas(int)
// Metodos;
//Construtor completoque receba todos os atributos 
//método calcularTempoLeitura()que retorne o tempo estimado de leitura
// método exibirInformações()que imprima todos os detalhes do livro



public class Main{
    public static void main(String[]args){
        Livro livro1 = new Livro("titulo", "autor", 5, 100);
        livro1.exibirInformacoes();    
            
    }
}
