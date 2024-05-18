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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// post
    /// </summary>
    [DataContract(Name = "mod_forum_get_forum_discussions_200_response_discussions_inner")]
    public partial class ModForumGetForumDiscussions200ResponseDiscussionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetForumDiscussions200ResponseDiscussionsInner" /> class.
        /// </summary>
        /// <param name="attachment">Has attachments? (default to &quot;null&quot;).</param>
        /// <param name="attachments">attachments.</param>
        /// <param name="canfavourite">Can the user star the discussion (default to null).</param>
        /// <param name="canlock">Can the user lock the discussion (default to null).</param>
        /// <param name="canreply">Can the user reply to the discussion (default to null).</param>
        /// <param name="created">Creation time (default to null).</param>
        /// <param name="discussion">Discussion id (default to null).</param>
        /// <param name="groupid">Group id.</param>
        /// <param name="id">Post id (default to null).</param>
        /// <param name="locked">Is the discussion locked (default to null).</param>
        /// <param name="mailed">Mailed? (default to null).</param>
        /// <param name="mailnow">Mail now? (default to null).</param>
        /// <param name="message">The post message (default to &quot;null&quot;).</param>
        /// <param name="messageformat">message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN).</param>
        /// <param name="messageinlinefiles">messageinlinefiles.</param>
        /// <param name="messagetrust">Can we trust? (default to null).</param>
        /// <param name="modified">Time modified.</param>
        /// <param name="name">Discussion name (default to &quot;null&quot;).</param>
        /// <param name="numreplies">The number of replies in the discussion (default to null).</param>
        /// <param name="numunread">The number of unread discussions. (default to null).</param>
        /// <param name="parent">Parent id (default to null).</param>
        /// <param name="pinned">Is the discussion pinned (default to null).</param>
        /// <param name="starred">Is the discussion starred (default to null).</param>
        /// <param name="subject">The post subject (default to &quot;null&quot;).</param>
        /// <param name="timeend">Time discussion ends (default to null).</param>
        /// <param name="timemodified">Time modified.</param>
        /// <param name="timestart">Time discussion can start (default to null).</param>
        /// <param name="totalscore">The post message total score (default to null).</param>
        /// <param name="userfullname">Post author full name (default to &quot;null&quot;).</param>
        /// <param name="userid">User who started the discussion id (default to null).</param>
        /// <param name="usermodified">The id of the user who last modified (default to null).</param>
        /// <param name="usermodifiedfullname">Post modifier full name (default to &quot;null&quot;).</param>
        /// <param name="usermodifiedpictureurl">Post modifier picture. (default to &quot;null&quot;).</param>
        /// <param name="userpictureurl">Post author picture. (default to &quot;null&quot;).</param>
        public ModForumGetForumDiscussions200ResponseDiscussionsInner(string attachment = @"null", List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> attachments = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), bool canfavourite = null, bool canlock = null, bool canreply = null, int created = null, int discussion = null, int groupid = default(int), int id = null, bool locked = null, int mailed = null, int mailnow = null, string message = @"null", int messageformat = default(int), List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> messageinlinefiles = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>), int messagetrust = null, int modified = default(int), string name = @"null", int numreplies = null, int numunread = null, int parent = null, bool pinned = null, bool starred = null, string subject = @"null", int timeend = null, int timemodified = default(int), int timestart = null, int totalscore = null, string userfullname = @"null", int userid = null, int usermodified = null, string usermodifiedfullname = @"null", string usermodifiedpictureurl = @"null", string userpictureurl = @"null")
        {
            // use default value if no "attachment" provided
            this.Attachment = attachment ?? @"null";
            this.Attachments = attachments;
            this.Canfavourite = canfavourite;
            this.Canlock = canlock;
            this.Canreply = canreply;
            this.Created = created;
            this.Discussion = discussion;
            this.Groupid = groupid;
            this.Id = id;
            this.Locked = locked;
            this.Mailed = mailed;
            this.Mailnow = mailnow;
            // use default value if no "message" provided
            this.Message = message ?? @"null";
            this.Messageformat = messageformat;
            this.Messageinlinefiles = messageinlinefiles;
            this.Messagetrust = messagetrust;
            this.Modified = modified;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Numreplies = numreplies;
            this.Numunread = numunread;
            this.Parent = parent;
            this.Pinned = pinned;
            this.Starred = starred;
            // use default value if no "subject" provided
            this.Subject = subject ?? @"null";
            this.Timeend = timeend;
            this.Timemodified = timemodified;
            this.Timestart = timestart;
            this.Totalscore = totalscore;
            // use default value if no "userfullname" provided
            this.Userfullname = userfullname ?? @"null";
            this.Userid = userid;
            this.Usermodified = usermodified;
            // use default value if no "usermodifiedfullname" provided
            this.Usermodifiedfullname = usermodifiedfullname ?? @"null";
            // use default value if no "usermodifiedpictureurl" provided
            this.Usermodifiedpictureurl = usermodifiedpictureurl ?? @"null";
            // use default value if no "userpictureurl" provided
            this.Userpictureurl = userpictureurl ?? @"null";
        }

        /// <summary>
        /// Has attachments?
        /// </summary>
        /// <value>Has attachments?</value>
        [DataMember(Name = "attachment", EmitDefaultValue = false)]
        public string Attachment { get; set; }

        /// <summary>
        /// Gets or Sets Attachments
        /// </summary>
        [DataMember(Name = "attachments", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Attachments { get; set; }

        /// <summary>
        /// Can the user star the discussion
        /// </summary>
        /// <value>Can the user star the discussion</value>
        [DataMember(Name = "canfavourite", EmitDefaultValue = true)]
        public bool Canfavourite { get; set; }

        /// <summary>
        /// Can the user lock the discussion
        /// </summary>
        /// <value>Can the user lock the discussion</value>
        [DataMember(Name = "canlock", EmitDefaultValue = true)]
        public bool Canlock { get; set; }

        /// <summary>
        /// Can the user reply to the discussion
        /// </summary>
        /// <value>Can the user reply to the discussion</value>
        [DataMember(Name = "canreply", EmitDefaultValue = true)]
        public bool Canreply { get; set; }

        /// <summary>
        /// Creation time
        /// </summary>
        /// <value>Creation time</value>
        [DataMember(Name = "created", EmitDefaultValue = false)]
        public int Created { get; set; }

        /// <summary>
        /// Discussion id
        /// </summary>
        /// <value>Discussion id</value>
        [DataMember(Name = "discussion", EmitDefaultValue = false)]
        public int Discussion { get; set; }

        /// <summary>
        /// Group id
        /// </summary>
        /// <value>Group id</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Post id
        /// </summary>
        /// <value>Post id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Is the discussion locked
        /// </summary>
        /// <value>Is the discussion locked</value>
        [DataMember(Name = "locked", EmitDefaultValue = true)]
        public bool Locked { get; set; }

        /// <summary>
        /// Mailed?
        /// </summary>
        /// <value>Mailed?</value>
        [DataMember(Name = "mailed", EmitDefaultValue = false)]
        public int Mailed { get; set; }

        /// <summary>
        /// Mail now?
        /// </summary>
        /// <value>Mail now?</value>
        [DataMember(Name = "mailnow", EmitDefaultValue = false)]
        public int Mailnow { get; set; }

        /// <summary>
        /// The post message
        /// </summary>
        /// <value>The post message</value>
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
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Messageinlinefiles { get; set; }

        /// <summary>
        /// Can we trust?
        /// </summary>
        /// <value>Can we trust?</value>
        [DataMember(Name = "messagetrust", EmitDefaultValue = false)]
        public int Messagetrust { get; set; }

        /// <summary>
        /// Time modified
        /// </summary>
        /// <value>Time modified</value>
        [DataMember(Name = "modified", EmitDefaultValue = false)]
        public int Modified { get; set; }

        /// <summary>
        /// Discussion name
        /// </summary>
        /// <value>Discussion name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The number of replies in the discussion
        /// </summary>
        /// <value>The number of replies in the discussion</value>
        [DataMember(Name = "numreplies", EmitDefaultValue = false)]
        public int Numreplies { get; set; }

        /// <summary>
        /// The number of unread discussions.
        /// </summary>
        /// <value>The number of unread discussions.</value>
        [DataMember(Name = "numunread", EmitDefaultValue = false)]
        public int Numunread { get; set; }

        /// <summary>
        /// Parent id
        /// </summary>
        /// <value>Parent id</value>
        [DataMember(Name = "parent", EmitDefaultValue = false)]
        public int Parent { get; set; }

        /// <summary>
        /// Is the discussion pinned
        /// </summary>
        /// <value>Is the discussion pinned</value>
        [DataMember(Name = "pinned", EmitDefaultValue = true)]
        public bool Pinned { get; set; }

        /// <summary>
        /// Is the discussion starred
        /// </summary>
        /// <value>Is the discussion starred</value>
        [DataMember(Name = "starred", EmitDefaultValue = true)]
        public bool Starred { get; set; }

        /// <summary>
        /// The post subject
        /// </summary>
        /// <value>The post subject</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Time discussion ends
        /// </summary>
        /// <value>Time discussion ends</value>
        [DataMember(Name = "timeend", EmitDefaultValue = false)]
        public int Timeend { get; set; }

        /// <summary>
        /// Time modified
        /// </summary>
        /// <value>Time modified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Time discussion can start
        /// </summary>
        /// <value>Time discussion can start</value>
        [DataMember(Name = "timestart", EmitDefaultValue = false)]
        public int Timestart { get; set; }

        /// <summary>
        /// The post message total score
        /// </summary>
        /// <value>The post message total score</value>
        [DataMember(Name = "totalscore", EmitDefaultValue = false)]
        public int Totalscore { get; set; }

        /// <summary>
        /// Post author full name
        /// </summary>
        /// <value>Post author full name</value>
        [DataMember(Name = "userfullname", EmitDefaultValue = false)]
        public string Userfullname { get; set; }

        /// <summary>
        /// User who started the discussion id
        /// </summary>
        /// <value>User who started the discussion id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// The id of the user who last modified
        /// </summary>
        /// <value>The id of the user who last modified</value>
        [DataMember(Name = "usermodified", EmitDefaultValue = false)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Post modifier full name
        /// </summary>
        /// <value>Post modifier full name</value>
        [DataMember(Name = "usermodifiedfullname", EmitDefaultValue = false)]
        public string Usermodifiedfullname { get; set; }

        /// <summary>
        /// Post modifier picture.
        /// </summary>
        /// <value>Post modifier picture.</value>
        [DataMember(Name = "usermodifiedpictureurl", EmitDefaultValue = false)]
        public string Usermodifiedpictureurl { get; set; }

        /// <summary>
        /// Post author picture.
        /// </summary>
        /// <value>Post author picture.</value>
        [DataMember(Name = "userpictureurl", EmitDefaultValue = false)]
        public string Userpictureurl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetForumDiscussions200ResponseDiscussionsInner {\n");
            sb.Append("  Attachment: ").Append(Attachment).Append("\n");
            sb.Append("  Attachments: ").Append(Attachments).Append("\n");
            sb.Append("  Canfavourite: ").Append(Canfavourite).Append("\n");
            sb.Append("  Canlock: ").Append(Canlock).Append("\n");
            sb.Append("  Canreply: ").Append(Canreply).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Discussion: ").Append(Discussion).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Locked: ").Append(Locked).Append("\n");
            sb.Append("  Mailed: ").Append(Mailed).Append("\n");
            sb.Append("  Mailnow: ").Append(Mailnow).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Messageformat: ").Append(Messageformat).Append("\n");
            sb.Append("  Messageinlinefiles: ").Append(Messageinlinefiles).Append("\n");
            sb.Append("  Messagetrust: ").Append(Messagetrust).Append("\n");
            sb.Append("  Modified: ").Append(Modified).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Numreplies: ").Append(Numreplies).Append("\n");
            sb.Append("  Numunread: ").Append(Numunread).Append("\n");
            sb.Append("  Parent: ").Append(Parent).Append("\n");
            sb.Append("  Pinned: ").Append(Pinned).Append("\n");
            sb.Append("  Starred: ").Append(Starred).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Timeend: ").Append(Timeend).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Timestart: ").Append(Timestart).Append("\n");
            sb.Append("  Totalscore: ").Append(Totalscore).Append("\n");
            sb.Append("  Userfullname: ").Append(Userfullname).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
            sb.Append("  Usermodifiedfullname: ").Append(Usermodifiedfullname).Append("\n");
            sb.Append("  Usermodifiedpictureurl: ").Append(Usermodifiedpictureurl).Append("\n");
            sb.Append("  Userpictureurl: ").Append(Userpictureurl).Append("\n");
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
