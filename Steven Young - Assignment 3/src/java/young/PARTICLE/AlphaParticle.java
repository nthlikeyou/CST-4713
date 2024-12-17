/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package young.PARTICLE;

import young.ENUMS.ParticleCharge;
import young.ENUMS.ParticleSpin;
import young.INTERFACES.Polymerize;
import young.ENUMS.*;
/**
 *
 * @author nthlikeyou
 */
public class AlphaParticle extends ImperialParticle {

    
    public AlphaParticle(){
        super("Alpha", "AP", 
              Polymerize.ALPHA_MASS,
              Polymerize.ALPHA_POWER,
              ParticleCharge.Positive,
              ParticleSpin.LEFT);
    }
    
    @Override
    public String displayParticle() {
        String S = "";
        S += "<h3" + this.getpType();
        S +=  this.getSymbol();
        S += this.getMass();
        S += this.getPower();
        S += this.getPower() + "</h3>";
        return S;
        
        
    }
    
}
