/*
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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package c10n.tools.inspector.test1;

/**
 * @author rodion
 */

import c10n.C10NKey;
import c10n.C10NMessages;
import c10n.annotations.En;
import c10n.annotations.Ja;

@C10NKey("msg1")
@C10NMessages
interface Msg1 {
    //bundle lookup
    String key1();

    //bundle lookup
    String key2();

    @En("annotated value en")
    @Ja("annotated value ja")
    String annotatedValue();
}
