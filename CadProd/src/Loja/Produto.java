/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

/**
 *
 * @author labc
 */
public class Produto {
    //Atributos da Classe
    private int codigo;
    private String descricao;
    private float preco;
    
    //Método Construtor (com parâmetros)
    public Produto(int codigo, String descricao, float preco)
    {
        this.codigo=codigo;
        this.descricao=descricao;
        this.preco=preco;
    }        
    //Métodos de Manipulação Get e Set
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco=preco;
    }
    //Desenvolvimento dos Métodos
    public float calcularPrecoFinal()
    {
        return preco=preco*10/100;
    }
    public float exibirPrestacoes(int n){
        return calcularPrecoFinal() / n;
    }
    public String exibirDados()
    {
        return "Codigo: "+getPreco()+"\nDescricao:"+getDescricao()+"\nPreco: "+getPreco()+"\nPreco Final: "+calcularPrecoFinal();
    }
} //fim da classe
