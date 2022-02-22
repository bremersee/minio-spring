/*
 * Copyright 2020 the original author or authors.
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

package org.bremersee.minio.spring;

import io.minio.MinioClient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * The minio client callback.
 *
 * @param <T> the type of the result
 * @author Christian Bremer
 */
@Valid
public interface MinioClientCallback<T> {

  /**
   * Do with minio client.
   *
   * @param minioClient the minio client
   * @return the the result
   * @throws Exception the exception
   */
  T doWithMinioClient(@NotNull MinioClient minioClient) throws Exception;
}
