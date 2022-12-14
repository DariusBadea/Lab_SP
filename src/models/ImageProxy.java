package models;

import java.awt.*;
import java.io.IOException;

public class ImageProxy {

    String url ="C:\\Users\\Darius\\Desktop\\poza.jpg";
    Dimension dim;
    Image realImage = new Image("ceva");


    public ImageProxy(String path){
        this.url=path;
    }

    public ImageProxy() throws IOException {
    }


    Image loadImage(){
        if (realImage==null) {
            realImage = new Image(url);
        }
        return realImage;
    };

}
