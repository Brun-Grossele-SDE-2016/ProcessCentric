package knowyourtown.storage;

import knowyourtown.storage.webservice.Storage;
import knowyourtown.storage.webservice.StorageService;

/**
 * Created by matteo on 18/06/17.
 */
public class StorageClient {

    public final static String SERVICE_URL_STORAGE = "http://localhost:6902/ws/storage?wsdl";
 
    private Storage storage;
    private StorageService storageService;

    public StorageClient() {

        this.storageService = new StorageService();
        storage = storageService.getStorageImplementationPort();
    }

    public Storage getStorage() {
        return this.storage;
    }
}
