package io.vertx.test.codegen.testapi.handler;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface InterfaceOverridingAsyncResultHandler extends Handler<AsyncResult<String>> {

  // Explicit override
  @Override
  void handle(AsyncResult<String> stringAsyncResult);
}