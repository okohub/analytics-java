package com.segment.analytics;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public interface Payload {
  public enum Type {
    IDENTIFY, GROUP, TRACK, SCREEN, ALIAS
  }

  public Type type();

  public UUID messageId();

  public Date timestamp();

  @Nullable public Map<String, Object> context();

  @Nullable public UUID anonymousId();

  @Nullable public String userId();
}
