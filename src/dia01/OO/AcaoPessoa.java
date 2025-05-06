package dia01.OO;

public class AcaoPessoa {

    public void compararIdade(Pessoa pessoa1, Pessoa pessoa2) {
        if(pessoa1.getIdade() > pessoa2.getIdade()) {
            System.out.println(pessoa1.getNome() + " é mais velho que " + pessoa2.getNome());
        } else if(pessoa1.getIdade() == pessoa2.getIdade()) {
            System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " tem a mesma idade!");
        } else {
            System.out.println(pessoa2.getNome() + " é mais velho que " + pessoa1.getNome());
        }
    }


}
