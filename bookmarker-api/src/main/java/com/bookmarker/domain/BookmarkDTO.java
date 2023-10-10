package com.bookmarker.domain;

import javax.persistence.Column;
import java.time.Instant;

public record BookmarkDTO(Long id, String title, String url, Instant createdAt) {
}
