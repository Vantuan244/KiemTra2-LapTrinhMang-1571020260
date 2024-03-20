package Client;

import Models.Session;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//Dương Văn Tuân - 1571020260
public class RunClient {

    //Dương Văn Tuân - 1571020260
    public static void main(String[] args) {
        //Dương Văn Tuân - 1571020260
        //Dương Văn Tuân - 1571020260
        UIManager.LookAndFeelInfo[] lafInfo = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(lafInfo[3].getClassName());
        } catch (Exception e) {
        }
        
//        new FrmDashboard(name).setVisible(true);
        new FrmLogin().setVisible(true);
    }
    
}
