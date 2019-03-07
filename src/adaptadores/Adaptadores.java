package adaptadores;

public class Adaptadores {

    public static void main(String[] args) {
        // define el objeto de tipo MediaPlayer
        //instancia el objeto con el constructor tipo MP3
        MediaPlayer player = new MP3();
        //Usa el metodo play de la clase MP3 para mostrar el dato
        player.play("file.mp3");
        /*
         por medio del FormatAdapter instancia el player que es de tipo MediaPlayer
         con un contructor de tipo MediaPackage en ambos casos el de MP4 o VLC
         por lo que así pueden usar el metodo de la interface MediaPlayer en 
        objetos que no implementan esta interface y "convertirse " así en clases
        implementadas de MediaPlayer
         */

        player = new FormatAdapter(new MP4());
        //aqui usa el metodo play de la clase FormatAdapter que está sobre escrito
        // de la interface MediaPlayer.
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        payer= new FormatAdapter(new DivX());
        player.play("file.dvix");
    }

    /*
    * La clase ForatAdapter es una clase estatica dentro de Adaptadores
    * por lo que es una clase que no hay que instanciar para usar su codigo.
    * A su vez esta clase implement de MediaPlayer por lo que tiene que sobreescribir
    *  el metodo play de la interface.
     */
    private static class FormatAdapter implements MediaPlayer {

        /*
        Tiene un atributo privado del tipo MediaPackage que es la interface
         a la que quiere transformar.
         */
        private MediaPackage media;
        private MediaDivX divX;

        /* 
        se crea el contructor en el que se le pasa un objeto que implemente de
        la interface MediaPackage
         */
        public FormatAdapter(MediaPackage m) {
            media = m;
        }

        /**
         * Este metodo es sobreescrito de la interface MediaPlayer pero en el se
         * llama al atributo media que es del tipo MediaPackage por lo que se
         * usa el metodo de esta interface para recoger el tipo de dato
         * MediaPackage y adaptarlo a un objeto que implemente de MediaPlayer
         *
         */
        
        public FormatAdapter(MediaPackage m) {
            divX = m;
        }
        
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            divX.playFilm(filename);
        }
    }
}
