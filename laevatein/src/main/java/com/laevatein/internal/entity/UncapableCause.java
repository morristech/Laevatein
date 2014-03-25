/*
 * Copyright (C) 2014 nohana, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.laevatein.internal.entity;

import com.laevatein.R;

/**
 * @author KeithYokoma
 * @since 2014/03/25
 * @version 1.0.0
 * @hide
 */
public enum UncapableCause {
    QUALITY(R.string.error_quality),
    FILE_TYPE(R.string.error_invalid_format);

    private final int mErrorMessageRes;

    private UncapableCause(int errorMessageRes) {
        mErrorMessageRes = errorMessageRes;
    }

    public int getErrorMessageRes() {
        return mErrorMessageRes;
    }
}
