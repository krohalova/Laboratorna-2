/*
 * Decompiled with CFR 0.139.
 */
/**
 * @author krohalova
 * @versin 1.0
 *
public class TitlesFrame
extends JFrame {
    /** Constructs a new TitlesFrame. */
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }

    private void initUI() {
        /*Sets the title for this frame to the specified string
        *@Param: title - the title to be displayed in the frame's border. A null value is treated as an empty string*/
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(94));
        /*sets Size of the frame*/
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}

