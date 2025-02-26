/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b23902.i.terra;

public class Heretic {
    private String name;
    private String crimes;
    private String lastLocation;
    private String identityId;
    private ThreatLevel threatLevel;

    
    public enum ThreatLevel {
        LOW("Низкий"),
        MEDIUM("Средний"),
        HIGH("Высокий"),
        CRITICAL("Критический");
        
        private final String description;
        
        ThreatLevel(String description) {
            this.description = description;
        }
        
        public String getDescription() {
            return description;
        }
    }
    
    public Heretic(String name, String crimes, String lastLocation, String identityId, ThreatLevel threatLevel) {
        this.name = name;
        this.crimes = crimes;
        this.lastLocation = lastLocation;
        this.identityId = identityId;
        this.threatLevel = threatLevel;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCrimes() {
        return crimes;
    }
    
    public void setCrimes(String crimes) {
        this.crimes = crimes;
    }
    
    public String getLastLocation() {
        return lastLocation;
    }
    
    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }
    
    public String getIdentityId() {
        return identityId;
    }
    
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    public ThreatLevel getThreatLevel() {
        return threatLevel;
    }
    
    public void setThreatLevel(ThreatLevel threatLevel) {
        this.threatLevel = threatLevel;
    }
    
    @Override
    public String toString() {
        return "Еретик: " + name + " | Уровень угрозы: " + threatLevel.getDescription();
    }
}