package ph.sitedo.model;

import java.util.HashMap;

/**
 * Created by ph on 5/12/15.
 */
public class BalancoEmpresa {

  private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

  public void registraDivida(String credor, String cnpjCredor, double valor) {

    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);
    dividas.put(cnpjCredor, divida);
  }

  public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {

    Divida divida = dividas.get(cnpjCredor);
    if (divida != null) {
      Pagamento pagamento = new Pagamento();
      pagamento.setCnpjPagador(new CNPJ(cnpjPagador));
      pagamento.setPagador(nomePagador);
      pagamento.setValor(valor);
      divida.registra(pagamento);
    }
  }
}
