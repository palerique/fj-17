package ph.sitedo.model;

/**
 * Created by ph on 5/12/15.
 */
public class CNPJ {

  private String valor;

  public CNPJ(String valor) {

    this.valor = valor;
  }

  public String getValor() {

    return valor;
  }

  public boolean ehValido() {

    return primeiroDigitoVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador() == segundoDigitoCorreto();
  }

  private int primeiroDigitoVerificador() {
    // Extrai o primeiro dígito verificador do CNPJ armazenado
    // no atributo valor
    return 0;
  }

  private int primeiroDigitoCorreto() {
    // Calcula o primeiro dígito verificador correto para
    // o CNPJ armazenado no atributo valor
    return 0;
  }

  private int segundoDigitoVerificador() {
    // Extrai o segundo dígito verificador do CNPJ armazenado
    // no atributo valor
    return 0;
  }

  private int segundoDigitoCorreto() {
    // Calcula o segundo dígito verificador correto para
    // o CNPJ armazenado no atributo valor
    return 0;
  }
}
