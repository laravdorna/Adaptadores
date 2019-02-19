package adaptadores;
/*
* Esta CLASE implementa de MediaPlayer 
*
*/
public class MP3 implements MediaPlayer {
/*
* el metodo de la interface MediaPlayer tiene que ser sobre escrito en la 
* la clase. Y en él se introduce el código necesario para su utilización.    
*
*/
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
    
}
