/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package young.PARTICLE;

import young.ENUMS.*;
/**
 *
 * @author nthlikeyou
 */
public abstract class ImperialParticle {
    
    private String pType;
    private String symbol;
    private double mass;
    private double power;
    private ParticleCharge charge;
    private ParticleSpin spin;

    public ImperialParticle(String pType, String symbol, double mass, double power, ParticleCharge charge, ParticleSpin spin) {
        this.pType = pType;
        this.symbol = symbol;
        this.mass = mass;
        this.power = power;
        this.charge = charge;
        this.spin = spin;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public ParticleCharge getCharge() {
        return charge;
    }

    public void setCharge(ParticleCharge charge) {
        this.charge = charge;
    }

    public ParticleSpin getSpin() {
        return spin;
    }

    public void setSpin(ParticleSpin spin) {
        this.spin = spin;
    }
    
    public abstract String displayParticle(); 
}
