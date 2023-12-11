
package Model;

import java.util.List;


public interface ordersDAO {
    public List<orders> Listarorders();
    void update(int _order, String _product,int  _newDone);
}
