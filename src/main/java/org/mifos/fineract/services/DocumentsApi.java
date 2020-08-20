package org.mifos.fineract.services;

import okhttp3.MultipartBody;
import org.mifos.fineract.models.DeleteEntityTypeEntityIdDocumentsResponse;
import org.mifos.fineract.models.GetEntityTypeEntityIdDocumentsResponse;
import org.mifos.fineract.models.PostEntityTypeEntityIdDocumentsResponse;
import org.mifos.fineract.models.PutEntityTypeEntityIdDocumentsResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DocumentsApi {
    /**
     * Create a Document
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     *
     * @param entityType    entityType (required)
     * @param entityId      entityId (required)
     * @param contentLength Content-Length (optional)
     * @param file          file (optional)
     * @param name          name (optional)
     * @param description   description (optional)
     * @return Call&lt;PostEntityTypeEntityIdDocumentsResponse&gt;
     */
    @retrofit2.http.Multipart
    @POST("{entityType}/{entityId}/documents")
    Call<PostEntityTypeEntityIdDocumentsResponse> createDocument(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("name") String name, @retrofit2.http.Part("description") String description
    );

    /**
     * Remove a Document
     *
     * @param entityType entityType (required)
     * @param entityId   entityId (required)
     * @param documentId documentId (required)
     * @return Call&lt;DeleteEntityTypeEntityIdDocumentsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("{entityType}/{entityId}/documents/{documentId}")
    Call<DeleteEntityTypeEntityIdDocumentsResponse> deleteDocument(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
    );

    /**
     * Retrieve Binary File associated with Document
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     *
     * @param entityType entityType (required)
     * @param entityId   entityId (required)
     * @param documentId documentId (required)
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{entityType}/{entityId}/documents/{documentId}/attachment")
    Call<Void> downloadFile(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
    );

    /**
     * Retrieve a Document
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     *
     * @param entityType entityType (required)
     * @param entityId   entityId (required)
     * @param documentId documentId (required)
     * @return Call&lt;GetEntityTypeEntityIdDocumentsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{entityType}/{entityId}/documents/{documentId}")
    Call<GetEntityTypeEntityIdDocumentsResponse> getDocument(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId
    );

    /**
     * List documents
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     *
     * @param entityType entityType (required)
     * @param entityId   entityId (required)
     * @return Call&lt;List&lt;GetEntityTypeEntityIdDocumentsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("{entityType}/{entityId}/documents")
    Call<List<GetEntityTypeEntityIdDocumentsResponse>> retreiveAllDocuments(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId
    );

    /**
     * Update a Document
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     *
     * @param entityType    entityType (required)
     * @param entityId      entityId (required)
     * @param documentId    documentId (required)
     * @param contentLength Content-Length (optional)
     * @param file          file (optional)
     * @param name          name (optional)
     * @param description   description (optional)
     * @return Call&lt;PutEntityTypeEntityIdDocumentsResponse&gt;
     */
    @retrofit2.http.Multipart
    @PUT("{entityType}/{entityId}/documents/{documentId}")
    Call<PutEntityTypeEntityIdDocumentsResponse> updateDocument(
            @retrofit2.http.Path("entityType") String entityType, @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Path("documentId") Long documentId, @retrofit2.http.Header("Content-Length") Long contentLength, @retrofit2.http.Part MultipartBody.Part file, @retrofit2.http.Part("name") String name, @retrofit2.http.Part("description") String description
    );

}
