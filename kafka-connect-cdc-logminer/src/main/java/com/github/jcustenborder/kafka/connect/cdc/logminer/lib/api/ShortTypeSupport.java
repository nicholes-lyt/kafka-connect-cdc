/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jcustenborder.kafka.connect.cdc.logminer.lib.api;

import com.github.jcustenborder.kafka.connect.cdc.logminer.lib.utils.Utils;

/**
 * Created by zhengwx on 6/26/17.
 */

public class ShortTypeSupport extends TypeSupport<Short> {

    @Override
    public Short convert(Object value) {
        if (value instanceof Short) {
            return (Short) value;
        }
        if (value instanceof String) {
            return Short.parseShort((String) value);
        }
        if (value instanceof Integer) {
            return ((Integer)value).shortValue();
        }
        if (value instanceof Long) {
            return ((Long)value).shortValue();
        }
        if (value instanceof Byte) {
            return ((Byte)value).shortValue();
        }
        if (value instanceof Float) {
            return ((Float)value).shortValue();
        }
        if (value instanceof Double) {
            return ((Double)value).shortValue();
        }
        if (value instanceof Number) {
            return ((Number)value).shortValue();
        }
        throw new IllegalArgumentException(Utils.format(Errors.API_17.getMessage(),
                value.getClass().getSimpleName(), value));
    }

}
