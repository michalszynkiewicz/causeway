/*
 * Copyright 2016 Honza Brázdil <jbrazdil@redhat.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.causeway.rest;

import javax.ws.rs.DefaultValue;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author Honza Brázdil <jbrazdil@redhat.com>
 */
@Data
public class CallbackTarget {
    @NonNull
    private final String url;
    
    @NonNull
    private final CallbackMethod method;

    @JsonCreator
    public CallbackTarget(@JsonProperty("url") String url,
            @JsonProperty("method") @DefaultValue("POST") CallbackMethod method) {
        this.url = url;
        this.method = method;
    }
    
    
}
