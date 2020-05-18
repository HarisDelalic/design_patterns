package main.java.creational.prototype;

import main.java.creational.prototype.models.AuthorizedSignatory;
import main.java.creational.prototype.models.CapableDocument;
import main.java.creational.prototype.models.MutualAgreementDocument;
import main.java.creational.prototype.models.TermsConditionDocument;

public class DocumentPrototypeManager {
    private static java.util.Map<String, CapableDocument> prototypes = new java.util.HashMap<String, CapableDocument>();

    static TermsConditionDocument termsCondition = new TermsConditionDocument();
    static MutualAgreementDocument mutualAgreementDocument = new MutualAgreementDocument();

    static {
        prototypes.put("termsCondition", termsCondition);
        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");
        mutualAgreementDocument.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("mutualAgreement", mutualAgreementDocument);
    }
    static CapableDocument getClonedDocument(final String type) {
        CapableDocument clonedDoc = null;
        try {
            CapableDocument doc = prototypes.get(type);
            clonedDoc = doc.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedDoc;
    }
}
