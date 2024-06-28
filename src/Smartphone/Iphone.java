package Smartphone;
import Internet.NavegadorInternet;
import Ipod.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
   
        public void tocar() {
            System.out.println("TOCANDO MUSICA");
        }
        public void pausa() {
            System.out.println("PAUSANDO MUSICA");
        }
        public void selecionarMusica() {
            System.out.println("SELECIONANDO MUSICA");
        }
        public void exibirPagina(){
            System.out.println("EXIBINDO PAGINA");
        }
        public void adicionarNovaAba() {
            System.out.println("ADICIONANDO NOVA ABA");
        }
        public void atualizarPagina() {
            System.out.println("ATUALIZANDO PAGINA");
        }
        public void ligar(){
            System.out.println("LIGANDO");
        }
        public void atender(){
        System.out.println("ATENDENDO CHAMADA");
        }
        public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
        }

        
    
    
}
