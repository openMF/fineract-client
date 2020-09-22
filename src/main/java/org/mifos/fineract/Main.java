package org.mifos.fineract;

import org.mifos.fineract.models.PostAuthenticationResponse;
import org.mifos.fineract.services.AuthenticationHttpBasicApi;
import rx.Observer;
import rx.schedulers.Schedulers;

/**
 * Created by grandolf49 on 20-08-2020
 * <p>
 * An example to illustrate the usage of consuming Fineract Client Library.
 */
public class Main {

    public static void main(String[] args) {

        // Authentication Example
        System.out.println("====== Mifos Fineract Client SDK =======");
        /*new FineractApiClient().getAuthApi().authenticate("mifos", "password").enqueue(
                new Callback<PostAuthenticationResponse>() {
                    @Override
                    public void onResponse(Call<PostAuthenticationResponse> call, Response<PostAuthenticationResponse> response) {
                        System.out.println(response.toString());
                        PostAuthenticationResponse body = response.body();
                        if (body != null) {
                            System.out.println(body.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<PostAuthenticationResponse> call, Throwable t) {
                        System.out.println(t.toString());
                    }
                }
        );
        */

        new FineractApiClient().createService(AuthenticationHttpBasicApi.class)
                .authenticate("mifos", "password")
                .observeOn(Schedulers.io())
                .subscribe(new Observer<PostAuthenticationResponse>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("Completed!");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("Error: " + throwable.getMessage());
                    }

                    @Override
                    public void onNext(PostAuthenticationResponse postAuthenticationResponse) {
                        if (postAuthenticationResponse != null) {
                            System.out.println("Success!");
                            System.out.println(postAuthenticationResponse.toString());
                        } else {
                            System.out.println("Null response");
                        }
                    }
                });
    }
}
