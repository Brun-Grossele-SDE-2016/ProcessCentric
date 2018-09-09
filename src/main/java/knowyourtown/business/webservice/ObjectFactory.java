
package knowyourtown.business.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the knowyourtown.business.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePerson_QNAME = new QName("http://webservice.business.knowyourtown/", "createPerson");
    private final static QName _DeleteSuggestionByTitle_QNAME = new QName("http://webservice.business.knowyourtown/", "deleteSuggestionByTitle");
    private final static QName _UpdateSuggestion_QNAME = new QName("http://webservice.business.knowyourtown/", "updateSuggestion");
    private final static QName _DeleteSuggestionResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "deleteSuggestionResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "createPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.business.knowyourtown/", "deletePerson");
    private final static QName _UpdatePlace_QNAME = new QName("http://webservice.business.knowyourtown/", "updatePlace");
    private final static QName _UpdateSuggestionResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "updateSuggestionResponse");
    private final static QName _CreatePlaceResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "createPlaceResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.business.knowyourtown/", "updatePerson");
    private final static QName _DeleteSuggestionByTitleResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "deleteSuggestionByTitleResponse");
    private final static QName _DeletePlaceResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "deletePlaceResponse");
    private final static QName _GetSuggestionsResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "getSuggestionsResponse");
    private final static QName _UpdatePlaceResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "updatePlaceResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "updatePersonResponse");
    private final static QName _CreateSuggestion_QNAME = new QName("http://webservice.business.knowyourtown/", "createSuggestion");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "deletePersonResponse");
    private final static QName _DeleteSuggestion_QNAME = new QName("http://webservice.business.knowyourtown/", "deleteSuggestion");
    private final static QName _GetSuggestions_QNAME = new QName("http://webservice.business.knowyourtown/", "getSuggestions");
    private final static QName _CreateSuggestionResponse_QNAME = new QName("http://webservice.business.knowyourtown/", "createSuggestionResponse");
    private final static QName _DeletePlace_QNAME = new QName("http://webservice.business.knowyourtown/", "deletePlace");
    private final static QName _CreatePlace_QNAME = new QName("http://webservice.business.knowyourtown/", "createPlace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: knowyourtown.business.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePlace }
     * 
     */
    public UpdatePlace createUpdatePlace() {
        return new UpdatePlace();
    }

    /**
     * Create an instance of {@link UpdateSuggestionResponse }
     * 
     */
    public UpdateSuggestionResponse createUpdateSuggestionResponse() {
        return new UpdateSuggestionResponse();
    }

    /**
     * Create an instance of {@link DeleteSuggestionByTitle }
     * 
     */
    public DeleteSuggestionByTitle createDeleteSuggestionByTitle() {
        return new DeleteSuggestionByTitle();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link UpdateSuggestion }
     * 
     */
    public UpdateSuggestion createUpdateSuggestion() {
        return new UpdateSuggestion();
    }

    /**
     * Create an instance of {@link DeleteSuggestionResponse }
     * 
     */
    public DeleteSuggestionResponse createDeleteSuggestionResponse() {
        return new DeleteSuggestionResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link DeleteSuggestion }
     * 
     */
    public DeleteSuggestion createDeleteSuggestion() {
        return new DeleteSuggestion();
    }

    /**
     * Create an instance of {@link GetSuggestions }
     * 
     */
    public GetSuggestions createGetSuggestions() {
        return new GetSuggestions();
    }

    /**
     * Create an instance of {@link CreateSuggestion }
     * 
     */
    public CreateSuggestion createCreateSuggestion() {
        return new CreateSuggestion();
    }

    /**
     * Create an instance of {@link CreatePlace }
     * 
     */
    public CreatePlace createCreatePlace() {
        return new CreatePlace();
    }

    /**
     * Create an instance of {@link CreateSuggestionResponse }
     * 
     */
    public CreateSuggestionResponse createCreateSuggestionResponse() {
        return new CreateSuggestionResponse();
    }

    /**
     * Create an instance of {@link DeletePlace }
     * 
     */
    public DeletePlace createDeletePlace() {
        return new DeletePlace();
    }

    /**
     * Create an instance of {@link CreatePlaceResponse }
     * 
     */
    public CreatePlaceResponse createCreatePlaceResponse() {
        return new CreatePlaceResponse();
    }

    /**
     * Create an instance of {@link DeleteSuggestionByTitleResponse }
     * 
     */
    public DeleteSuggestionByTitleResponse createDeleteSuggestionByTitleResponse() {
        return new DeleteSuggestionByTitleResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetSuggestionsResponse }
     * 
     */
    public GetSuggestionsResponse createGetSuggestionsResponse() {
        return new GetSuggestionsResponse();
    }

    /**
     * Create an instance of {@link UpdatePlaceResponse }
     * 
     */
    public UpdatePlaceResponse createUpdatePlaceResponse() {
        return new UpdatePlaceResponse();
    }

    /**
     * Create an instance of {@link DeletePlaceResponse }
     * 
     */
    public DeletePlaceResponse createDeletePlaceResponse() {
        return new DeletePlaceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestionByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deleteSuggestionByTitle")
    public JAXBElement<DeleteSuggestionByTitle> createDeleteSuggestionByTitle(DeleteSuggestionByTitle value) {
        return new JAXBElement<DeleteSuggestionByTitle>(_DeleteSuggestionByTitle_QNAME, DeleteSuggestionByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updateSuggestion")
    public JAXBElement<UpdateSuggestion> createUpdateSuggestion(UpdateSuggestion value) {
        return new JAXBElement<UpdateSuggestion>(_UpdateSuggestion_QNAME, UpdateSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deleteSuggestionResponse")
    public JAXBElement<DeleteSuggestionResponse> createDeleteSuggestionResponse(DeleteSuggestionResponse value) {
        return new JAXBElement<DeleteSuggestionResponse>(_DeleteSuggestionResponse_QNAME, DeleteSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updatePlace")
    public JAXBElement<UpdatePlace> createUpdatePlace(UpdatePlace value) {
        return new JAXBElement<UpdatePlace>(_UpdatePlace_QNAME, UpdatePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updateSuggestionResponse")
    public JAXBElement<UpdateSuggestionResponse> createUpdateSuggestionResponse(UpdateSuggestionResponse value) {
        return new JAXBElement<UpdateSuggestionResponse>(_UpdateSuggestionResponse_QNAME, UpdateSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createPlaceResponse")
    public JAXBElement<CreatePlaceResponse> createCreatePlaceResponse(CreatePlaceResponse value) {
        return new JAXBElement<CreatePlaceResponse>(_CreatePlaceResponse_QNAME, CreatePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestionByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deleteSuggestionByTitleResponse")
    public JAXBElement<DeleteSuggestionByTitleResponse> createDeleteSuggestionByTitleResponse(DeleteSuggestionByTitleResponse value) {
        return new JAXBElement<DeleteSuggestionByTitleResponse>(_DeleteSuggestionByTitleResponse_QNAME, DeleteSuggestionByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deletePlaceResponse")
    public JAXBElement<DeletePlaceResponse> createDeletePlaceResponse(DeletePlaceResponse value) {
        return new JAXBElement<DeletePlaceResponse>(_DeletePlaceResponse_QNAME, DeletePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "getSuggestionsResponse")
    public JAXBElement<GetSuggestionsResponse> createGetSuggestionsResponse(GetSuggestionsResponse value) {
        return new JAXBElement<GetSuggestionsResponse>(_GetSuggestionsResponse_QNAME, GetSuggestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updatePlaceResponse")
    public JAXBElement<UpdatePlaceResponse> createUpdatePlaceResponse(UpdatePlaceResponse value) {
        return new JAXBElement<UpdatePlaceResponse>(_UpdatePlaceResponse_QNAME, UpdatePlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createSuggestion")
    public JAXBElement<CreateSuggestion> createCreateSuggestion(CreateSuggestion value) {
        return new JAXBElement<CreateSuggestion>(_CreateSuggestion_QNAME, CreateSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deleteSuggestion")
    public JAXBElement<DeleteSuggestion> createDeleteSuggestion(DeleteSuggestion value) {
        return new JAXBElement<DeleteSuggestion>(_DeleteSuggestion_QNAME, DeleteSuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuggestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "getSuggestions")
    public JAXBElement<GetSuggestions> createGetSuggestions(GetSuggestions value) {
        return new JAXBElement<GetSuggestions>(_GetSuggestions_QNAME, GetSuggestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSuggestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createSuggestionResponse")
    public JAXBElement<CreateSuggestionResponse> createCreateSuggestionResponse(CreateSuggestionResponse value) {
        return new JAXBElement<CreateSuggestionResponse>(_CreateSuggestionResponse_QNAME, CreateSuggestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "deletePlace")
    public JAXBElement<DeletePlace> createDeletePlace(DeletePlace value) {
        return new JAXBElement<DeletePlace>(_DeletePlace_QNAME, DeletePlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.business.knowyourtown/", name = "createPlace")
    public JAXBElement<CreatePlace> createCreatePlace(CreatePlace value) {
        return new JAXBElement<CreatePlace>(_CreatePlace_QNAME, CreatePlace.class, null, value);
    }

}
