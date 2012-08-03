package com.jsf.compref.filter;
 
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;
 
/**
 * @author Ilya Shaikovsky
 * 
 */
@ManagedBean
@SessionScoped
public class FileUploadBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1117849413742701437L;
	/**
	 * 
	 */

	private static double aspectRatio = 200 / 130;
 
    //private ArrayList<UploadedImage> files = new ArrayList<UploadedImage>();
 
//    public void paint(OutputStream stream, Object object) throws IOException {
//        stream.write(getFiles().get((Integer) object).getData());
//        stream.close();
//    }
 
    public void listener(FileUploadEvent event) throws Exception {
        UploadedFile item = event.getUploadedFile();
        //UploadedImage file = new UploadedImage();
        //file.setLength(item.getData().length);
       // file.setName(item.getName());
       // file.setData(item.getData());
       // files.add(file);
        InputStream in=item.getInputStream();
        ImageInputStream iin = ImageIO.createImageInputStream(in);
        ImageReader reader = ImageIO.getImageReaders(iin).next();
        reader.setInput(iin, true, true);
        BufferedImage original = reader.read(0);
        BufferedImage scaled;
        scaled = awtScaleImage(original);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        
        
    }
    
    
    static BufferedImage awtScaleImage(BufferedImage image) {
		float w = (float)image.getWidth();
		float h = (float)image.getHeight();
		double imageAspectRatio = w / h;
		float scaleFactor = 1.0f;
		if (imageAspectRatio > aspectRatio) {
			scaleFactor = ((float) 200 / (float) w);
		} else {
			scaleFactor = ((float) 130 / (float) h);
		}
		if (scaleFactor > 1)
			return image;
		w =  (w * scaleFactor);
		h = (h * scaleFactor);
		ImageProducer p = new FilteredImageSource(image.getSource(),
				new AreaAveragingScaleFilter((int)w, (int)h));
		java.awt.Canvas c = new java.awt.Canvas();
		Image i = c.createImage(p);
		image = new BufferedImage((int)w, (int)h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		g.drawImage(i, null, null);
		g.dispose();
		i.flush();
		return image;
	}
}

//    public String clearUploadData() {
//        files.clear();
//        return null;
//    }
 
//    public int getSize() {
//        if (getFiles().size() > 0) {
//            return getFiles().size();
//        } else {
//            return 0;
//        }
//    }
 
  