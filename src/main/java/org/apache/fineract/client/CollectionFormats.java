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
package org.apache.fineract.client;

import java.util.Arrays;
import java.util.List;

public class CollectionFormats {

    public static class CSVParams {

        protected List<String> params;

        public CSVParams() {
        }

        public CSVParams(List<String> params) {
            this.params = params;
        }

        public CSVParams(String... params) {
            this.params = Arrays.asList(params);
        }

        public List<String> getParams() {
            return params;
        }

        public void setParams(List<String> params) {
            this.params = params;
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), ",");
        }

    }

    public static class SPACEParams extends SSVParams {

    }

    public static class SSVParams extends CSVParams {

        public SSVParams() {
        }

        public SSVParams(List<String> params) {
            super(params);
        }

        public SSVParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), " ");
        }
    }

    public static class TSVParams extends CSVParams {

        public TSVParams() {
        }

        public TSVParams(List<String> params) {
            super(params);
        }

        public TSVParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join( params.toArray(new String[0]), "\t");
        }
    }

    public static class PIPESParams extends CSVParams {

        public PIPESParams() {
        }

        public PIPESParams(List<String> params) {
            super(params);
        }

        public PIPESParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), "|");
        }
    }

}
