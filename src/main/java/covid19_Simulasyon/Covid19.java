/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19_Simulasyon;

import java.awt.Color;


public final class Covid19 {
    private final Color patient;
    private final Color recovered;
    private final Color healthy;
    
    
    Covid19(Color _patient,Color _recovered,Color _healthy){
        patient=_patient;
        recovered=_recovered;
        healthy=_healthy;
    }
    
    public Color getPatient(){
        return patient;
    }
    public Color getRecovered(){
        return recovered;
    }
    public Color getHealthy(){
        return healthy;
    }
}
