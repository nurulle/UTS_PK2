
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Choco Calon Presiden RI
 */

//buat di gambar nya
public class fungsi {
    public ImageIcon resizePic(String picPath, byte[] BLOPpic, int wdth, int hgt){
        ImageIcon myImg;
        
        
        if (picPath != null) {
            myImg = new ImageIcon(picPath);
        }else{
            myImg = new ImageIcon(BLOPpic);
        }
     
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new  ImageIcon(img);
        return myPicture;
    }
    
    public  String browseImage(JLabel lbl){
        
        String path = "";
     JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //fileekstensi
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(fileFilter);
        
        int FileState = filec.showSaveDialog(null);
        
        //jika user memilih file
        if (FileState == JFileChooser.APPROVE_OPTION) {
            
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
//            imagepth = path;
            
            
            lbl.setIcon(resizePic(path,null, lbl.getWidth(), lbl.getHeight()));
        }
        
        else if(FileState == JFileChooser.CANCEL_OPTION){
            System.out.println("tidak ada gambar yang di pilih");
        }
        return path;
}

}
            

