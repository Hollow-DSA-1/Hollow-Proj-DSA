/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * form1.java
 *
 * Created on Feb 20, 2014, 7:01:42 PM
 */
package dsaproject;

import javax.swing.JOptionPane;

/**
 *
 * @author gilbert
 */
public class form1 extends javax.swing.JFrame {
  BinaryTree tree;
    /** Creates new form form1 */
    public form1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        size = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jToolBar5 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        title1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jToolBar6 = new javax.swing.JToolBar();
        jPanel6 = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btitle = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jToolBar4 = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Author Surname:");
        jLabel1.setBounds(10, 180, 160, 17);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Book Title:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setBounds(10, 60, 120, 17);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("ISBN:");
        jLabel3.setBounds(10, 100, 90, 17);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Author First Name:");
        jLabel4.setBounds(10, 140, 170, 17);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sn.setBounds(160, 180, 320, 23);
        jLayeredPane1.add(sn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        title.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        title.setBounds(160, 60, 320, 23);
        jLayeredPane1.add(title, javax.swing.JLayeredPane.DEFAULT_LAYER);

        isbn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        isbn.setBounds(160, 100, 320, 23);
        jLayeredPane1.add(isbn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        fn.setBounds(160, 140, 320, 23);
        jLayeredPane1.add(fn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("ADD Node");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 250, 130, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        size.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        size.setForeground(new java.awt.Color(0, 0, 204));
        size.setBounds(10, 340, 580, 40);
        jLayeredPane1.add(size, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        jTabbedPane1.addTab("Insert Record", jToolBar1);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jTabbedPane2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remove Node", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Book Title:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBounds(10, 60, 120, 17);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        title1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        title1.setBounds(100, 60, 360, 23);
        jLayeredPane2.add(title1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(10, 130, 110, 50);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        area.setForeground(new java.awt.Color(0, 0, 204));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jScrollPane1.setBounds(10, 195, 570, 91);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jToolBar5.add(jPanel5);

        jTabbedPane2.addTab("Delete by Book Title", jToolBar5);

        jToolBar6.setFloatable(false);
        jToolBar6.setRollover(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jToolBar6.add(jPanel6);

        jTabbedPane2.addTab("Delete by ISBN", jToolBar6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jToolBar2.add(jPanel2);

        jTabbedPane1.addTab("Delete Record", jToolBar2);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Book Title:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btitle.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Search Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        result.setEditable(false);
        result.setColumns(20);
        result.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        result.setRows(5);
        jScrollPane2.setViewportView(result);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btitle, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("By Title", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("By ISBN", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jToolBar3.add(jPanel3);

        jTabbedPane1.addTab("Search Record", jToolBar3);

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jToolBar4.add(jPanel4);

        jTabbedPane1.addTab("Print Record", jToolBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String title1=title.getText().toLowerCase();//get the user's string from the screen
    
    String afn=fn.getText();//get author's first name
    String asn=sn.getText();//get author's sur name
    
    try
    {
    int isbn1=Integer.parseInt(isbn.getText());//get isbn number from the user
    
    if(title1.equals(""))//check user enter something or not for title
    {
    JOptionPane.showMessageDialog(rootPane, " Enter Book Title", "Message", JOptionPane.ERROR_MESSAGE);
    }
     else if(isbn1==0)////check user enter something or not for isbn
    {
    
    JOptionPane.showMessageDialog(rootPane, " Enter ISBN Number", "Message", JOptionPane.ERROR_MESSAGE);
    }
    
    else if(afn.equals(""))//check user enter something or not for author's first name
    {
    JOptionPane.showMessageDialog(rootPane, " Enter Author's First Name", "Message", JOptionPane.ERROR_MESSAGE);
    
    }
    else if(asn.equals(""))//check user enter something or not for the authoor sur name
    {
    JOptionPane.showMessageDialog(rootPane, " Enter Author's Last Name", "Message", JOptionPane.ERROR_MESSAGE);
    
    }
  else
    {
    boolean check=tree.addNode(title1, isbn1, afn, asn);//call the addnode method to insert data
    if(check==true)//check book is inserted or not
    {
    
    JOptionPane.showMessageDialog(rootPane, " New Book Node is added to the tree", "Message", JOptionPane.INFORMATION_MESSAGE);
   
    title.setText("");//set title textfield to null
    isbn.setText("");//set isbn textfield to null
    fn.setText("");//set auhtor first name textfield to null
    sn.setText("");//set author sur name textfield to null
   int siz=tree.getSize();// get the size
   if(siz==1)//check size
   size.setText("There is "+siz+" book in the tree now");
   
   else 
       size.setText("There are "+siz+" books in the tree now"); 
    }
    else
    {
    JOptionPane.showMessageDialog(rootPane, " Book Title is already in  the tree", "Message", JOptionPane.INFORMATION_MESSAGE);
    
    }
    }
    
    
    
    }
    catch(NumberFormatException ex)
    {
    
    
    JOptionPane.showMessageDialog(rootPane, " ISBN Number must be a number", "Message", JOptionPane.ERROR_MESSAGE);
    
    
    }
    
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    tree=new BinaryTree();//create a new tree from the beginig
    // TODO add your handling code here:
}//GEN-LAST:event_formWindowOpened

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    area.setText(null);
    String titles=title1.getText();
int si=tree.getSize();
if(si==0)//check if the tree is empty
{JOptionPane.showMessageDialog(rootPane, " Tree is empty", "Message", JOptionPane.ERROR_MESSAGE);}
else//otherwise
{
if(titles.equals(""))//check user type a something or not
{
 JOptionPane.showMessageDialog(rootPane, " Enter Title Here", "Message", JOptionPane.ERROR_MESSAGE);
}
else
{
   boolean flag= tree.deleteNode(titles.toLowerCase());//call the deletenode in binarytree class
    
   if(flag==true)//check book is removed or not
   {
    JOptionPane.showMessageDialog(rootPane, " Node is removed sucessfully", "Message", JOptionPane.INFORMATION_MESSAGE);
   int siz=tree.getSize();//get the size of the tree
   if(siz>1)
   {
       area.append("there are "+ siz +" books in the tree now\n");//put some text in the text area
    area.append("there were "+ ++siz +" books in the tree \n");//put some text in the text area
   
   }
   else if(siz==0)
   {
     area.append("No books in the tree now\n");//put some text in the text area
   area.append("there was "+ ++siz +" book in the tree now\n");//put some text in the text area
   }
   else
   {
        area.append("there was "+ siz +" book in the tree now\n");//put some text in the text area
   area.append("there were "+ ++siz +" books in the tree now\n");//put some text in the text area
  
   
   }
  
   }
   else
   {
   
   JOptionPane.showMessageDialog(rootPane, "Record not found", "Message", JOptionPane.ERROR_MESSAGE);
   }
}  }


    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        result.setText(null);
        Node search1=null;
        String bktitle;
        bktitle=btitle.getText().toLowerCase();//stores the title to be searched into variable
        int tsize=tree.getSize();//checks the size of the tree
        
        //if the tree is empty then gives a error message
        if(tsize==0)
        {
            JOptionPane.showMessageDialog(rootPane, "There are no records in the database ", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //if title field is empty gives error message
            if(bktitle.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter a Book Title ", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    search1=tree.searchbyTitle(bktitle);//calls to the searchbytitle method and stores return value

                    //declare variables and stores search results to them
                    int bisbn;
                    String bookt,afname,asname;
                    bookt=search1.title;
                    bisbn=search1.isbn;
                    afname=search1.authorFName;
                    asname=search1.authorSName;
                    
                    //displays the search result in a text area
                    result.setText("Title:\t\t"+bookt+"\nBook ISBN:\t\t"+bisbn+"\nAuthor's First name:\t"+afname+"\nAuthor's Surname:\t"+asname);
                }
                catch(NullPointerException e)
                {
                    //if the title wasn't found gives a message
                    JOptionPane.showMessageDialog(rootPane, "Title couldn't be found ", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField btitle;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JTextArea result;
    private javax.swing.JTextField size;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField title;
    private javax.swing.JTextField title1;
    // End of variables declaration//GEN-END:variables
}
