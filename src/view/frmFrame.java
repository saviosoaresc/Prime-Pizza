/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class frmFrame {
        public void InserirIcone(JFrame frm){
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/viewImagens/logo.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
