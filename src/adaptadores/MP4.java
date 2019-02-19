package adaptadores;
/*
* Esta CLASE implementa de MediaPackage 
*
*/
public class MP4 implements MediaPackage {
/*
* el metodo de la interface MediaPackage tiene que ser sobre escrito en la 
* la clase. Y en él se introduce el código necesario para su utilización.    
*
*/
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
    
}
