package ProjetoVeiculosEstagiario;
import java.time.LocalDate;
import java.util.ArrayList;
        abstract class Veiculos {

    protected int codigo;
    public String nome;
    public String modelo;
    public String cor;
    public String chassi;
    public String placa;
    public String anoMOdelo;
    public String anoFabricacao;
    public String eixos;
    public double pesoLiquido;
    public String pesoTotal;
    public int assentos; 
    public int portas;
    public String fabricante; 
    public double potencia;
    public String tipoCombustivel;
    public String codigoRenavam;
    public String nomeProprietario;
    public String estadoUF;
    public String tipoveiculo;
    public int qtdeMotores;
    public int qtdeOcupantes;

            public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getAnoMOdelo() {
        return anoMOdelo;
    }
    public void setAnoMOdelo(String anoMOdelo) {
        this.anoMOdelo = anoMOdelo;
    }
    public String getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getEixos() {
        return eixos;
    }
    public void setEixos(String eixos) {
        this.eixos = eixos;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public String getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(String pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getTipoveiculo() {
        return tipoveiculo;
    }
    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    
}
    public Veiculos(int codigo, String nome, String modelo, String cor, String chassi, String placa, String anoMOdelo,
            String anoFabricacao, String eixos, double pesoLiquido, String pesoTotal, int assentos, int portas,
            String fabricante, double potencia, String tipoCombustivel, String codigoRenavam, String nomeProprietario,
            String estadoUF, String tipoveiculo, int qtdeMotores, int qtdeOcupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anoMOdelo = anoMOdelo;
        this.anoFabricacao = anoFabricacao;
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.portas = portas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.tipoveiculo = tipoveiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    
}

