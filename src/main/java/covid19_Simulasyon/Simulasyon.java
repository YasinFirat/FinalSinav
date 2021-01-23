/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_Simulasyon;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author yasin
 */
public class Simulasyon extends javax.swing.JFrame {

    /**
     * Creates new form Simulasyon
     */
    public Simulasyon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_populasyon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_bulasmaKatsayisi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_iyilesmeOrani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        slinder_simulasyonHizi = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_iyilesmeSuresi = new javax.swing.JTextField();
        txt_hasta_sayisi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_gecen_gun = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_mobileHiz = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_speed_simulation = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnl_enfekte_olmamis = new Rapor();
        pnl_enfekte_olanlar = new Rapor();
        pnl_iyilesen = new Rapor();
        lb_saglikli_yuzde = new javax.swing.JLabel();
        lb_hasta_yuzde = new javax.swing.JLabel();
        lb_iyilesen_yuzde = new javax.swing.JLabel();
        panel_area = new covid19_Simulasyon.Scene();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_start.setText("Simülasyon Başlat");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        jLabel1.setText("Populasyon:");

        txt_populasyon.setText("100");
        txt_populasyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_populasyonActionPerformed(evt);
            }
        });

        jLabel2.setText("Bulaşma Katsayısı");

        txt_bulasmaKatsayisi.setText("3");

        jLabel3.setText("İyileşme Oranı");

        txt_iyilesmeOrani.setText("95");
        txt_iyilesmeOrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_iyilesmeOraniActionPerformed(evt);
            }
        });

        jLabel4.setText("Simulasyon Hizi");

        slinder_simulasyonHizi.setMaximum(3);
        slinder_simulasyonHizi.setMinimum(1);
        slinder_simulasyonHizi.setValue(1);
        slinder_simulasyonHizi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slinder_simulasyonHiziStateChanged(evt);
            }
        });

        jLabel5.setText("gün/sn");

        jLabel6.setText("İyileşme Süresi");

        jLabel7.setText("Hasta Sayısı");

        txt_iyilesmeSuresi.setText("14");

        txt_hasta_sayisi.setText("3");

        jLabel8.setText("Geçen Gün :");

        lbl_gecen_gun.setText("0");

        jLabel10.setText("Mobile Hızı");

        txt_mobileHiz.setText("5");

        jLabel11.setText("kişi");

        jLabel12.setText("%");

        jLabel13.setText("kişi");

        jLabel14.setText("gün");

        lbl_speed_simulation.setText("1");
        lbl_speed_simulation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_populasyon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bulasmaKatsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_iyilesmeOrani, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slinder_simulasyonHizi, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbl_speed_simulation, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_iyilesmeSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_hasta_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_gecen_gun))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_mobileHiz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(12, 12, 12)
                            .addComponent(btn_start))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_populasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_bulasmaKatsayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_iyilesmeOrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(slinder_simulasyonHizi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lbl_speed_simulation)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_iyilesmeSuresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txt_mobileHiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_hasta_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(lbl_gecen_gun)))
                    .addComponent(btn_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel16.setText("Enfekte Olmamış Hastalar");

        jLabel17.setText("Enfekte Hastalar");

        jLabel18.setText("İyileşen Hastalar");

        pnl_enfekte_olmamis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout pnl_enfekte_olmamisLayout = new javax.swing.GroupLayout(pnl_enfekte_olmamis);
        pnl_enfekte_olmamis.setLayout(pnl_enfekte_olmamisLayout);
        pnl_enfekte_olmamisLayout.setHorizontalGroup(
            pnl_enfekte_olmamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_enfekte_olmamisLayout.setVerticalGroup(
            pnl_enfekte_olmamisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        pnl_enfekte_olanlar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        javax.swing.GroupLayout pnl_enfekte_olanlarLayout = new javax.swing.GroupLayout(pnl_enfekte_olanlar);
        pnl_enfekte_olanlar.setLayout(pnl_enfekte_olanlarLayout);
        pnl_enfekte_olanlarLayout.setHorizontalGroup(
            pnl_enfekte_olanlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        pnl_enfekte_olanlarLayout.setVerticalGroup(
            pnl_enfekte_olanlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        pnl_iyilesen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        javax.swing.GroupLayout pnl_iyilesenLayout = new javax.swing.GroupLayout(pnl_iyilesen);
        pnl_iyilesen.setLayout(pnl_iyilesenLayout);
        pnl_iyilesenLayout.setHorizontalGroup(
            pnl_iyilesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        pnl_iyilesenLayout.setVerticalGroup(
            pnl_iyilesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        lb_saglikli_yuzde.setText("0");

        lb_hasta_yuzde.setText("0");
        lb_hasta_yuzde.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lb_iyilesen_yuzde.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_saglikli_yuzde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_enfekte_olmamis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_enfekte_olanlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(lb_hasta_yuzde, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_iyilesen_yuzde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_iyilesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_enfekte_olanlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_enfekte_olmamis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_iyilesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_saglikli_yuzde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_hasta_yuzde, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_iyilesen_yuzde)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_areaLayout = new javax.swing.GroupLayout(panel_area);
        panel_area.setLayout(panel_areaLayout);
        panel_areaLayout.setHorizontalGroup(
            panel_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        panel_areaLayout.setVerticalGroup(
            panel_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_iyilesmeOraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_iyilesmeOraniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_iyilesmeOraniActionPerformed

    boolean is_continue=true;
   
    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
      
//Forum'dan alınan değerler aktarılır.
        int iyilesme_suresi=Integer.parseInt(txt_iyilesmeSuresi.getText().toString()); //iyilesme suresi eklendi
       int speed_simulation=Integer.parseInt(lbl_speed_simulation.getText().toString()); //simulasyon hizi eklendi
       int mobile_speed=Integer.parseInt(txt_mobileHiz.getText().toString()); //mobile hiz eklendi
       int population=Integer.parseInt(txt_populasyon.getText());
        int bulasma_katsayisi=Integer.parseInt(txt_bulasmaKatsayisi.getText());
       
       getScene().population=population; //population eklendi
       getScene().starting_total_of_patients=Integer.parseInt(txt_hasta_sayisi.getText());//hasta sayısı eklendi
       //rapor için renkler tanıtıldı her bir obje için.(scene'den çektim)
      getRaporOfHealthy().setColor(getScene().statusPatient.getHealthy());
      getRaporOfPatient().setColor(getScene().statusPatient.getPatient());
      getRaporOfRecovered().setColor(getScene().statusPatient.getRecovered());
      //consruction'dan population sayısını verecektim fakat bir şekilde sürekli engel oldu.
      getRaporOfHealthy().population=population;
       getRaporOfPatient().population=population;
        getRaporOfRecovered().population=population;
        
       

       Thread thread_global= new Thread(new Runnable(){
           @Override
           public void run() {
               int rapor_recovered=0;
               int rapor_healthy=0;
               int rapor_patient=0;
               int bulasma_katsayi_aktarma=bulasma_katsayisi;
               bulasma_katsayi_aktarma=bulasma_katsayi_aktarma>10?10:bulasma_katsayi_aktarma;
               try {//neler olduğunu görmek için bir saniye bekletiyorum
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Simulasyon.class.getName()).log(Level.SEVERE, null, ex);
               }
               while(is_continue){
                 getScene().covidStatus(bulasma_katsayi_aktarma);
                 getScene().Move(mobile_speed);//objeler hareket eder
                getScene().addHuman();
                rapor_recovered=getScene().counter_recovered;
                rapor_healthy=getScene().counter_healthy;
                rapor_patient=getScene().counter_patients;
                getRaporOfPatient().counter=rapor_patient;
                getRaporOfHealthy().counter=rapor_healthy;
                getRaporOfRecovered().counter=rapor_recovered;
                
                lb_hasta_yuzde.setText(rapor_patient+"");
                lb_iyilesen_yuzde.setText(rapor_recovered+"");
                lb_saglikli_yuzde.setText(rapor_healthy+"");
                
                if(rapor_patient<=0){
                    is_continue=false;
                    
                }
                if(Math.random()*100<15){
                    getScene().randomTarget();//rastgele bir hedef nokta belirler ve ilerler
                }
                 
                try {
                    Thread.sleep(100/speed_simulation);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simulasyon.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
           }
           
       });
      Thread thread_timer=  new Thread(new Runnable(){
           @Override
           public void run() {
               int gecen_gun=0;
            while(is_continue){
                
                getScene().treatmentControl(iyilesme_suresi,speed_simulation);
                 lbl_gecen_gun.setText(gecen_gun+"");
                 gecen_gun+=speed_simulation;
                
                try {
                    Thread.sleep(1000/speed_simulation);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simulasyon.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
           }
           
       });
     thread_global.start();
     thread_timer.start();
     
        
       
    }//GEN-LAST:event_btn_startActionPerformed

    private void txt_populasyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_populasyonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_populasyonActionPerformed

    private void slinder_simulasyonHiziStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slinder_simulasyonHiziStateChanged
         lbl_speed_simulation.setText(slinder_simulasyonHizi.getValue()+"");
    }//GEN-LAST:event_slinder_simulasyonHiziStateChanged

    private Scene getScene(){
        return (Scene)panel_area;
    }
    public Rapor getRaporOfHealthy(){
        return (Rapor)pnl_enfekte_olmamis;
    }
    public Rapor getRaporOfPatient(){
        return (Rapor)pnl_enfekte_olanlar;
    }
    public Rapor getRaporOfRecovered(){
        return (Rapor)pnl_iyilesen;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulasyon().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_hasta_yuzde;
    private javax.swing.JLabel lb_iyilesen_yuzde;
    private javax.swing.JLabel lb_saglikli_yuzde;
    private javax.swing.JLabel lbl_gecen_gun;
    private javax.swing.JLabel lbl_speed_simulation;
    private javax.swing.JPanel panel_area;
    private javax.swing.JPanel pnl_enfekte_olanlar;
    private javax.swing.JPanel pnl_enfekte_olmamis;
    private javax.swing.JPanel pnl_iyilesen;
    private javax.swing.JSlider slinder_simulasyonHizi;
    private javax.swing.JTextField txt_bulasmaKatsayisi;
    private javax.swing.JTextField txt_hasta_sayisi;
    private javax.swing.JTextField txt_iyilesmeOrani;
    private javax.swing.JTextField txt_iyilesmeSuresi;
    private javax.swing.JTextField txt_mobileHiz;
    private javax.swing.JTextField txt_populasyon;
    // End of variables declaration//GEN-END:variables
}
