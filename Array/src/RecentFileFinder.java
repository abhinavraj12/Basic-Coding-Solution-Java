import java.io.File;
import java.io.FileFilter;


public class RecentFileFinder {
	public File getTheNewestFile(String filePath, String ext) {
	    File theNewestFile = null;
	    File dir = new File(filePath);
	   // FileFilter fileFilter = new WildcardFileFilter("*." + ext);
	    //File[] files = dir.listFiles(fileFilter);

//	    if (files.length > 0) {
//	       
//	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
//	        theNewestFile = files[0];
//	    }

	    return theNewestFile;
	}

	public static void main(String[] args) {
		
	}

}
