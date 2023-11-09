/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Mario
 */
public interface ordersDAO {
    public List<orders> Listarorders();
    void update(int _order, String _product,int  _newDone);
}
