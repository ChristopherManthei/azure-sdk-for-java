// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation;

import com.azure.containers.containerregistry.models.BlobDownloadAsyncResult;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Flux;

import java.nio.ByteBuffer;

public final class ConstructorAccessors {
    private static final ClientLogger LOGGER = new ClientLogger(ConstructorAccessors.class);
    private static BlobDownloadAsyncResultConstructorAccessor blobDownloadAccessor;
    public interface BlobDownloadAsyncResultConstructorAccessor {
        BlobDownloadAsyncResult create(String digest, Flux<ByteBuffer> content);
    }

    public static void setBlobDownloadResultAccessor(final BlobDownloadAsyncResultConstructorAccessor accessor) {
        blobDownloadAccessor = accessor;
    }

    public static BlobDownloadAsyncResult createBlobDownloadResult(String digest, Flux<ByteBuffer> content) {
        if (blobDownloadAccessor == null) {
            try {
                // it's possible that nobody yet created BlobDownloadAsyncResult, so we'll need to force its static section to run and set accessor.
                Class.forName(BlobDownloadAsyncResult.class.getName(), true, BlobDownloadAsyncResultConstructorAccessor.class.getClassLoader());
            } catch (ClassNotFoundException e) {
                throw LOGGER.logExceptionAsError(new RuntimeException(e));
            }
        }
        assert blobDownloadAccessor != null;
        return blobDownloadAccessor.create(digest, content);
    }
}