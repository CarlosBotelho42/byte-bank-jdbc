package br.com.carlao.bytebank.domain.conta;

import br.com.carlao.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
