package application;

import controller.BusinessCardManager;
import dao.BusinessCardDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BusinessCardDao.createTable();
        BusinessCardManager businessCardManager = new BusinessCardManager();
        businessCardManager.run();
    }
}
