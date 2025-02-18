package festas;

public class FestaVip {
    // <modificador> <tipo> <nome-atributo>
    private int quantidadeCafe = 30;
    private int quantidadeSalgado = 50;

    public void entrar(){
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificador> <retorno-método> <nome-método>
    private void beberCafe(){
        quantidadeCafe--; // quantidadeCafe = quantidadeCafe - 1;
        System.out.println("Bebeu 1 xícara de café");
    }

    private void comerSalgado(){
        quantidadeSalgado--; // quantidadeSalgado = quantidadeSalgado - 1;
        System.out.println("Comeu 5 salgados");
    }
}