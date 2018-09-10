package knowyourtown.business;

import knowyourtown.business.webservice.Business;
import knowyourtown.business.webservice.BusinessService;

/**
 * Created by matteo on 19/06/17.
 */
public class BusinessClient {

    public final static String SERVICE_URL_BUSINESS = "http://localhost:6901/ws/business?wsdl";
    
    private Business business;
    private BusinessService businessService;

    public BusinessClient() {
        this.businessService = new BusinessService();
        business = businessService.getBusinessImplementationPort();
    }

    public Business getBusiness() {
        return this.business;
    }
}
