/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModForumGetDiscussionPosts200ResponsePostsInner
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_posts_200_response_posts_inner")]
    public partial class ModForumGetDiscussionPosts200ResponsePostsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPosts200ResponsePostsInner" /> class.
        /// </summary>
        /// <param name="attachments">attachments.</param>
        /// <param name="author">author.</param>
        /// <param name="capabilities">capabilities.</param>
        /// <param name="charcount">charcount.</param>
        /// <param name="discussionid">discussionid.</param>
        /// <param name="hasparent">hasparent.</param>
        /// <param name="haswordcount">haswordcount.</param>
        /// <param name="html">html.</param>
        /// <param name="id">id.</param>
        /// <param name="isdeleted">isdeleted.</param>
        /// <param name="isprivatereply">isprivatereply.</param>
        /// <param name="message">message.</param>
        /// <param name="messageformat">message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="messageinlinefiles">messageinlinefiles.</param>
        /// <param name="parentid">parentid.</param>
        /// <param name="replysubject">replysubject.</param>
        /// <param name="subject">subject.</param>
        /// <param name="tags">tags.</param>
        /// <param name="timecreated">timecreated.</param>
        /// <param name="timemodified">timemodified.</param>
        /// <param name="unread">unread.</param>
        /// <param name="urls">urls.</param>
        /// <param name="wordcount">wordcount.</param>
        public ModForumGetDiscussionPosts200ResponsePostsInner(List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> attachments = default(List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner>), ModForumGetDiscussionPost200ResponsePostAuthor author = default(ModForumGetDiscussionPost200ResponsePostAuthor), ModForumGetDiscussionPost200ResponsePostCapabilities capabilities = default(ModForumGetDiscussionPost200ResponsePostCapabilities), int charcount = default(int), int discussionid = default(int), bool hasparent = default(bool), bool haswordcount = default(bool), ModForumGetDiscussionPost200ResponsePostHtml html = default(ModForumGetDiscussionPost200ResponsePostHtml), int id = default(int), bool isdeleted = default(bool), bool isprivatereply = default(bool), string message = default(string), int messageformat = default(int), List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> messageinlinefiles = default(List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner>), int parentid = default(int), string replysubject = default(string), string subject = default(string), List<ModForumGetDiscussionPost200ResponsePostTagsInner> tags = default(List<ModForumGetDiscussionPost200ResponsePostTagsInner>), int timecreated = default(int), int timemodified = default(int), bool unread = default(bool), ModForumGetDiscussionPost200ResponsePostUrls urls = default(ModForumGetDiscussionPost200ResponsePostUrls), int wordcount = default(int))
        {
            this.Attachments = attachments;
            this.Author = author;
            this.Capabilities = capabilities;
            this.Charcount = charcount;
            this.Discussionid = discussionid;
            this.Hasparent = hasparent;
            this.Haswordcount = haswordcount;
            this.Html = html;
            this.Id = id;
            this.Isdeleted = isdeleted;
            this.Isprivatereply = isprivatereply;
            this.Message = message;
            this.Messageformat = messageformat;
            this.Messageinlinefiles = messageinlinefiles;
            this.Parentid = parentid;
            this.Replysubject = replysubject;
            this.Subject = subject;
            this.Tags = tags;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Unread = unread;
            this.Urls = urls;
            this.Wordcount = wordcount;
        }

        /// <summary>
        /// Gets or Sets Attachments
        /// </summary>
        [DataMember(Name = "attachments", EmitDefaultValue = false)]
        public List<ModForumGetDiscussionPost200ResponsePostAttachmentsInner> Attachments { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name = "author", EmitDefaultValue = false)]
        public ModForumGetDiscussionPost200ResponsePostAuthor Author { get; set; }

        /// <summary>
        /// Gets or Sets Capabilities
        /// </summary>
        [DataMember(Name = "capabilities", EmitDefaultValue = false)]
        public ModForumGetDiscussionPost200ResponsePostCapabilities Capabilities { get; set; }

        /// <summary>
        /// charcount
        /// </summary>
        /// <value>charcount</value>
        [DataMember(Name = "charcount", EmitDefaultValue = false)]
        public int Charcount { get; set; }

        /// <summary>
        /// discussionid
        /// </summary>
        /// <value>discussionid</value>
        [DataMember(Name = "discussionid", EmitDefaultValue = false)]
        public int Discussionid { get; set; }

        /// <summary>
        /// hasparent
        /// </summary>
        /// <value>hasparent</value>
        [DataMember(Name = "hasparent", EmitDefaultValue = true)]
        public bool Hasparent { get; set; }

        /// <summary>
        /// haswordcount
        /// </summary>
        /// <value>haswordcount</value>
        [DataMember(Name = "haswordcount", EmitDefaultValue = true)]
        public bool Haswordcount { get; set; }

        /// <summary>
        /// Gets or Sets Html
        /// </summary>
        [DataMember(Name = "html", EmitDefaultValue = false)]
        public ModForumGetDiscussionPost200ResponsePostHtml Html { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// isdeleted
        /// </summary>
        /// <value>isdeleted</value>
        [DataMember(Name = "isdeleted", EmitDefaultValue = true)]
        public bool Isdeleted { get; set; }

        /// <summary>
        /// isprivatereply
        /// </summary>
        /// <value>isprivatereply</value>
        [DataMember(Name = "isprivatereply", EmitDefaultValue = true)]
        public bool Isprivatereply { get; set; }

        /// <summary>
        /// message
        /// </summary>
        /// <value>message</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "messageformat", EmitDefaultValue = false)]
        public int Messageformat { get; set; }

        /// <summary>
        /// Gets or Sets Messageinlinefiles
        /// </summary>
        [DataMember(Name = "messageinlinefiles", EmitDefaultValue = false)]
        public List<ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner> Messageinlinefiles { get; set; }

        /// <summary>
        /// parentid
        /// </summary>
        /// <value>parentid</value>
        [DataMember(Name = "parentid", EmitDefaultValue = false)]
        public int Parentid { get; set; }

        /// <summary>
        /// replysubject
        /// </summary>
        /// <value>replysubject</value>
        [DataMember(Name = "replysubject", EmitDefaultValue = false)]
        public string Replysubject { get; set; }

        /// <summary>
        /// subject
        /// </summary>
        /// <value>subject</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<ModForumGetDiscussionPost200ResponsePostTagsInner> Tags { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// unread
        /// </summary>
        /// <value>unread</value>
        [DataMember(Name = "unread", EmitDefaultValue = true)]
        public bool Unread { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", EmitDefaultValue = false)]
        public ModForumGetDiscussionPost200ResponsePostUrls Urls { get; set; }

        /// <summary>
        /// wordcount
        /// </summary>
        /// <value>wordcount</value>
        [DataMember(Name = "wordcount", EmitDefaultValue = false)]
        public int Wordcount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPosts200ResponsePostsInner {\n");
            sb.Append("  Attachments: ").Append(Attachments).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Capabilities: ").Append(Capabilities).Append("\n");
            sb.Append("  Charcount: ").Append(Charcount).Append("\n");
            sb.Append("  Discussionid: ").Append(Discussionid).Append("\n");
            sb.Append("  Hasparent: ").Append(Hasparent).Append("\n");
            sb.Append("  Haswordcount: ").Append(Haswordcount).Append("\n");
            sb.Append("  Html: ").Append(Html).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Isdeleted: ").Append(Isdeleted).Append("\n");
            sb.Append("  Isprivatereply: ").Append(Isprivatereply).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Messageformat: ").Append(Messageformat).Append("\n");
            sb.Append("  Messageinlinefiles: ").Append(Messageinlinefiles).Append("\n");
            sb.Append("  Parentid: ").Append(Parentid).Append("\n");
            sb.Append("  Replysubject: ").Append(Replysubject).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Unread: ").Append(Unread).Append("\n");
            sb.Append("  Urls: ").Append(Urls).Append("\n");
            sb.Append("  Wordcount: ").Append(Wordcount).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
