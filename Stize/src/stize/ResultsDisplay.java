package stize;
import stize.Clothes;
import java.util.ArrayList;
import stize.Clothes;
import stize.Stize;


public class ResultsDisplay extends javax.swing.JFrame {
     /**
     * Creates new form ResultDisplay
     */
    private ArrayList<Clothes> clothes;
    public ResultsDisplay(ArrayList<Clothes>clothes)
    {        
        this.clothes = clothes;
        initComponents();
    }
    /**
     * Creates new form ResultDisplay
     */
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newpackage/img-thing.gif"))); // NOI18N
        jLabel1.setText("Next");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newpackage/FCD6D9AF.gif"))); // NOI18N
        jLabel2.setText("Previous");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(clothes.get(0).getFilename()))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 100));

        jButton1.setText("Exit");

        jButton2.setText("Add to cart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(104, 104, 104)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        
        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}
    




