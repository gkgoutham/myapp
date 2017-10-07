package org.gk.shopping.app.service;

import java.util.List;

import org.gk.shopping.app.bean.Employee;
import org.gk.shopping.app.bean.Partner;
import org.gk.shopping.app.bean.Users;

public interface PartnerService {

	Partner createPartner(Users user);
	
	Partner updatePartner(Users user);
	 
    List<Users> findAllPartners();
 
    Employee findPartner(String name);
 
    boolean approvePartner(Partner partner);
    
    boolean rejectPartner(Partner partner);
    
    boolean disablePartner(Partner partner);
    
    boolean enablePartner(Partner partner);
    
}
