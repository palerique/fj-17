package ph.sitedo.model;

import java.util.Calendar;

/**
 * Created by ph on 5/12/15.
 */
public class Pagamento {

  private String   pagador;
  private CNPJ     cnpjPagador;
  private double   valor;
  private Calendar data;

  public String getPagador() {

    return this.pagador;
  }

  public void setPagador(String pagador) {

    this.pagador = pagador;
  }

  public CNPJ getCnpjPagador() {

    return this.cnpjPagador;
  }

  public void setCnpjPagador(CNPJ cnpjPagador) {

    this.cnpjPagador = cnpjPagador;
  }

  public double getValor() {

    return this.valor;
  }

  public void setValor(double valor) {

    this.valor = valor;
  }

  public Calendar getData() {

    return this.data;
  }

  public void setData(Calendar data) {

    this.data = data;
  }
}
