/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.User;
import repository.TaxIncomeRepository;

/**
 *
 * @author GoldCandy
 */
public class TaxIncomeController {
    TaxIncomeRepository repo;
    User user;
    
    public TaxIncomeController(){
        repo = new TaxIncomeRepository();
        user = new User();
    }
    
    public void run(){
        repo.taxIncome(user);
    }
}
