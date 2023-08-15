/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;
import br.com.calculo.Semestre;
import javax.swing.JOptionPane;
/**
 *
 * @author laboratorio
 */
public class visao {
    public static void main(String[] args) {
        Semestre s = new Semestre();
        s.setNota1(Double.valueOf(JOptionPane.showInputDialog("Digite sua primeira nota:")));
        s.setNota2(Double.valueOf(JOptionPane.showInputDialog("Digite sua segunda nota:")));
        if(s.media()<4.0){
            JOptionPane.showMessageDialog(null,s.media()+("Reprovado"));
        }
        else if(s.media()>=4.0 && s.media()<6.0){
            JOptionPane.showMessageDialog(null,s.media()+("Recuperação"));
        }        
    else{
    JOptionPane.showMessageDialog(null,s.media()+(" Aprovado"));
}
        
    }
}
 

