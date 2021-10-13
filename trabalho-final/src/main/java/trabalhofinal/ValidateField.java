/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Marco
 */
public class ValidateField {
    
   public static boolean validateCpf(JTextField txtCpf){
       
       int lenghtCpf = txtCpf.getText().trim().length();
       
       try{
           if(lenghtCpf < 14)
               throw new Exception();
           
           return true;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Preencha o CPF corretamente.");
           return false;
       }
   }
   
   public static boolean validatePhone(JTextField txtPhone){
       
       int lenghtPhone = txtPhone.getText().trim().length();
       
       try{
           if(lenghtPhone < 14)
               throw new Exception();
           
           return true;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Preencha o telefone corretamente.");
           return false;
       }
   }
   
   public static boolean blankField(JTextField txt){
       return true;
   }
}

