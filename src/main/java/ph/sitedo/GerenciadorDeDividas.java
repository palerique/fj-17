package ph.sitedo;

import ph.sitedo.model.Divida;

/**
 * Created by ph on 5/12/15.
 */
public class GerenciadorDeDividas {

  public void efetuaPagamento(Divida divida, double valor) {

    divida.setValorPago(divida.getValorPago() + valor);

  }

}
