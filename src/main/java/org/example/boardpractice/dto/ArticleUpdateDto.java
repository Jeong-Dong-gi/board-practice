package org.example.boardpractice.dto;

/**
 * DTO for {@link org.example.boardpractice.domain.Article}
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
) {
  public static ArticleUpdateDto of(String title, String content, String hashtag) {
    return new ArticleUpdateDto(title, content, hashtag);
  }
}