/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportRole;
import Business.Role.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author deepgamit
 */
public class TransportOrganization extends Organization{
    
    public TransportOrganization() {
        super(Organization.Type.Transport.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportRole());
        return roles;
    }
    
}
