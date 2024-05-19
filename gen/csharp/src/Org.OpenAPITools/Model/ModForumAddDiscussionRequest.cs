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
    /// ModForumAddDiscussionRequest
    /// </summary>
    [DataContract(Name = "mod_forum_add_discussion_request")]
    public partial class ModForumAddDiscussionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumAddDiscussionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumAddDiscussionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumAddDiscussionRequest" /> class.
        /// </summary>
        /// <param name="forumid">Forum instance ID (required) (default to null).</param>
        /// <param name="groupid">The group, default to 0 (default to 0).</param>
        /// <param name="message">New Discussion message (only html format allowed) (required) (default to &quot;null&quot;).</param>
        /// <param name="options">options.</param>
        /// <param name="subject">New Discussion subject (required) (default to &quot;null&quot;).</param>
        public ModForumAddDiscussionRequest(int forumid = null, int groupid = 0, string message = @"null", List<ModForumAddDiscussionRequestOptionsInner> options = default(List<ModForumAddDiscussionRequestOptionsInner>), string subject = @"null")
        {
            this.Forumid = forumid;
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for ModForumAddDiscussionRequest and cannot be null");
            }
            this.Message = message;
            // to ensure "subject" is required (not null)
            if (subject == null)
            {
                throw new ArgumentNullException("subject is a required property for ModForumAddDiscussionRequest and cannot be null");
            }
            this.Subject = subject;
            this.Groupid = groupid;
            this.Options = options;
        }

        /// <summary>
        /// Forum instance ID
        /// </summary>
        /// <value>Forum instance ID</value>
        [DataMember(Name = "forumid", IsRequired = true, EmitDefaultValue = true)]
        public int Forumid { get; set; }

        /// <summary>
        /// The group, default to 0
        /// </summary>
        /// <value>The group, default to 0</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// New Discussion message (only html format allowed)
        /// </summary>
        /// <value>New Discussion message (only html format allowed)</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public List<ModForumAddDiscussionRequestOptionsInner> Options { get; set; }

        /// <summary>
        /// New Discussion subject
        /// </summary>
        /// <value>New Discussion subject</value>
        [DataMember(Name = "subject", IsRequired = true, EmitDefaultValue = true)]
        public string Subject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumAddDiscussionRequest {\n");
            sb.Append("  Forumid: ").Append(Forumid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
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
