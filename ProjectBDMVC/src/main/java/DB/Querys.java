
package DB;


public class Querys {
    public String[] deleteQ = {
        "DELETE FROM Serigraphy WHERE done = 0",
        "DELETE FROM Laboratory WHERE done = 0",
        "DELETE FROM Zamak WHERE done = 0",
        "DELETE FROM Carpintery WHERE done = 0",
        "DELETE FROM Sewing WHERE done = 0",
        "DELETE FROM Design WHERE done = 0",
        "DELETE FROM Handicraft WHERE done = 0"
    };
    
    public String getDeleteQ(int i){
        String Q = deleteQ[i];
        return Q;
    }
}
