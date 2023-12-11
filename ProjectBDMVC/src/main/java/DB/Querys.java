
package DB;


public class Querys {
    public String[] deleteQ = {
        "DELETE FROM SerigraphyLaboratory WHERE done = 0",
        "DELETE FROM LaboratoryProduction WHERE done = 0",
        "DELETE FROM ZamakProduction WHERE done = 0",
        "DELETE FROM CarpinteryProduction WHERE done = 0",
        "DELETE FROM SewingProduction WHERE done = 0",
        "DELETE FROM DesignProduction WHERE done = 0",
        "DELETE FROM HandicraftProduction WHERE done = 0"
    };
    
    public String[] updateQ = {
        "UPDATE SerigraphyLaboratory SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE LaboratoryProduction SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE ZamakProduction SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE CarpinteryProduction SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE SewingProduction SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE DesignProduction SET done = ? WHERE codigo = ? AND nombre = ?",
        "UPDATE HandicraftProduction SET done = ? WHERE codigo = ? AND nombre = ?"
    };
    
    public String[] selectQ = {
        "SELECT * FROM SerigraphyLaboratory WHERE done = 0",
        "SELECT * FROM LaboratoryProduction WHERE done = 0",
        "SELECT * FROM ZamakProduction WHERE done = 0",
        "SELECT * FROM CarpinteryProduction WHERE done = 0",
        "SELECT * FROM SewingProduction WHERE done = 0",
        "SELECT * FROM DesignProduction WHERE done = 0",
        "SELECT * FROM HandicraftProduction WHERE done = 0"
    };
    
    public String[] ordenQ = {
        "SELECT COUNT(*) FROM SerigraphyLaboratory WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM LaboratoryProduction WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM ZamakProduction WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM CarpinteryProduction WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM SewingProduction WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM DesignProduction WHERE codigo = ? AND id <> ?",
        "SELECT COUNT(*) FROM HandicraftProduction WHERE codigo = ? AND id <> ?"
    };
    
    public String getDeleteQ(int i){
        String Q = deleteQ[i];
        return Q;
    }
    
    public String getUpdateQ(int i){
        String Q = updateQ[i];
        return Q;
    }
    
    public String getSelectQ(int i){
        String Q = selectQ[i];
        return Q;
    }
    
    public String getOrdenQ(int i){
        String Q = ordenQ[i];
        return Q;
    }
}
