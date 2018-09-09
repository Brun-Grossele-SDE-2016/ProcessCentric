
package knowyourtown.business.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import knowyourtown.localdb.webservice.Suggestion;


/**
 * <p>Classe Java per getSuggestionsResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getSuggestionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listSuggestion" type="{http://webservice.localdb.knowyourtown/}suggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSuggestionsResponse", propOrder = {
    "listSuggestion"
})
public class GetSuggestionsResponse {

    protected List<Suggestion> listSuggestion;

    /**
     * Gets the value of the listSuggestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSuggestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSuggestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Suggestion }
     * 
     * 
     */
    public List<Suggestion> getListSuggestion() {
        if (listSuggestion == null) {
            listSuggestion = new ArrayList<Suggestion>();
        }
        return this.listSuggestion;
    }

}
