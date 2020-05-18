package main.java.creational.prototype.models;

public class MutualAgreementDocument implements CapableDocument {

    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public CapableDocument makeCopy() {
        MutualAgreementDocument mutualAgreementDocument = null;
        try {
            mutualAgreementDocument = (MutualAgreementDocument) super.clone();
            // False since objects are not same, object 'this' is cloned
            System.out.println(this == mutualAgreementDocument);

            // True, although objects are not the same, complex attributes which are not primitives or immutables are not copied
            // So, both objects share same reference to authorizedSignatory
            System.out.println(this.getAuthorizedSignatory() == mutualAgreementDocument.getAuthorizedSignatory());

            // We have to deal complex objects manually
            AuthorizedSignatory authorizedSignatory = (AuthorizedSignatory) mutualAgreementDocument.getAuthorizedSignatory().clone();
            mutualAgreementDocument.setAuthorizedSignatory(authorizedSignatory);

            // False, now attribute is copied (deep copy of authorized signatory attribute is made)
            System.out.println(this.getAuthorizedSignatory() == mutualAgreementDocument.getAuthorizedSignatory());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mutualAgreementDocument;
    }
}
