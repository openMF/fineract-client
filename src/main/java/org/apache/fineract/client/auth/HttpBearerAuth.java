/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.client.auth;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HttpBearerAuth implements Interceptor {
    private final String scheme;
    private String bearerToken;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        // If the request already have an authorization (eg. Basic auth), do nothing
        if (request.header("Authorization") == null && bearerToken != null) {
            request = request.newBuilder()
                    .addHeader("Authorization", (scheme != null ? upperCaseBearer(scheme) + " " : "") + bearerToken)
                    .build();
        }
        return chain.proceed(request);
    }

    private static String upperCaseBearer(String scheme) {
        return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
    }

}
