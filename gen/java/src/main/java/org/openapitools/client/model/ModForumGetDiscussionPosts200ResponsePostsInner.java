/*
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostAttachmentsInner;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostAuthor;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostCapabilities;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostHtml;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostTagsInner;
import org.openapitools.client.model.ModForumGetDiscussionPost200ResponsePostUrls;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.joshuapare.JSON;

/**
 * ModForumGetDiscussionPosts200ResponsePostsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-18T14:00:07.069642-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModForumGetDiscussionPosts200ResponsePostsInner {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private ModForumGetDiscussionPost200ResponsePostAuthor author;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private ModForumGetDiscussionPost200ResponsePostCapabilities capabilities;

  public static final String SERIALIZED_NAME_CHARCOUNT = "charcount";
  @SerializedName(SERIALIZED_NAME_CHARCOUNT)
  private Integer charcount;

  public static final String SERIALIZED_NAME_DISCUSSIONID = "discussionid";
  @SerializedName(SERIALIZED_NAME_DISCUSSIONID)
  private Integer discussionid;

  public static final String SERIALIZED_NAME_HASPARENT = "hasparent";
  @SerializedName(SERIALIZED_NAME_HASPARENT)
  private Boolean hasparent;

  public static final String SERIALIZED_NAME_HASWORDCOUNT = "haswordcount";
  @SerializedName(SERIALIZED_NAME_HASWORDCOUNT)
  private Boolean haswordcount;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private ModForumGetDiscussionPost200ResponsePostHtml html;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISDELETED = "isdeleted";
  @SerializedName(SERIALIZED_NAME_ISDELETED)
  private Boolean isdeleted;

  public static final String SERIALIZED_NAME_ISPRIVATEREPLY = "isprivatereply";
  @SerializedName(SERIALIZED_NAME_ISPRIVATEREPLY)
  private Boolean isprivatereply;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGEFORMAT = "messageformat";
  @SerializedName(SERIALIZED_NAME_MESSAGEFORMAT)
  private Integer messageformat;

  public static final String SERIALIZED_NAME_MESSAGEINLINEFILES = "messageinlinefiles";
  @SerializedName(SERIALIZED_NAME_MESSAGEINLINEFILES)
  private List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> messageinlinefiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENTID = "parentid";
  @SerializedName(SERIALIZED_NAME_PARENTID)
  private Integer parentid;

  public static final String SERIALIZED_NAME_REPLYSUBJECT = "replysubject";
  @SerializedName(SERIALIZED_NAME_REPLYSUBJECT)
  private String replysubject;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ModForumGetDiscussionPost200ResponsePostTagsInner> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMECREATED = "timecreated";
  @SerializedName(SERIALIZED_NAME_TIMECREATED)
  private Integer timecreated;

  public static final String SERIALIZED_NAME_TIMEMODIFIED = "timemodified";
  @SerializedName(SERIALIZED_NAME_TIMEMODIFIED)
  private Integer timemodified;

  public static final String SERIALIZED_NAME_UNREAD = "unread";
  @SerializedName(SERIALIZED_NAME_UNREAD)
  private Boolean unread;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private ModForumGetDiscussionPost200ResponsePostUrls urls;

  public static final String SERIALIZED_NAME_WORDCOUNT = "wordcount";
  @SerializedName(SERIALIZED_NAME_WORDCOUNT)
  private Integer wordcount;

  public ModForumGetDiscussionPosts200ResponsePostsInner() {
  }

  public ModForumGetDiscussionPosts200ResponsePostsInner attachments(List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ModForumGetDiscussionPosts200ResponsePostsInner addAttachmentsItem(ModForumGetDiscussionPost200ResponsePostAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner author(ModForumGetDiscussionPost200ResponsePostAuthor author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  public ModForumGetDiscussionPost200ResponsePostAuthor getAuthor() {
    return author;
  }

  public void setAuthor(ModForumGetDiscussionPost200ResponsePostAuthor author) {
    this.author = author;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner capabilities(ModForumGetDiscussionPost200ResponsePostCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @javax.annotation.Nullable
  public ModForumGetDiscussionPost200ResponsePostCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(ModForumGetDiscussionPost200ResponsePostCapabilities capabilities) {
    this.capabilities = capabilities;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner charcount(Integer charcount) {
    this.charcount = charcount;
    return this;
  }

   /**
   * charcount
   * @return charcount
  **/
  @javax.annotation.Nullable
  public Integer getCharcount() {
    return charcount;
  }

  public void setCharcount(Integer charcount) {
    this.charcount = charcount;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner discussionid(Integer discussionid) {
    this.discussionid = discussionid;
    return this;
  }

   /**
   * discussionid
   * @return discussionid
  **/
  @javax.annotation.Nullable
  public Integer getDiscussionid() {
    return discussionid;
  }

  public void setDiscussionid(Integer discussionid) {
    this.discussionid = discussionid;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner hasparent(Boolean hasparent) {
    this.hasparent = hasparent;
    return this;
  }

   /**
   * hasparent
   * @return hasparent
  **/
  @javax.annotation.Nullable
  public Boolean getHasparent() {
    return hasparent;
  }

  public void setHasparent(Boolean hasparent) {
    this.hasparent = hasparent;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner haswordcount(Boolean haswordcount) {
    this.haswordcount = haswordcount;
    return this;
  }

   /**
   * haswordcount
   * @return haswordcount
  **/
  @javax.annotation.Nullable
  public Boolean getHaswordcount() {
    return haswordcount;
  }

  public void setHaswordcount(Boolean haswordcount) {
    this.haswordcount = haswordcount;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner html(ModForumGetDiscussionPost200ResponsePostHtml html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @javax.annotation.Nullable
  public ModForumGetDiscussionPost200ResponsePostHtml getHtml() {
    return html;
  }

  public void setHtml(ModForumGetDiscussionPost200ResponsePostHtml html) {
    this.html = html;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner isdeleted(Boolean isdeleted) {
    this.isdeleted = isdeleted;
    return this;
  }

   /**
   * isdeleted
   * @return isdeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsdeleted() {
    return isdeleted;
  }

  public void setIsdeleted(Boolean isdeleted) {
    this.isdeleted = isdeleted;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner isprivatereply(Boolean isprivatereply) {
    this.isprivatereply = isprivatereply;
    return this;
  }

   /**
   * isprivatereply
   * @return isprivatereply
  **/
  @javax.annotation.Nullable
  public Boolean getIsprivatereply() {
    return isprivatereply;
  }

  public void setIsprivatereply(Boolean isprivatereply) {
    this.isprivatereply = isprivatereply;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner messageformat(Integer messageformat) {
    this.messageformat = messageformat;
    return this;
  }

   /**
   * message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
   * @return messageformat
  **/
  @javax.annotation.Nullable
  public Integer getMessageformat() {
    return messageformat;
  }

  public void setMessageformat(Integer messageformat) {
    this.messageformat = messageformat;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner messageinlinefiles(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> messageinlinefiles) {
    this.messageinlinefiles = messageinlinefiles;
    return this;
  }

  public ModForumGetDiscussionPosts200ResponsePostsInner addMessageinlinefilesItem(ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner messageinlinefilesItem) {
    if (this.messageinlinefiles == null) {
      this.messageinlinefiles = new ArrayList<>();
    }
    this.messageinlinefiles.add(messageinlinefilesItem);
    return this;
  }

   /**
   * Get messageinlinefiles
   * @return messageinlinefiles
  **/
  @javax.annotation.Nullable
  public List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> getMessageinlinefiles() {
    return messageinlinefiles;
  }

  public void setMessageinlinefiles(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> messageinlinefiles) {
    this.messageinlinefiles = messageinlinefiles;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner parentid(Integer parentid) {
    this.parentid = parentid;
    return this;
  }

   /**
   * parentid
   * @return parentid
  **/
  @javax.annotation.Nullable
  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner replysubject(String replysubject) {
    this.replysubject = replysubject;
    return this;
  }

   /**
   * replysubject
   * @return replysubject
  **/
  @javax.annotation.Nullable
  public String getReplysubject() {
    return replysubject;
  }

  public void setReplysubject(String replysubject) {
    this.replysubject = replysubject;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner tags(List<ModForumGetDiscussionPost200ResponsePostTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public ModForumGetDiscussionPosts200ResponsePostsInner addTagsItem(ModForumGetDiscussionPost200ResponsePostTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<ModForumGetDiscussionPost200ResponsePostTagsInner> getTags() {
    return tags;
  }

  public void setTags(List<ModForumGetDiscussionPost200ResponsePostTagsInner> tags) {
    this.tags = tags;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner timecreated(Integer timecreated) {
    this.timecreated = timecreated;
    return this;
  }

   /**
   * timecreated
   * @return timecreated
  **/
  @javax.annotation.Nullable
  public Integer getTimecreated() {
    return timecreated;
  }

  public void setTimecreated(Integer timecreated) {
    this.timecreated = timecreated;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner timemodified(Integer timemodified) {
    this.timemodified = timemodified;
    return this;
  }

   /**
   * timemodified
   * @return timemodified
  **/
  @javax.annotation.Nullable
  public Integer getTimemodified() {
    return timemodified;
  }

  public void setTimemodified(Integer timemodified) {
    this.timemodified = timemodified;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner unread(Boolean unread) {
    this.unread = unread;
    return this;
  }

   /**
   * unread
   * @return unread
  **/
  @javax.annotation.Nullable
  public Boolean getUnread() {
    return unread;
  }

  public void setUnread(Boolean unread) {
    this.unread = unread;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner urls(ModForumGetDiscussionPost200ResponsePostUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  public ModForumGetDiscussionPost200ResponsePostUrls getUrls() {
    return urls;
  }

  public void setUrls(ModForumGetDiscussionPost200ResponsePostUrls urls) {
    this.urls = urls;
  }


  public ModForumGetDiscussionPosts200ResponsePostsInner wordcount(Integer wordcount) {
    this.wordcount = wordcount;
    return this;
  }

   /**
   * wordcount
   * @return wordcount
  **/
  @javax.annotation.Nullable
  public Integer getWordcount() {
    return wordcount;
  }

  public void setWordcount(Integer wordcount) {
    this.wordcount = wordcount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModForumGetDiscussionPosts200ResponsePostsInner modForumGetDiscussionPosts200ResponsePostsInner = (ModForumGetDiscussionPosts200ResponsePostsInner) o;
    return Objects.equals(this.attachments, modForumGetDiscussionPosts200ResponsePostsInner.attachments) &&
        Objects.equals(this.author, modForumGetDiscussionPosts200ResponsePostsInner.author) &&
        Objects.equals(this.capabilities, modForumGetDiscussionPosts200ResponsePostsInner.capabilities) &&
        Objects.equals(this.charcount, modForumGetDiscussionPosts200ResponsePostsInner.charcount) &&
        Objects.equals(this.discussionid, modForumGetDiscussionPosts200ResponsePostsInner.discussionid) &&
        Objects.equals(this.hasparent, modForumGetDiscussionPosts200ResponsePostsInner.hasparent) &&
        Objects.equals(this.haswordcount, modForumGetDiscussionPosts200ResponsePostsInner.haswordcount) &&
        Objects.equals(this.html, modForumGetDiscussionPosts200ResponsePostsInner.html) &&
        Objects.equals(this.id, modForumGetDiscussionPosts200ResponsePostsInner.id) &&
        Objects.equals(this.isdeleted, modForumGetDiscussionPosts200ResponsePostsInner.isdeleted) &&
        Objects.equals(this.isprivatereply, modForumGetDiscussionPosts200ResponsePostsInner.isprivatereply) &&
        Objects.equals(this.message, modForumGetDiscussionPosts200ResponsePostsInner.message) &&
        Objects.equals(this.messageformat, modForumGetDiscussionPosts200ResponsePostsInner.messageformat) &&
        Objects.equals(this.messageinlinefiles, modForumGetDiscussionPosts200ResponsePostsInner.messageinlinefiles) &&
        Objects.equals(this.parentid, modForumGetDiscussionPosts200ResponsePostsInner.parentid) &&
        Objects.equals(this.replysubject, modForumGetDiscussionPosts200ResponsePostsInner.replysubject) &&
        Objects.equals(this.subject, modForumGetDiscussionPosts200ResponsePostsInner.subject) &&
        Objects.equals(this.tags, modForumGetDiscussionPosts200ResponsePostsInner.tags) &&
        Objects.equals(this.timecreated, modForumGetDiscussionPosts200ResponsePostsInner.timecreated) &&
        Objects.equals(this.timemodified, modForumGetDiscussionPosts200ResponsePostsInner.timemodified) &&
        Objects.equals(this.unread, modForumGetDiscussionPosts200ResponsePostsInner.unread) &&
        Objects.equals(this.urls, modForumGetDiscussionPosts200ResponsePostsInner.urls) &&
        Objects.equals(this.wordcount, modForumGetDiscussionPosts200ResponsePostsInner.wordcount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, author, capabilities, charcount, discussionid, hasparent, haswordcount, html, id, isdeleted, isprivatereply, message, messageformat, messageinlinefiles, parentid, replysubject, subject, tags, timecreated, timemodified, unread, urls, wordcount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModForumGetDiscussionPosts200ResponsePostsInner {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    charcount: ").append(toIndentedString(charcount)).append("\n");
    sb.append("    discussionid: ").append(toIndentedString(discussionid)).append("\n");
    sb.append("    hasparent: ").append(toIndentedString(hasparent)).append("\n");
    sb.append("    haswordcount: ").append(toIndentedString(haswordcount)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isdeleted: ").append(toIndentedString(isdeleted)).append("\n");
    sb.append("    isprivatereply: ").append(toIndentedString(isprivatereply)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageformat: ").append(toIndentedString(messageformat)).append("\n");
    sb.append("    messageinlinefiles: ").append(toIndentedString(messageinlinefiles)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    replysubject: ").append(toIndentedString(replysubject)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timecreated: ").append(toIndentedString(timecreated)).append("\n");
    sb.append("    timemodified: ").append(toIndentedString(timemodified)).append("\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    wordcount: ").append(toIndentedString(wordcount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attachments");
    openapiFields.add("author");
    openapiFields.add("capabilities");
    openapiFields.add("charcount");
    openapiFields.add("discussionid");
    openapiFields.add("hasparent");
    openapiFields.add("haswordcount");
    openapiFields.add("html");
    openapiFields.add("id");
    openapiFields.add("isdeleted");
    openapiFields.add("isprivatereply");
    openapiFields.add("message");
    openapiFields.add("messageformat");
    openapiFields.add("messageinlinefiles");
    openapiFields.add("parentid");
    openapiFields.add("replysubject");
    openapiFields.add("subject");
    openapiFields.add("tags");
    openapiFields.add("timecreated");
    openapiFields.add("timemodified");
    openapiFields.add("unread");
    openapiFields.add("urls");
    openapiFields.add("wordcount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModForumGetDiscussionPosts200ResponsePostsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModForumGetDiscussionPosts200ResponsePostsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModForumGetDiscussionPosts200ResponsePostsInner is not found in the empty JSON string", ModForumGetDiscussionPosts200ResponsePostsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModForumGetDiscussionPosts200ResponsePostsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModForumGetDiscussionPosts200ResponsePostsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            ModForumGetDiscussionPost200ResponsePostAttachmentsInner.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        ModForumGetDiscussionPost200ResponsePostAuthor.validateJsonElement(jsonObj.get("author"));
      }
      // validate the optional field `capabilities`
      if (jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull()) {
        ModForumGetDiscussionPost200ResponsePostCapabilities.validateJsonElement(jsonObj.get("capabilities"));
      }
      // validate the optional field `html`
      if (jsonObj.get("html") != null && !jsonObj.get("html").isJsonNull()) {
        ModForumGetDiscussionPost200ResponsePostHtml.validateJsonElement(jsonObj.get("html"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("messageinlinefiles") != null && !jsonObj.get("messageinlinefiles").isJsonNull()) {
        JsonArray jsonArraymessageinlinefiles = jsonObj.getAsJsonArray("messageinlinefiles");
        if (jsonArraymessageinlinefiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("messageinlinefiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `messageinlinefiles` to be an array in the JSON string but got `%s`", jsonObj.get("messageinlinefiles").toString()));
          }

          // validate the optional field `messageinlinefiles` (array)
          for (int i = 0; i < jsonArraymessageinlinefiles.size(); i++) {
            ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.validateJsonElement(jsonArraymessageinlinefiles.get(i));
          };
        }
      }
      if ((jsonObj.get("replysubject") != null && !jsonObj.get("replysubject").isJsonNull()) && !jsonObj.get("replysubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replysubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replysubject").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ModForumGetDiscussionPost200ResponsePostTagsInner.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      // validate the optional field `urls`
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonNull()) {
        ModForumGetDiscussionPost200ResponsePostUrls.validateJsonElement(jsonObj.get("urls"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModForumGetDiscussionPosts200ResponsePostsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModForumGetDiscussionPosts200ResponsePostsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModForumGetDiscussionPosts200ResponsePostsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModForumGetDiscussionPosts200ResponsePostsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ModForumGetDiscussionPosts200ResponsePostsInner>() {
           @Override
           public void write(JsonWriter out, ModForumGetDiscussionPosts200ResponsePostsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModForumGetDiscussionPosts200ResponsePostsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModForumGetDiscussionPosts200ResponsePostsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModForumGetDiscussionPosts200ResponsePostsInner
  * @throws IOException if the JSON string is invalid with respect to ModForumGetDiscussionPosts200ResponsePostsInner
  */
  public static ModForumGetDiscussionPosts200ResponsePostsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModForumGetDiscussionPosts200ResponsePostsInner.class);
  }

 /**
  * Convert an instance of ModForumGetDiscussionPosts200ResponsePostsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

