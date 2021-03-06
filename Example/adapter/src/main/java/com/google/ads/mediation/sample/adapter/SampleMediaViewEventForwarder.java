/*
 * Copyright (C) 2017 Google, Inc.
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

package com.google.ads.mediation.sample.adapter;

import com.google.ads.mediation.sample.sdk.SampleMediaView;
import com.google.ads.mediation.sample.sdk.SampleMediaViewListener;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/**
 * A {@link SampleMediaViewListener} that forwards events to AdMob Mediation's
 * {@link MediationNativeListener}.
 */
public class SampleMediaViewEventForwarder implements SampleMediaViewListener {
    private MediationNativeListener mNativeListener;
    private SampleAdapter mAdapter;
    private SampleMediaView mMediaView;

    /**
     * Creates a new {@code SampleNativeMediationEventForwarder}.
     *
     * @param listener  An AdMob Mediation {@link MediationNativeListener} that should receive
     *                 forwarded events.
     *
     * @param adapter  A {@link SampleAdapter} mediation adapter.
     *
     * @param mediaView A {@link SampleMediaView} for which to forward events to the Google Mobile
     *                  Ads SDK.
     */
    public SampleMediaViewEventForwarder(MediationNativeListener listener,
                                         SampleAdapter adapter, SampleMediaView mediaView) {
        mNativeListener = listener;
        mAdapter = adapter;
        mMediaView = mediaView;
    }

    @Override
    public void onVideoEnd() {
        mNativeListener.onVideoEnd(mAdapter);
    }
}
