package main.java.creational.prototype;

import main.java.creational.prototype.models.CapableDocument;

/**
 * https://springframework.guru/gang-of-four-design-patterns/prototype-pattern/
 */
public class PrototypeMain {

    public static void main(String[] args) {
        System.out.println(System.identityHashCode(DocumentPrototypeManager.mutualAgreementDocument));
        CapableDocument clonedMutualAgreement = DocumentPrototypeManager.getClonedDocument("mutualAgreement");
        System.out.println(System.identityHashCode(clonedMutualAgreement));

        System.out.println(System.identityHashCode(DocumentPrototypeManager.termsCondition));
        CapableDocument clonedTermsCondition = DocumentPrototypeManager.getClonedDocument("termsCondition");
        System.out.println(System.identityHashCode(clonedTermsCondition));
    }
}
