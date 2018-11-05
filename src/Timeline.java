
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author tanuj
 */
public class Timeline extends javax.swing.JFrame {

    /** Creates new form Timeline */
    public Timeline() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Timeline");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(102, 0, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tux TV 1280-1024.jpg"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blue-young-icon.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("<html>Logged In <font color=green>●");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><u>Home");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><u>Friends");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><u>Messages");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><u>Notifications");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><u>Profile");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><u>Settings");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("Write a Status Update");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton1.setText("Add a Photo");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel13.setText("Image No. selected is");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blue-2-icon.png"))); // NOI18N
        jButton3.setText("Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 0, 18));
        jLabel11.setForeground(new java.awt.Color(255, 0, 153));
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setOpaque(true);
        jScrollPane1.setViewportView(jLabel11);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton4.setText("Clear All Posts");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jTextField2.requestFocus();
String user="";
String pass="";
int code=0;
String name="";
try
{
String q="select code, Username,Password from session natural join auth;";
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
Statement s=con.createStatement();
ResultSet r=s.executeQuery(q);
r.next();
user=r.getString("Username");
pass=r.getString("Password");
code=r.getInt("Code");

 jLabel16.setText(""+code);
    jLabel17.setText(""+user);
   
}
catch(Exception e)
{
    e.printStackTrace();
 JOptionPane.showMessageDialog(null,"Please Log in from LogIn Window!");
}
try{
   String q1="Select Name,Dpsmall from members where code="+code+";";
    Class.forName("java.sql.Driver");
    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s1=con1.createStatement();
    ResultSet rs1=s1.executeQuery(q1);
    rs1.next();
    String dp=rs1.getString("Dpsmall");
    name=rs1.getString("Name");
     jLabel2.setText(""+name);
        jLabel1.setIcon(new ImageIcon(""+dp+".jpg"));
        con1.close();
    s1.close();
    rs1.close();
}
catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
int no=Integer.parseInt(jLabel16.getText());
int pnum=0;
try{
   String q1="Select count(*) from posts where Owner="+code+";";
    Class.forName("java.sql.Driver");
    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s2=con2.createStatement();
    ResultSet rs2=s2.executeQuery(q1);
    rs2.next();
    pnum=rs2.getInt("Count(*)");
    jLabel15.setText("You have "+pnum+" posts on your timeline.");
    con2.close();
    s2.close();
    rs2.close();
    }
catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
try
{
String output="<html>";
String q="Select Text,Image,Owner,Kind,Time from Posts where Owner="+code+" or owner in (select User2 as user from friendlist where user1="+code+" union select user1 as user from friendlist where user2="+code+");";
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
Statement s=con.createStatement();
ResultSet r=s.executeQuery(q);
String x="";
String color="";
int i=0;
while(r.next()){
    switch(i){
        case 0:color="<font color=red>";
               i++;
               break;
        case 1:color="<font color=blue>";
               i++;
               break;
        case 2:color="<font color=green>";
               i++;
               break;
        case 3:color="<font color=black>";
               i=0;
               break;
             }
    String text=r.getString("Text");
    String image=r.getString("Image");
    int owner=r.getInt("Owner");
    String kind=r.getString("Kind");
    Time t=r.getTime("Time");
    if(kind.equals("text")){
        image="";
        x=" posted a status update";
            }else{
        image="<img src='file:/E:/ChatApp/"+image+".jpg'>";
        text=text+"<br>";
        x=" shared a photo............";
    }
    String own="";
    if(code==owner){
        own="You";
    }else{
        try{
    String q2="select Name from members where code="+owner+";";
    Class.forName("java.sql.Driver");
    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s2=con2.createStatement();
     ResultSet rs2=s2.executeQuery(q2);
    rs2.next();
    own=rs2.getString("Name");
    con2.close();
    s2.close();
        }
catch(Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
    }
    output=output+"<font size=4 color=grey>"+own+x+".................................</font><font size=2>("+t+")</font><br>"+color+text+image+"<br>"+"--------------------------------------------------------------------------------------------------------</font><br>";
}
jLabel11.setText(""+output);
}
catch(Exception e)
{
    e.printStackTrace();
 JOptionPane.showMessageDialog(null,""+e.getMessage());
}
/*
try{
    String q2="update Post"+code+" set Seen=1 where Seen=0;";
    Class.forName("java.sql.Driver");
    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s2=con2.createStatement();
    s2.executeUpdate(q2);
    con2.close();
    s2.close();
        }
catch(Exception e){
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
 */
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
   String q1="delete from session;";
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s1=con.createStatement();
    s1.executeUpdate(q1);
    
        this.setVisible(false);
         new Logout().setVisible(true);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String a=jTextField1.getText();
try{
   String q1="insert into search values('"+a+"');";
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s1=con.createStatement();
    s1.executeUpdate(q1);

        this.setVisible(false);
     new FriendSearch().setVisible(true);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,""+e.getMessage() );
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
this.setVisible(false);
new Friends().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
this.setVisible(false);
new Messages().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
this.setVisible(false);
new Notif().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
this.setVisible(false);
new Profile().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
this.setVisible(false);
new Settings().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 int code=Integer.parseInt(jLabel16.getText());
 int res=JOptionPane.showConfirmDialog(null,"Are You Sure to delete all Posts?");
        if(res==JOptionPane.YES_OPTION){
            try {
                String q="Delete from Posts where Owner="+code+";";
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
                Statement s=con.createStatement();
                s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"All Posts Deleted Successfully!");
                this.setVisible(false);
               new Timeline().setVisible(true); 
                s.close();
                con.close();
            } catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,""+e.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
if(jRadioButton1.isSelected()){
   new PostPhoto().setVisible(true);

}

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String user=jLabel2.getText();
int code=Integer.parseInt(jLabel16.getText());
String text=jTextField2.getText();
String image="null";
String kind="text";
if(jRadioButton1.isSelected()){
int im=Integer.parseInt(jLabel14.getText());
try {
      String q="Select Value from Postphoto where Serial="+im+";";
      Class.forName("java.sql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
      Statement s=con.createStatement();
      ResultSet rs=s.executeQuery(q);
      rs.next();
      image=rs.getString("Value");
      rs.close();
      s.close();
      con.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null,""+e.getMessage());
                        }
kind="both";
}else{
    image="null";
}
int l=-1;
String n=jLabel2.getText();
 int noti=0;
try {
      String q="select User2 as user from friendlist where user1="+code+" union select user1 as user from friendlist where user2="+code+";";
      Class.forName("java.sql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
      Statement s=con.createStatement();
      ResultSet rs=s.executeQuery(q);

           while(rs.next()){
           int c=rs.getInt("user");
           int ser=0;
 
    try{
  // String q1="Select Serial from Post"+c+";";
    String q2="Select Serial from Notifications;";
    Class.forName("java.sql.Driver");
    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
  //  Statement s1=con1.createStatement();
    Statement s2=con1.createStatement();
    //ResultSet rs1=s1.executeQuery(q1);
//    rs1.last();
//    ser=rs1.getInt("Serial");
//      ser++;
      ResultSet rs2=s2.executeQuery(q2);
      rs2.last();
    noti=rs2.getInt("Serial");
      noti++;
      }
catch(Exception e){
    e.printStackTrace();
   // JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
 try {
     String q1="insert into Notifications values("+noti+","+c+",'"+n+" posted a Status Update.',0);";
    // String q2="insert into Post"+c+" values("+ser+",'"+text+"','"+image+"','"+user+"','"+kind+"',mid(now(),12),0);";
      Class.forName("java.sql.Driver");
      Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
     // Statement s2=con2.createStatement();
     // s2.executeUpdate(q2);
      Statement s1=con2.createStatement();
      s1.executeUpdate(q1);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null,""+e.getMessage());
                        }
   }
                rs.close();
      s.close();
      con.close();
    } catch(Exception e){
        e.printStackTrace();
       // JOptionPane.showMessageDialog(null,""+e.getMessage());
                        }
 
int not=++noti;
int se=0;
try{
   String q1="Select Serial from Posts;";
   String q2="Select Serial from Notifications;";
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
    Statement s1=con.createStatement();
     Statement s2=con.createStatement();
     ResultSet rs1=s1.executeQuery(q1);
    rs1.last();
    se=rs1.getInt("Serial");
      se++;
      ResultSet rs2=s2.executeQuery(q2);
      rs2.last();
    not=rs2.getInt("Serial");
      not++;
      }
catch(Exception e){
    e.printStackTrace();
   // JOptionPane.showMessageDialog(null,""+e.getMessage() );
}
try {
      String q="insert into Posts values("+se+",'"+text+"','"+image+"',"+code+",'"+kind+"',mid(now(),12));";
      String q1="insert into Notifications values("+not+","+code+",'You posted a Status Update.',0);";
      Class.forName("java.sql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tanuj","root","123");
      Statement s=con.createStatement();
      s.executeUpdate(q);
      Statement s1=con.createStatement();
      s1.executeUpdate(q1);
      jTextField2.setText("");
JOptionPane.showMessageDialog(null,"Status Posted On your Timeline Successfully!");
this.setVisible(false);
new Timeline().setVisible(true);
    } catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,""+e.getMessage());
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timeline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}